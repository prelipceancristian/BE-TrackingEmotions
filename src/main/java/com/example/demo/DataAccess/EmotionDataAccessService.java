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
        String query = "SELECT * FROM Emotions";
        List<Emotion> emotionList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Emotion.class));
        return emotionList;
    }

    @Override
    public Emotion SearchEmotion(int id) {
        return null;
    }

    @Override
    public void CreateEmotion(Emotion emotion) {

    }

    @Override
    public void UpdateEmotion(Emotion emotion) {

    }

    @Override
    public void DeleteEmotion(int id) {

    }
}
