package com.example.demo.DataAccess;

import com.example.demo.Domain.Description;
import com.example.demo.Domain.Emotion;
import com.example.demo.Interfaces.DataAccess.IDescriptionDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DescriptionDataAccessService implements IDescriptionDataAccessService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DescriptionDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Description> RetrieveDescriptions() {
        String query = "SELECT * FROM Description";
        List<Description> descriptions = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Description.class));
        return descriptions;
    }

    @Override
    public Description SearchDescription(int descriptionID) {
        String query = "SELECT * FROM Description WHERE DescriptionID = " + String.valueOf(descriptionID);
        Description description = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Description.class)).stream().findFirst().orElse(null);
        return description;
    }

    @Override
    public void CreateDescription(String text) {
        String query = "INSERT INTO Description(Text) VALUES ('" + text +"')";
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateDescription(int descriptionID, String text) {
        String query = String.format("UPDATE Description SET Text = '%s' WHERE DescriptionID = %s",
                text, descriptionID);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteDescription(int descriptionID) {
        String query = String.format("DELETE FROM Description where DescriptionID = %s",
                descriptionID);
        jdbcTemplate.update(query);
    }
}
