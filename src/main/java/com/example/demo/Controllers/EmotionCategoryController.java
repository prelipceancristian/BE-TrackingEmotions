package com.example.demo.Controllers;
import com.example.demo.BusinessLogic.EmotionCategoryBusinessLogicService;
import com.example.demo.Domain.DTOs.EmotionCategoryDTO;
import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.EmotionCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/emotionCategory")
public class EmotionCategoryController {
    private EmotionCategoryBusinessLogicService emotionCategoryBusinessLogicService;

    @Autowired
    public EmotionCategoryController(EmotionCategoryBusinessLogicService emotionCategoryBusinessLogicService) {
        this.emotionCategoryBusinessLogicService = emotionCategoryBusinessLogicService;
    }

    @GetMapping
    public List<EmotionCategory> RetrieveEmotionCategory() {
        return emotionCategoryBusinessLogicService.RetrieveEmotionCategory();
    }

    @GetMapping("/{id}")
    public EmotionCategory SearchEmotionCategory(@PathVariable int id) {
        return emotionCategoryBusinessLogicService.SearchEmotionCategory(id);
    }

    @PostMapping
    public void CreateEmotionCategory(@RequestParam String emotionCategoryName, @RequestParam int ValenceID, @RequestParam int emotionDescriptionID) {//TODO: can an emotion be created only by selecting a already existing description?
        emotionCategoryBusinessLogicService.CreateEmotionCategory(emotionCategoryName, ValenceID, emotionDescriptionID);
    }

    @PutMapping
    public void UpdateEmotionCategory(@RequestParam int emotionCategoryID, @RequestParam String emotionCategoryName, @RequestParam int valenceID, @RequestParam int emotionDescriptionID) {
        emotionCategoryBusinessLogicService.UpdateEmotionCategory(emotionCategoryID, emotionCategoryName, valenceID, emotionDescriptionID);
    }

    @DeleteMapping
    public void DeleteEmotionCategory(@RequestParam int emotionCategoryID) {
        emotionCategoryBusinessLogicService.DeleteEmotionCategory(emotionCategoryID);
    }

    @GetMapping("/RetrieveCategoriesForValence")
    public EmotionCategoryDTO RetrieveEmotionCategoriesForValence(@RequestParam int valence){
        return emotionCategoryBusinessLogicService.RetrieveEmotionCategoriesForValence(valence);
    }
}
