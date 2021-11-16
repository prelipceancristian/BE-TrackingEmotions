package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.DescriptionBusinessLogicService;
import com.example.demo.Domain.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/descriptions")
public class DescriptionController {

    private DescriptionBusinessLogicService descriptionBusinessLogicService;

    @Autowired
    public DescriptionController(DescriptionBusinessLogicService descriptionBusinessLogicService) {
        this.descriptionBusinessLogicService = descriptionBusinessLogicService;
    }

    @GetMapping("/{id}")
    public Description SearchDescription(@PathVariable int id) {
        return descriptionBusinessLogicService.SearchDescription(id);
    }

    @GetMapping
    public List<Description> RetrieveDescriptions() {
        return descriptionBusinessLogicService.RetrieveDescriptions();
    }

    @PostMapping
    public void CreateDescription(@RequestParam String text) {
        descriptionBusinessLogicService.CreateDescription(text);
    }

    @PutMapping
    public void UpdateDescription(@RequestParam int descriptionID, @RequestParam String text){
        descriptionBusinessLogicService.UpdateDescription(descriptionID, text);
    }

    @DeleteMapping
    public void DeleteDescription(@RequestParam int descriptionID) {
        descriptionBusinessLogicService.DeleteDescription(descriptionID);
    }

}
