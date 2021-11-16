package com.example.demo.Controllers;
import com.example.demo.BusinessLogic.DescriptionBusinessLogicService;
import com.example.demo.BusinessLogic.EmotionCategoryBusinessLogicService;
import com.example.demo.Domain.Description;
import com.example.demo.Domain.EmotionCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/description")
public class DescriptionController {
    private DescriptionBusinessLogicService DescriptionBusinessLogicService;

    @Autowired
    public DescriptionController(DescriptionBusinessLogicService DescriptionBusinessLogicService) {
        this.DescriptionBusinessLogicService = DescriptionBusinessLogicService;
    }

    @GetMapping
    public List<Description> RetrieveDescription() {
        return DescriptionBusinessLogicService.RetrieveDescription();
    }
}
