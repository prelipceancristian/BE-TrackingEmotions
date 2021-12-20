package com.example.demo.DataAccess;

import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionLog;
import com.example.demo.Interfaces.DataAccess.IEmotionLogDataAccessService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmotionLogDataAccessService implements IEmotionLogDataAccessService {

    JdbcTemplate jdbcTemplate;

    public EmotionLogDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmotionLog> RetrieveEmotionLogsByUserID(int userID, String startDate, String endDate, int environmentID, int typeID) {

        StringBuilder str = new StringBuilder("SELECT * FROM EmotionLog");
        if(typeID != -1){
            str.append(" INNER JOIN Emotion on EmotionLog.EmotionID = Emotion.EmotionID");
        }
        String userQuery = String.format(" WHERE UserID = %s", userID);
        str.append(userQuery);
        if(!startDate.isEmpty() && !startDate.isEmpty()){
            String dateQuery = String.format(" AND (Date BETWEEN '%s' AND '%s')", startDate, endDate);
            str.append(dateQuery);
        }
        if(environmentID != -1){
            String environmentQuery = String.format(" AND SocialEnvironmentID = %s", String.valueOf(environmentID));
            str.append(environmentQuery);
        }
        List<EmotionLog> emotionLogs = jdbcTemplate.query(str.toString(), BeanPropertyRowMapper.newInstance(EmotionLog.class));
        return emotionLogs;
    }

    @Override
    public EmotionLog SearchEmotionLogByLogID(int emotionLogID) {
        String query = "SELECT * FROM EmotionLog WHERE EmotionLogID = " + String.valueOf(emotionLogID);
        EmotionLog emotionLog = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(EmotionLog.class)).stream().findFirst().orElse(null);
        return emotionLog;
    }

    @Override
    public void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID, String date) {
        String query = String.format("INSERT INTO EmotionLog (EmotionID, UserID, SocialEnvironmentID, [Date]) VALUES (%s, %s, %s, '%s')",
                emotionID,
                userID,
                socialEnvironmentID,
                date);
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date) {
        String query = String.format("UPDATE EmotionLog SET " +
                        "EmotionID = %s," +
                        "UserID = %s," +
                        "SocialEnvironmentID = %s, " +
                        "Date = '%s' " +
                        "where emotionLogID = %s",
                emotionID,
                userID,
                socialEnvironmentID,
                date,
                emotionLogID);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteEmotionLog(int emotionLogID) {
        String query = String.format("DELETE FROM EmotionLog WHERE EmotionLogID = %s", emotionLogID);
        jdbcTemplate.update(query);
    }
}
