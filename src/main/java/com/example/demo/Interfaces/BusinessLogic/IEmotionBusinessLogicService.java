package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.Emotion;

import java.util.List;

public interface IEmotionBusinessLogicService {
    List<Emotion> RetrieveEmotions();
    Emotion SearchEmotion(int id);
    void CreateEmotion(String emotionName, int idCategory);
    void UpdateEmotion(int id, String emotionName, int idCategory);
    void DeleteEmotion(int id);
}
