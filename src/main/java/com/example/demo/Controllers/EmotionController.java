package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.EmotionBusinessLogicService;
import com.example.demo.Domain.Emotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "api/emotions")
public class EmotionController {

    private EmotionBusinessLogicService emotionBusinessLogicService;

    @Autowired
    public EmotionController(EmotionBusinessLogicService emotionBusinessLogicService) {
        this.emotionBusinessLogicService = emotionBusinessLogicService;
    }

    @GetMapping
    public List<Emotion> RetrieveEmotions(){
        return emotionBusinessLogicService.RetrieveEmotions();
    }
}
