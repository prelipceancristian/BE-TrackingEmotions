package com.example.demo.Domain.DTOs;

public class EmotionLogWithDescriptions {
    int EmotionLogID;
    String Date;
    String EmotionName;
    String EmotionDescription;
    String SocialEnvironment1;
    String SocialEnvironment2;

    public int getEmotionLogID() {
        return EmotionLogID;
    }

    public void setEmotionLogID(int emotionLogID) {
        EmotionLogID = emotionLogID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getEmotionName() {
        return EmotionName;
    }

    public void setEmotionName(String emotionName) {
        EmotionName = emotionName;
    }

    public String getEmotionDescription() {
        return EmotionDescription;
    }

    public void setEmotionDescription(String emotionDescription) {
        EmotionDescription = emotionDescription;
    }

    public String getSocialEnvironment1() {
        return SocialEnvironment1;
    }

    public void setSocialEnvironment1(String socialEnvironment1) {
        SocialEnvironment1 = socialEnvironment1;
    }

    public String getSocialEnvironment2() {
        return SocialEnvironment2;
    }

    public void setSocialEnvironment2(String socialEnvironment2) {
        SocialEnvironment2 = socialEnvironment2;
    }

    @Override
    public String toString() {
        return "EmotionLogWithDescriptions{" +
                "EmotionLogID=" + EmotionLogID +
                ", Date='" + Date + '\'' +
                ", EmotionName='" + EmotionName + '\'' +
                ", EmotionDescription='" + EmotionDescription + '\'' +
                ", SocialEnvironment1='" + SocialEnvironment1 + '\'' +
                ", SocialEnvironment2='" + SocialEnvironment2 + '\'' +
                '}';
    }
}
