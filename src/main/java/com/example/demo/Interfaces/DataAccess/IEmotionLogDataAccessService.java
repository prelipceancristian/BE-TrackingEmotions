package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionLog;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IEmotionLogDataAccessService {
    List<EmotionLog> RetrieveEmotionLogsByUserID(int userID, String startDate, String endDate, int environmentID, int typeID);
    EmotionLog SearchEmotionLogByLogID(int emotionLogID);
    void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID, String date);
    void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date);
    void DeleteEmotionLog(int emotionLogID);
}
