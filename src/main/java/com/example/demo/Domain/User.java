package com.example.demo.Domain;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

    private int userId;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String username;
    private String password;
    private String gender;

    public int getUserId() { return userId; } //getter
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getUsername(){ return username; }
    public String getPassword(){ return password; }
    public String getGender(){ return gender; }

    public void setUserId(int userId) { this.userId = userId; } //setter
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setEmail(String email) { this.email = email; }
    public void setAge(int age) { this.age = age; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", nameUser='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailUser='" + email + '\'' +
                ", ageUser=" + age +
                ", username='" + username + '\'' +
                ", passwordUser='" + password + '\'' +
                ", genderUser='" + gender + '\'' +
                '}';
    }

    //hash function
    public static String getMd5(String input)
    {
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

