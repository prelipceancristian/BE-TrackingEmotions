package com.example.demo.Controllers;
import com.example.demo.BusinessLogic.EmotionCategoryBusinessLogicService;
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
    public List<EmotionCategory> RetrieveEmotions() {
        return emotionCategoryBusinessLogicService.RetrieveEmotionCategory();
    }
}
