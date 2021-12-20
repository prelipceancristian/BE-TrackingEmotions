package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.EmotionLogBusinessLogicService;
import com.example.demo.Domain.DTOs.EmotionLogsDTO;
import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/emotionLogs")
public class EmotionLogController {

    private EmotionLogBusinessLogicService emotionLogBusinessLogicService;

    @Autowired
    public EmotionLogController(EmotionLogBusinessLogicService emotionLogBusinessLogicService) {
        this.emotionLogBusinessLogicService = emotionLogBusinessLogicService;
    }

    @GetMapping("/{emotionLogID}")
    public EmotionLog SearchEmotionLog(@RequestParam int userID, @PathVariable int emotionLogID) {
        return emotionLogBusinessLogicService.SearchEmotionLogByLogID(emotionLogID, userID);
    }

    @GetMapping
    public EmotionLogsDTO RetrieveEmotionsLogs(@RequestParam int userID, @RequestParam String startDate, @RequestParam String endDate, @RequestParam int environmentID, @RequestParam int typeID) {
        return emotionLogBusinessLogicService.RetrieveEmotionLogsByUserID(userID, startDate, endDate, environmentID, typeID);
    }

    @PostMapping
    public void CreateEmotionLog(@RequestParam int userID, @RequestParam int emotionID, @RequestParam int socialEnvironmentID, @RequestParam String date) {
        emotionLogBusinessLogicService.CreateEmotionLog(emotionID, userID, socialEnvironmentID, date);
    }

    @PutMapping
    public void UpdateEmotionLog(@RequestParam int emotionLogID, @RequestParam int userID, @RequestParam int emotionID, @RequestParam int socialEnvironmentID, @RequestParam String date) {
        emotionLogBusinessLogicService.UpdateEmotionLog(emotionLogID, emotionID, userID, socialEnvironmentID, date);
    }

    @DeleteMapping
    public void DeleteEmotionLog(@RequestParam int userID, @RequestParam int emotionLogID) {
        emotionLogBusinessLogicService.DeleteEmotionLog(emotionLogID, userID);
    }

}
