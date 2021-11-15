package com.example.demo.Domain;

public class EmotionCategory {
        int EmotionCategoryID;
        String Name;
        int ValenceID;
        int DescriptionID;

        @Override
        public String toString() {
            return "EmotionCategory{" +
                    "EmotionCategoryID=" + EmotionCategoryID +
                    ", Name='" + Name + '\'' +
                    ", ValenceID=" + ValenceID +
                    ", DescriptionID=" + DescriptionID +
                    '}';
        }

    public int getEmotionCategoryID() {
        return EmotionCategoryID;
    }

    public void setEmotionCategoryID(int emotionCategoryID) {
        EmotionCategoryID = emotionCategoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getValenceID() {
        return ValenceID;
    }

    public void setValenceID(int valenceID) {
        ValenceID = valenceID;
    }

    public int getDescriptionID() {
        return DescriptionID;
    }

    public void setDescriptionID(int descriptionID) {
        DescriptionID = descriptionID;
    }
}
