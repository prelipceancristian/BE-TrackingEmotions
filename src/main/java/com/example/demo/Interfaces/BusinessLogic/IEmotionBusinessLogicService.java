package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.DTOs.EmotionDTO;
import com.example.demo.Domain.Emotion;

import java.util.List;

public interface IEmotionBusinessLogicService {
    EmotionDTO RetrieveEmotions();

    Emotion SearchEmotion(int id);

    void CreateEmotion(String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void UpdateEmotion(int id, String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void DeleteEmotion(int id);
}
