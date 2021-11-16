package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.EmotionCategory;

import java.util.List;

public interface IEmotionCategoryDataAccessService {
    List<EmotionCategory> RetrieveEmotionCategory();

    EmotionCategory SearchEmotionCategory(int id);

    void CreateEmotionCategory(String emotionCategoryName, int ValenceID, int emotionDescriptionID);

    void UpdateEmotionCategory(int emotionCategoryID, String emotionCategoryName, int ValenceID, int emotionDescriptionID);

    void DeleteEmotionCategory(int id);
}
