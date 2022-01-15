package com.example.demo.DataAccess;

import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.SocialEnvironment;
import com.example.demo.Interfaces.DataAccess.ISocialEnvironmentDataAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SocialEnvironmentDataAccessService implements ISocialEnvironmentDataAccess {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public SocialEnvironmentDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<SocialEnvironment> RetrieveSocialEnvironments() {
        String query = "SELECT * FROM SocialEnvironment";
        List<SocialEnvironment> socialEnvironments = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(SocialEnvironment.class));
        return socialEnvironments;
    }



    @Override
    public SocialEnvironment SearchSocialEnvironment(int SocialEnvironmentID) {
        String query = "SELECT * FROM SocialEnvironment WHERE SocialEnvironmentID = " + String.valueOf(SocialEnvironmentID);
        SocialEnvironment socialEnvironment = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(SocialEnvironment.class)).stream().findFirst().orElse(null);
        return socialEnvironment;
    }

    @Override
    public List<SocialEnvironment> RetrieveLocations() {
        String query = "SELECT * FROM SocialEnvironment Where IsLocation = 1";
        List<SocialEnvironment> socialEnvironments = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(SocialEnvironment.class));
        return socialEnvironments;
    }

    @Override
    public List<SocialEnvironment> RetrievePeople() {
        String query = "SELECT * FROM SocialEnvironment Where IsLocation = 0";
        List<SocialEnvironment> socialEnvironments = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(SocialEnvironment.class));
        return socialEnvironments;
    }

    @Override
    public void CreateSocialEnvironment(String relation, boolean isLocation) {
        String query = String.format("INSERT INTO SocialEnvironment (Relation, IsLocation) VALUES ('%s', %s)",
                relation,
                isLocation ? "1" : "0");
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateSocialEnvironment(int SocialEnvironmentID, String relation, boolean isLocation) {
        String query = String.format("UPDATE SocialEnvironment SET " +
                        "Relation = '%s'," +
                        "IsLocation = %s " +
                        "WHERE SocialEnvironmentID = %s",
                relation,
                isLocation ? "1" : "0",
                SocialEnvironmentID);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteSocialEnvironment(int SocialEnvironmentID) {
        String query = String.format("DELETE FROM SocialEnvironment WHERE SocialEnvironmentID = %s", SocialEnvironmentID);
        jdbcTemplate.update(query);
    }
}
