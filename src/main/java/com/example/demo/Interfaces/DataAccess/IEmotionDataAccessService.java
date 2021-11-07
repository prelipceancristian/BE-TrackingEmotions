package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.Emotion;

import java.util.List;

public interface IEmotionDataAccessService {
    List<Emotion> RetrieveEmotions();
    Emotion SearchEmotion(int id);
    void CreateEmotion(Emotion emotion);
    void UpdateEmotion(Emotion emotion);
    void DeleteEmotion(int id);
}
