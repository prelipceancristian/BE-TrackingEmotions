package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.User;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface IUserBusinessLogicService {
    List<User> RetrieveUser();

    User SearchUser(int id);

    void CreateUser(String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email);

    void UpdateUser(int Userid, String FirstName, String LastName, String BirthDate, String Username, String Password, String Gender, String Email);

    User Login(String Username, String Password);

    void LoginWithSocial(BigInteger UserId, String FirstName, String Email);

    void DeleteUser(int id);
}
