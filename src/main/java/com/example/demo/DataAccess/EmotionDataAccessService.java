package com.example.demo.DataAccess;

import com.example.demo.Domain.Emotion;
import com.example.demo.Interfaces.DataAccess.IEmotionDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmotionDataAccessService implements IEmotionDataAccessService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmotionDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Emotion> RetrieveEmotions() {
        String query = "SELECT * FROM Emotion";
        List<Emotion> emotionList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Emotion.class));
        return emotionList;
    }

    @Override
    public Emotion SearchEmotion(int id) {
        String query = "SELECT * FROM Emotion WHERE EmotionID = " + String.valueOf(id);
        Emotion emotion = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Emotion.class)).stream().findFirst().orElse(null);
        return emotion;
    }

    @Override
    public void CreateEmotion(String emotionName, int emotionCategoryID, int emotionDescriptionID) {
        String query = String.format("INSERT INTO Emotion ([Name], EmotionCategoryID, DescriptionID) VALUES ('%s', %s, %s)",
                emotionName,
                emotionCategoryID,
                emotionDescriptionID);
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateEmotion(int emotionId, String emotionName, int emotionCategoryID, int emotionDescriptionID) {
        String query = String.format("UPDATE Emotion SET " +
                        "[Name] = '%s'," +
                        "EmotionCategoryID = %s," +
                        "DescriptionID = %s " +
                        "where emotionID = %s",
                emotionName,
                emotionCategoryID,
                emotionDescriptionID,
                emotionId);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteEmotion(int id) {
        String query = String.format("DELETE FROM Emotion WHERE EmotionID = %s", id);
        jdbcTemplate.update(query);
    }
}
