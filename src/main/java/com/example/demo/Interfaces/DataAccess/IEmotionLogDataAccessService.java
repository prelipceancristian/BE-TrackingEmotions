package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionLog;

import java.util.List;

public interface IEmotionLogDataAccessService {
    List<EmotionLog> RetrieveEmotionLogsByUserID(int userID);
    EmotionLog SearchEmotionLogByLogID(int emotionLogID);
    void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID, String date);
    void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date);
    void DeleteEmotionLog(int emotionLogID);
}
