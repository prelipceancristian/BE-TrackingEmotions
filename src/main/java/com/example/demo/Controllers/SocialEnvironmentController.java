package com.example.demo.Controllers;

import com.example.demo.BusinessLogic.SocialEnvironmentBusinessLogicService;
import com.example.demo.Domain.Emotion;
import com.example.demo.Domain.SocialEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/socialEnvironments")
public class SocialEnvironmentController {

    private SocialEnvironmentBusinessLogicService socialEnvironmentBusinessLogicService;

    @Autowired
    public SocialEnvironmentController(SocialEnvironmentBusinessLogicService socialEnvironmentBusinessLogicService) {
        this.socialEnvironmentBusinessLogicService = socialEnvironmentBusinessLogicService;
    }

    @GetMapping("/{id}")
    public SocialEnvironment SearchSocialEnvironment(@PathVariable int id) {
        return socialEnvironmentBusinessLogicService.SearchSocialEnvironment(id);
    }

    @GetMapping
    public List<SocialEnvironment> RetrieveSocialEnvironment() {
        return socialEnvironmentBusinessLogicService.RetrieveSocialEnvironments();
    }

    @PostMapping
    public void CreateSocialEnvironment(@RequestParam String relation, @RequestParam boolean isLocation) {
        socialEnvironmentBusinessLogicService.CreateSocialEnvironment(relation, isLocation);
    }

    @PutMapping
    public void UpdateSocialEnvironment(@RequestParam int socialEnvironmentID, @RequestParam String relation, @RequestParam boolean isLocation) {
        socialEnvironmentBusinessLogicService.UpdateSocialEnvironment(socialEnvironmentID, relation, isLocation);
    }

    @DeleteMapping
    public void DeleteSocialEnvironment(@RequestParam int socialEnvironmentID) {
        socialEnvironmentBusinessLogicService.DeleteSocialEnvironment(socialEnvironmentID);
    }

}
