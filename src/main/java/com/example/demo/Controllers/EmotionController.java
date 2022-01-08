package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.EmotionBusinessLogicService;
import com.example.demo.Domain.DTOs.EmotionDTO;
import com.example.demo.Domain.DTOs.EmotionDescriptionDTO;
import com.example.demo.Domain.Emotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/emotions")
public class EmotionController {

    private EmotionBusinessLogicService emotionBusinessLogicService;

    @Autowired
    public EmotionController(EmotionBusinessLogicService emotionBusinessLogicService) {
        this.emotionBusinessLogicService = emotionBusinessLogicService;
    }

    @GetMapping("/{id}")
    public Emotion SearchEmotion(@PathVariable int id) {
        return emotionBusinessLogicService.SearchEmotion(id);
    }

    @GetMapping()
    public EmotionDescriptionDTO RetrieveEmotions() {
        return emotionBusinessLogicService.RetrieveEmotions(-1);
    }

    @GetMapping("/RetrieveEmotionsForCategory")
    public EmotionDescriptionDTO RetrieveEmotionsForCategory(@RequestParam int emotionCategoryID) {
        return emotionBusinessLogicService.RetrieveEmotions(emotionCategoryID);
    }

    @PostMapping
    public void CreateEmotion(@RequestParam String emotionName, @RequestParam int emotionCategoryID, @RequestParam int emotionDescriptionID) {
        //TODO: can an emotion be created only by selecting a already existing description?
        //TODO: when would we create an emotion anyway?
        emotionBusinessLogicService.CreateEmotion(emotionName, emotionCategoryID, emotionDescriptionID);
    }

    @PutMapping
    public void UpdateEmotion(@RequestParam int emotionID, @RequestParam String emotionName, @RequestParam int emotionCategoryID, @RequestParam int emotionDescriptionID) {
        emotionBusinessLogicService.UpdateEmotion(emotionID, emotionName, emotionCategoryID, emotionDescriptionID);
    }

    @DeleteMapping
    public void DeleteEmotion(@RequestParam int emotionID) {
        emotionBusinessLogicService.DeleteEmotion(emotionID);
    }

}
