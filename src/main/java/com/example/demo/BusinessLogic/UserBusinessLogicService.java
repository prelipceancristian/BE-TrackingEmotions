package com.example.demo.BusinessLogic;
import com.example.demo.DataAccess.EmotionDataAccessService;
import com.example.demo.DataAccess.UserDataAccessService;
import com.example.demo.Domain.EmotionCategory;
import com.example.demo.Domain.User;
import com.example.demo.Interfaces.BusinessLogic.IUserBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserBusinessLogicService implements IUserBusinessLogicService{

    private UserDataAccessService UserDataAccessService;

    @Autowired
    public UserBusinessLogicService(UserDataAccessService UserDataAccessService) {
        this.UserDataAccessService = UserDataAccessService;
    }

    @Override
    public List<User> RetrieveUser() {
        List<User> UserList = UserDataAccessService.RetrieveUser();
        return UserList;
    }

    @Override
    public User SearchUser(int id) {
        return UserDataAccessService.SearchUser(id);
    }
    @Override
    public void CreateUser(String FirstName, String LastName, Date BirthDate, String Username, String Password, String Gender, String Email) {
        //TODO: check if BirthDate is valid
        UserDataAccessService.CreateUser(FirstName, LastName, BirthDate, Username, Password, Gender, Email);
    }

    @Override
    public void UpdateUser(int Userid, String FirstName, String LastName, Date BirthDate, String Username, String Password, String Gender, String Email) {
        //TODO: check if Userid and BirthDate are valid
        UserDataAccessService.UpdateUser(Userid, FirstName, LastName, BirthDate, Username,Password, Gender, Email);
    }

    @Override
    public void DeleteUser(int id) {
        UserDataAccessService.DeleteUser(id);
    }
}
