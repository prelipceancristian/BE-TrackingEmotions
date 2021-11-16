package com.example.demo.DataAccess;
import com.example.demo.Domain.EmotionCategory;
import com.example.demo.Interfaces.DataAccess.IEmotionCategoryDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmotionCategoryDataAccessService implements IEmotionCategoryDataAccessService{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmotionCategoryDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmotionCategory> RetrieveEmotionCategory() {
        String query = "SELECT * FROM EmotionCategory";
        List<EmotionCategory> emotionCategoryList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(EmotionCategory.class));
        return emotionCategoryList;
    }

    @Override
    public EmotionCategory SearchEmotionCategory(int id) {
        return null;
    }

    @Override
    public void CreateEmotionCategory(String emotionCategoryName, int ValenceID, int emotionDescriptionID) {

    }

    @Override
    public void UpdateEmotionCategory(int emotionCategoryID, String emotionCategoryName, int ValenceID, int emotionDescriptionID) {

    }

    @Override
    public void DeleteEmotionCategory(int id) {

    }
}
