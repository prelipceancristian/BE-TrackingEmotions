package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.DTOs.EmotionWithDescription;
import com.example.demo.Domain.Emotion;

import java.util.List;

public interface IEmotionDataAccessService {
    List<EmotionWithDescription> RetrieveEmotions(int emotionCategoryID);

    Emotion SearchEmotion(int id);

    void CreateEmotion(String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void UpdateEmotion(int emotionID, String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void DeleteEmotion(int id);
}
