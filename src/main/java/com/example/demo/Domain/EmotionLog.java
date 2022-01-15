package com.example.demo.Domain;

public class EmotionLog {
    int EmotionLogID;
    int EmotionID;
    int UserID;
    int SocialEnvironmentID1;
    int SocialEnvironmentID2;
    String Date;

    public int getSocialEnvironmentID1() {
        return SocialEnvironmentID1;
    }

    public void setSocialEnvironmentID1(int socialEnvironmentID1) {
        SocialEnvironmentID1 = socialEnvironmentID1;
    }

    public int getSocialEnvironmentID2() {
        return SocialEnvironmentID2;
    }

    public void setSocialEnvironmentID2(int socialEnvironmentID2) {
        SocialEnvironmentID2 = socialEnvironmentID2;
    }

    public int getEmotionLogID() {
        return EmotionLogID;
    }

    public void setEmotionLogID(int emotionLogID) {
        EmotionLogID = emotionLogID;
    }

    public int getEmotionID() {
        return EmotionID;
    }

    public void setEmotionID(int emotionID) {
        EmotionID = emotionID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
