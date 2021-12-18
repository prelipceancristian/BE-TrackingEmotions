package com.example.demo.BusinessLogic;

import com.example.demo.DataAccess.EmotionLogDataAccessService;
import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionLog;
import com.example.demo.Interfaces.BusinessLogic.IEmotionLogBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmotionLogBusinessLogicService implements IEmotionLogBusinessLogicService {

    EmotionLogDataAccessService emotionLogDataAccessService;

    @Autowired
    public EmotionLogBusinessLogicService(EmotionLogDataAccessService emotionLogDataAccessService) {
        this.emotionLogDataAccessService = emotionLogDataAccessService;
    }

    @Override
    public List<EmotionLog> RetrieveEmotionLogsByUserID(int userID) {
        return emotionLogDataAccessService.RetrieveEmotionLogsByUserID(userID);
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
