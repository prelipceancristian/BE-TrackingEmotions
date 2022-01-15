package com.example.demo.Domain.DTOs;

import com.example.demo.Domain.Emotion;

public class EmotionWithDescription extends Emotion{
    protected int EmotionID;
    protected String Name;
    protected int EmotionCategoryID;
    protected int DescriptionID;
    String Text;

    @Override
    public int getEmotionID() {
        return EmotionID;
    }

    @Override
    public void setEmotionID(int emotionID) {
        EmotionID = emotionID;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public int getEmotionCategoryID() {
        return EmotionCategoryID;
    }

    @Override
    public void setEmotionCategoryID(int emotionCategoryID) {
        EmotionCategoryID = emotionCategoryID;
    }

    @Override
    public int getDescriptionID() {
        return DescriptionID;
    }

    @Override
    public void setDescriptionID(int descriptionID) {
        DescriptionID = descriptionID;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
