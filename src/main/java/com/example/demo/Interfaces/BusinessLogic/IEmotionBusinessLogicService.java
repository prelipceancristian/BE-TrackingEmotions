package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.DTOs.EmotionDTO;
import com.example.demo.Domain.DTOs.EmotionDescriptionDTO;
import com.example.demo.Domain.Emotion;

import java.util.List;

public interface IEmotionBusinessLogicService {
    EmotionDescriptionDTO RetrieveEmotions(int emotionCategoryID);

    Emotion SearchEmotion(int id);

    void CreateEmotion(String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void UpdateEmotion(int id, String emotionName, int emotionCategoryID, int emotionDescriptionID);

    void DeleteEmotion(int id);
}
