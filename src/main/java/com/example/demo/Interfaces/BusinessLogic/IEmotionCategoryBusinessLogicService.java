package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.DTOs.EmotionCategoryDTO;
import com.example.demo.Domain.EmotionCategory;

import java.util.List;

public interface IEmotionCategoryBusinessLogicService {
    List<EmotionCategory> RetrieveEmotionCategory();

    EmotionCategory SearchEmotionCategory(int id);

    void CreateEmotionCategory(String emotionCategoryName, int ValenceID, int emotionDescriptionID);

    void UpdateEmotionCategory(int id, String emotionCategoryName, int ValenceID, int emotionDescriptionID);

    void DeleteEmotionCategory(int id);

    EmotionCategoryDTO RetrieveEmotionCategoriesForValence(int valence);
}
