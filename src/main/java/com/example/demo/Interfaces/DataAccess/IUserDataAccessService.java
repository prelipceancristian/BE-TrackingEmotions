package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.User;

import java.util.Date;
import java.util.List;

public interface IUserDataAccessService {
    List<User> RetrieveUser();

    User SearchUser(int id);

    void CreateUser(String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email);

    void UpdateUser(int UserID, String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email);

    User Login(String Username, String Password);

    void CreateUserWithSocial(int UserId, String FirstName, String Email);

    void DeleteUser(int id);
}
