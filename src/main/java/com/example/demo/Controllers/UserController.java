package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.UserBusinessLogicService;
import com.example.demo.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
    private UserBusinessLogicService UserBusinessLogicService;

    @Autowired
    public UserController(UserBusinessLogicService UserBusinessLogicService) {
        this.UserBusinessLogicService = UserBusinessLogicService;
    }

    @GetMapping
    public List<User> RetrieveUser() {
        return UserBusinessLogicService.RetrieveUser();
    }

    @GetMapping("/{id}")
    public User SearchUser(@PathVariable int id) {
        return UserBusinessLogicService.SearchUser(id);
    }

    @PostMapping
    public void CreateUser(@RequestParam String FirstName, @RequestParam String LastName, @RequestParam String BirthDate, @RequestParam String Username, @RequestParam String Password, @RequestParam String Gender, @RequestParam String Email) {
       UserBusinessLogicService.CreateUser(FirstName, LastName, BirthDate, Username, Password, Gender, Email);
    }

    @GetMapping("/login")
    public User Login(@RequestParam String Username, @RequestParam String Password) {
        return UserBusinessLogicService.Login(Username, Password);
    }

    @PostMapping("/socialLogin")
    public void SocialLogin(@RequestParam int UserId, @RequestParam String FirstName, @RequestParam String Email) {
        UserBusinessLogicService.LoginWithSocial(UserId, FirstName, Email);
    }

    @PutMapping
    public void UpdateUser(@RequestParam int UserID, @RequestParam String FirstName, @RequestParam String LastName, @RequestParam String BirthDate, @RequestParam String Username, @RequestParam String Password, @RequestParam String Gender, @RequestParam String Email) {
        UserBusinessLogicService.UpdateUser(UserID, FirstName, LastName, BirthDate, Username, Password, Gender, Email);
    }

    @DeleteMapping
    public void DeleteUser(@RequestParam int UserID) {
        UserBusinessLogicService.DeleteUser(UserID);
    }

}
