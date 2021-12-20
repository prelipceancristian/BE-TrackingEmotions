package com.example.demo.DataAccess;
import com.example.demo.Domain.Emotion;
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
        String query = "SELECT * FROM EmotionCategory WHERE EmotionCategoryID="+ String.valueOf(id);
        EmotionCategory emotionCategory = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(EmotionCategory.class)).stream().findFirst().orElse(null);
        return emotionCategory;
    }

    @Override
    public void CreateEmotionCategory(String emotionCategoryName, int ValenceID, int emotionDescriptionID) {
        String query = String.format("INSERT INTO EmotionCategory ([Name], ValenceID, DescriptionID) VALUES ('%s', %s, %s)",
                emotionCategoryName,
                ValenceID,
                emotionDescriptionID);
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateEmotionCategory(int emotionCategoryID, String emotionCategoryName, int ValenceID, int emotionDescriptionID) {
        String query = String.format("UPDATE EmotionCategory SET " +
                        "[Name] = '%s'," +
                        "ValenceID = %s," +
                        "DescriptionID = %s " +
                        "where emotionCategoryID = %s",
                emotionCategoryName,
                ValenceID,
                emotionDescriptionID,
                emotionCategoryID);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteEmotionCategory(int id) {
        String query = String.format("DELETE FROM Category WHERE EmotionCategoryID = %s", id);
        jdbcTemplate.update(query);
    }

    @Override
    public List<EmotionCategory> RetrieveEmotionCategoriesForValence(int valence) {
        String query = String.format("SELECT * FROM EmotionCategory where ValenceID = %s", valence);
        List<EmotionCategory> emotionCategoryList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(EmotionCategory.class));
        return emotionCategoryList;
    }
}
