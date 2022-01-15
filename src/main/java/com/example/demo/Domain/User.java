package com.example.demo.Domain;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class User {

    private int UserId;
    private String FirstName;
    private String LastName;
    private Date BirthDate;
    private String Username;
    private String Password;
    private String Gender;
    private String Email;


    public int getUserId() {
        return UserId;
    } //getter

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public String getUsername() {
        return Username;
    }

    @JsonIgnore
    public String getPassword() {
        return Password;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }


    public void setUserId(int UserId) {
        this.UserId = UserId;
    } //setter

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", FirstNameUser='" + FirstName + '\'' +
                ", LastNameUser='" + LastName + '\'' +
                ", BirthDateUser='" + BirthDate + '\'' +
                ", Username='" + Username + '\'' +
                ", PasswordUser='" + Password + '\'' +
                ", GenderUser='" + Gender + '\'' +
                ", EmailUser='" + Email + '\'' +
                '}';
    }

    //hash function
    public static String getMd5(String input) {
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            // of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}

