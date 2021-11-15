package com.example.demo.DataAccess;
import com.example.demo.Domain.Description;
import com.example.demo.Domain.EmotionCategory;
import com.example.demo.Interfaces.DataAccess.IDescriptionDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DescriptionDataAccessService implements IDescriptionDataAccessService{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DescriptionDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Description> RetrieveDescription() {
        String query = "SELECT * FROM Description";
        List<Description> DescriptionList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Description.class));
        return DescriptionList;
    }

    @Override
    public Description SearchDescription(int id) {
        return null;
    }

    @Override
    public void CreateDescription(int DescriptionID, String Text) {

    }

    @Override
    public void UpdateDescription(int DescriptionID, String Text) {

    }

    @Override
    public void DeleteDescription(int id) {

    }
}
