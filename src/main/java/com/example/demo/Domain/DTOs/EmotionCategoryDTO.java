package com.example.demo.Domain.DTOs;

import com.example.demo.Domain.EmotionCategory;

import java.util.List;

public class EmotionCategoryDTO {
    public List<EmotionCategory> emotionCategoryList;
    public int errorCode;

    public EmotionCategoryDTO(List<EmotionCategory> emotionCategoryList, int errorCode) {
        this.emotionCategoryList = emotionCategoryList;
        this.errorCode = errorCode;
    }
}
