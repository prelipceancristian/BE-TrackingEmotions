package com.example.demo.DataAccess;
import com.example.demo.Domain.User;
import com.example.demo.Interfaces.DataAccess.IUserDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class UserDataAccessService implements IUserDataAccessService{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> RetrieveUser() {
        String query = "SELECT * FROM [dbo].[User]";
        List<User> UserList = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(User.class));
        return UserList;
    }

    @Override
    public User SearchUser(int id) {
        String query = "SELECT * FROM [dbo].[User] WHERE UserID = " + String.valueOf(id);
        User user = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(User.class)).stream().findFirst().orElse(null);
        return user;
    }

    @Override
    public void CreateUser(String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email) {
        String query = String.format("INSERT INTO [dbo].[User] ([FirstName], [LastName], [BirthDate], [Username], [Password], [Gender], [Email]) VALUES ('%s', %s, %s, '%s', %s, %s, %s)",
                FirstName,
                LastName,
                BirthDate,
                Username,
                Password,
                Gender,
                Email);
        jdbcTemplate.update(query);
    }

    @Override
    public void UpdateUser(int UserID, String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email) {
        String query = String.format("UPDATE User SET " +
                        "[FirstName] = '%s'," +
                        "[LastName] = %s," +
                        "[BirthDate] = %s " +
                        "[Username] = %s " +
                        "[Password] = %s " +
                        "[Gender] = %s " +
                        "[Email] = %s " +
                        "where UserID = %s",
                FirstName,
                LastName,
                BirthDate,
                Username,
                Password,
                Gender,
                Email);
        jdbcTemplate.update(query);
    }

    @Override
    public void DeleteUser(int id) {
        String query = String.format("DELETE FROM [dbo].[User] WHERE UserID = %s", id);
        jdbcTemplate.update(query);
    }
}
