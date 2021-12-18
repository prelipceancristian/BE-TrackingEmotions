package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.EmotionLog;

import java.util.List;

public interface IEmotionLogBusinessLogicService {
    List<EmotionLog> RetrieveEmotionLogsByUserID(int userID);
    EmotionLog SearchEmotionLogByLogID(int emotionLogID, int userID);
    void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID, String date);
    void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date);
    void DeleteEmotionLog(int emotionLogID, int userID);
}
