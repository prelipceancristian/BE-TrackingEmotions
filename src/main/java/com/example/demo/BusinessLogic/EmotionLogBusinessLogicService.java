package com.example.demo.BusinessLogic;

import com.example.demo.DataAccess.EmotionLogDataAccessService;
import com.example.demo.Domain.DTOs.EmotionLogsDTO;
import com.example.demo.Domain.EmotionLog;
import com.example.demo.Interfaces.BusinessLogic.IEmotionLogBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class EmotionLogBusinessLogicService implements IEmotionLogBusinessLogicService {

    EmotionLogDataAccessService emotionLogDataAccessService;

    @Autowired
    public EmotionLogBusinessLogicService(EmotionLogDataAccessService emotionLogDataAccessService) {
        this.emotionLogDataAccessService = emotionLogDataAccessService;
    }

    @Override
    public EmotionLogsDTO RetrieveEmotionLogsByUserID(@RequestParam int userID, @RequestParam String startDate, @RequestParam String endDate, @RequestParam int environmentID, @RequestParam int typeID) {
        int errorCode = 0;
        try {
            DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
            sdf.parse(startDate);
            sdf.parse(endDate);
        } catch (ParseException exception){
            return new EmotionLogsDTO(null, 2);
        }
        if(startDate.compareTo(endDate) < 0 ){
            return new EmotionLogsDTO(null, 3);
        }
        List<EmotionLog> emotionLogs = emotionLogDataAccessService.RetrieveEmotionLogsByUserID(userID, startDate, endDate, environmentID, typeID);
        if(emotionLogs.size() == 0)
            return new EmotionLogsDTO(null, 1);
        return new EmotionLogsDTO(emotionLogs, errorCode);
    }

    @Override
    public EmotionLog SearchEmotionLogByLogID(int emotionLogID, int userID) {
        if(!HasUserPermission(emotionLogID, userID))
        {
            //throw err
        }
        EmotionLog emotionLog = emotionLogDataAccessService.SearchEmotionLogByLogID(emotionLogID) ;
        return emotionLog;
    }

    @Override
    public void CreateEmotionLog(int emotionID, int userID, int socialEnvironmentID, String date) {
        //TODO: format date
        emotionLogDataAccessService.CreateEmotionLog(emotionID, userID, socialEnvironmentID, date);
    }

    @Override
    public void UpdateEmotionLog(int emotionLogID, int emotionID, int userID, int socialEnvironmentID, String date) {
        if (!HasUserPermission(emotionLogID, userID))
        {
            //throw error
        }
        emotionLogDataAccessService.UpdateEmotionLog(emotionLogID, emotionID, userID, socialEnvironmentID, date);
    }

    @Override
    public void DeleteEmotionLog(int emotionLogID, int userID) {
        if(!HasUserPermission(emotionLogID, userID))
        {
            //throw error
        }
        emotionLogDataAccessService.DeleteEmotionLog(emotionLogID);
    }

    private boolean HasUserPermission(int emotionLogID, int userID)
    {
        EmotionLog emotionLog = emotionLogDataAccessService.SearchEmotionLogByLogID(emotionLogID);
        if(emotionLog == null)
        {
            return false;
        }
        return emotionLog.getUserID() == userID;
    }
}
