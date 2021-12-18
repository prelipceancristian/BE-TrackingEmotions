package com.example.demo.Domain;

public class EmotionLog {
    int EmotionLogID;
    int EmotionID;
    int UserID;
    int SocialEnvironmentID;
    String Date;

    @Override
    public String toString() {
        return "EmotionLog{" +
                "EmotionLogID=" + EmotionLogID +
                ", EmotionID=" + EmotionID +
                ", UserID=" + UserID +
                ", SocialEnvironmentID=" + SocialEnvironmentID +
                ", Date='" + Date + '\'' +
                '}';
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

    public int getSocialEnvironmentID() {
        return SocialEnvironmentID;
    }

    public void setSocialEnvironmentID(int socialEnvironmentID) {
        SocialEnvironmentID = socialEnvironmentID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
