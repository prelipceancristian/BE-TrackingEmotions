package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.DTOs.EmotionLogWithDescriptions;
import com.example.demo.Domain.DTOs.EmotionLogsDTO;
import com.example.demo.Domain.EmotionLog;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IEmotionLogBusinessLogicService {
    EmotionLogsDTO RetrieveEmotionLogsByUserID(@RequestParam int userID, @RequestParam String startDate, @RequestParam String endDate, @RequestParam int environmentID1, @RequestParam int environmentID2, @RequestParam int typeID);
    EmotionLog SearchEmotionLogByLogID(int emotionLogID, int userID);
    void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID1, int socialEnvironmentID2, String date);
    void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date);
    void DeleteEmotionLog(int emotionLogID, int userID);
    List<EmotionLogWithDescriptions> RetrieveEmotionLogsDescriptors(int userID);
}
