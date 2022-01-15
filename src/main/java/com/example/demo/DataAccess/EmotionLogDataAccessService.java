package com.example.demo.DataAccess;

import com.example.demo.Domain.DTOs.EmotionLogWithDescriptions;
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
    public List<EmotionLog> RetrieveEmotionLogsByUserID(int userID, String startDate, String endDate, int environmentID1, int environmentID2, int typeID) {

        StringBuilder str = new StringBuilder("SELECT * FROM EmotionLog");
        if(typeID != -1){
            str.append(" INNER JOIN Emotion on EmotionLog.EmotionID = Emotion.EmotionID");
        }
        String userQuery = String.format(" WHERE UserID = %s", userID);
        str.append(userQuery);
        if(!startDate.isEmpty() && !endDate.isEmpty()){
            String dateQuery = String.format(" AND (Date BETWEEN '%s' AND '%s')", startDate, endDate);
            str.append(dateQuery);
        }
        if(environmentID1 != -1){
            String environmentQuery = String.format(" AND SocialEnvironmentID1 = %s", String.valueOf(environmentID1));
            str.append(environmentQuery);
        }
        if(environmentID2 != -1){
            String environmentQuery = String.format(" AND SocialEnvironmentID2 = %s", String.valueOf(environmentID2));
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
    public void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID1, int socialEnvironmentID2, String date) {
        String query = String.format("INSERT INTO EmotionLog (EmotionID, UserID, SocialEnvironmentID1, SocialEnvironmentID2, [Date]) VALUES (%s, %s, %s, %s, '%s')",
                emotionID,
                userID,
                socialEnvironmentID1,
                socialEnvironmentID2,
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

    @Override
    public List<EmotionLogWithDescriptions> RetrieveEmotionLogsDescriptors(int userID) {
        String query = String.format(
                "select el.EmotionLogID as EmotionLogID, el.[Date] as [Date], em.[Name] as EmotionName, descr.Text as EmotionDescription, se1.Relation as SocialEnvironment1, se2.Relation as SocialEnvironment2 \n" +
                "from EmotionLog as el \n" +
                "inner join Emotion as em on el.EmotionID = em.EmotionID\n" +
                "inner join [Description] as descr on el.EmotionID = descr.DescriptionID\n" +
                "inner join SocialEnvironment as se1 on el.SocialEnvironmentID1 = se1.SocialEnvironmentID\n" +
                "inner join SocialEnvironment as se2 on el.SocialEnvironmentID2 = se2.SocialEnvironmentID\n" +
                "inner join [User] as us on el.UserID = us.UserID\n" +
                "where us.UserID = %s", userID);
        List<EmotionLogWithDescriptions> emotionLogs = jdbcTemplate.query(query.toString(), BeanPropertyRowMapper.newInstance(EmotionLogWithDescriptions.class));
        return emotionLogs;
    }
}
