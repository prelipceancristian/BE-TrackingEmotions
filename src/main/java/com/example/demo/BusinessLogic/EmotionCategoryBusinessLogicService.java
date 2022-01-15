package com.example.demo.BusinessLogic;
import com.example.demo.DataAccess.EmotionCategoryDataAccessService;
import com.example.demo.DataAccess.EmotionDataAccessService;
import com.example.demo.Domain.DTOs.EmotionCategoryDTO;
import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionCategory;
import com.example.demo.Interfaces.BusinessLogic.IEmotionCategoryBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmotionCategoryBusinessLogicService implements IEmotionCategoryBusinessLogicService{

    private EmotionCategoryDataAccessService emotionCategoryDataAccessService;

    @Autowired
    public EmotionCategoryBusinessLogicService(EmotionCategoryDataAccessService emotionCategoryDataAccessService) {
        this.emotionCategoryDataAccessService = emotionCategoryDataAccessService;
    }

    @Override
    public List<EmotionCategory> RetrieveEmotionCategory() {
        List<EmotionCategory> emotionCategoryList = emotionCategoryDataAccessService.RetrieveEmotionCategory();
        return emotionCategoryList;
    }

    @Override
    public EmotionCategory SearchEmotionCategory(int id) {
        return emotionCategoryDataAccessService.SearchEmotionCategory(id);
    }

    @Override
    public void CreateEmotionCategory(String emotionCategoryName, int ValenceID, int emotionDescriptionID) {
        //TODO: check if emotionCategoryID and ValenceID and emotionDescriptionID are valid
        emotionCategoryDataAccessService.CreateEmotionCategory(emotionCategoryName, ValenceID, emotionDescriptionID);
    }

    @Override
    public void UpdateEmotionCategory(int id, String emotionCategoryName, int ValenceID, int emotionDescriptionID) {
        //TODO: check if id, valenceid, emotiondescriptionid are valid
        emotionCategoryDataAccessService.UpdateEmotionCategory(id, emotionCategoryName, ValenceID, emotionDescriptionID);
    }

    @Override
    public void DeleteEmotionCategory(int id) {
        emotionCategoryDataAccessService.DeleteEmotionCategory(id);
    }

    @Override
    public EmotionCategoryDTO RetrieveEmotionCategoriesForValence(int valence) {
        List<EmotionCategory> emotionCategoryList = new ArrayList<>();
        if(valence != 1 && valence != 0 && valence != -1){
            return new EmotionCategoryDTO(emotionCategoryList, 1);
        }
        emotionCategoryList = emotionCategoryDataAccessService.RetrieveEmotionCategoriesForValence(valence);
        return new EmotionCategoryDTO(emotionCategoryList, 0);
    }
}
