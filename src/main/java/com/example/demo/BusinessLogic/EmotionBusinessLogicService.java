package com.example.demo.BusinessLogic;

import com.example.demo.DataAccess.EmotionDataAccessService;
import com.example.demo.Domain.Emotion;
import com.example.demo.Interfaces.BusinessLogic.IEmotionBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmotionBusinessLogicService implements IEmotionBusinessLogicService {

    private EmotionDataAccessService emotionDataAccessService;

    @Autowired
    public EmotionBusinessLogicService(EmotionDataAccessService emotionDataAccessService) {
        this.emotionDataAccessService = emotionDataAccessService;
    }

    @Override
    public List<Emotion> RetrieveEmotions() {
        List<Emotion> emotionList = emotionDataAccessService.RetrieveEmotions();
        return emotionList;
    }

    @Override
    public Emotion SearchEmotion(int id) {
        return null;
    }

    @Override
    public void CreateEmotion(String emotionName, int idCategory) {

    }

    @Override
    public void UpdateEmotion(int id, String emotionName, int idCategory) {

    }

    @Override
    public void DeleteEmotion(int id) {

    }
}
