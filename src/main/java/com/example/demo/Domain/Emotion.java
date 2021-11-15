package com.example.demo.Domain;

public class Emotion {
    int EmotionID;
    String Name;
    int EmotionCategoryID;
    int DescriptionID;

    @Override
    public String toString() {
        return "Emotion{" +
                "EmotionID=" + EmotionID +
                ", Name='" + Name + '\'' +
                ", EmotionCategoryID=" + EmotionCategoryID +
                ", DescriptionID=" + DescriptionID +
                '}';
    }

    public int getEmotionID() {
        return EmotionID;
    }

    public void setEmotionID(int emotionID) {
        EmotionID = emotionID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getEmotionCategoryID() {
        return EmotionCategoryID;
    }

    public void setEmotionCategoryID(int emotionCategoryID) {
        EmotionCategoryID = emotionCategoryID;
    }

    public int getDescriptionID() {
        return DescriptionID;
    }

    public void setDescriptionID(int descriptionID) {
        DescriptionID = descriptionID;
    }
}
