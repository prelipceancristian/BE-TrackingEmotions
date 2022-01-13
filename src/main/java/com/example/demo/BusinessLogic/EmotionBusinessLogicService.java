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
    private DescriptionDataAccessService descriptionDataAccessService;

    @Autowired
    public EmotionBusinessLogicService(EmotionDataAccessService emotionDataAccessService, DescriptionDataAccessService descriptionDataAccessService) {
        this.emotionDataAccessService = emotionDataAccessService;
        this.descriptionDataAccessService = descriptionDataAccessService;
    }

    @Override
    public EmotionDescriptionDTO RetrieveEmotions(int emotionCategoryID) {
        List<EmotionWithDescription> emotionWithDescriptions = emotionDataAccessService.RetrieveEmotions(-1);
        return new EmotionDescriptionDTO(emotionWithDescriptions, 0);
    }

    @Override
    public Emotion SearchEmotion(int id) {
        return emotionDataAccessService.SearchEmotion(id);
    }

    @Override
    public void CreateEmotion(String emotionName, int emotionCategoryID, int emotionDescriptionID) {
        //TODO: check if emotionCategoryID and emotionDescriptionID are valid
        emotionDataAccessService.CreateEmotion(emotionName, emotionCategoryID, emotionDescriptionID);
    }

    @Override
    public void UpdateEmotion(int id, String emotionName, int emotionCategeoryID, int emotionDescriptionID) {
        //TODO: check if ids are valid
        emotionDataAccessService.UpdateEmotion(id, emotionName, emotionCategeoryID, emotionDescriptionID);
    }

    @Override
    public void DeleteEmotion(int id) {
        emotionDataAccessService.DeleteEmotion(id);
    }
}
