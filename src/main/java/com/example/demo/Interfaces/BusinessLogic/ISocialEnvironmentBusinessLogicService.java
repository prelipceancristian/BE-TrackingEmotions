package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.SocialEnvironment;

import java.util.List;

public interface ISocialEnvironmentBusinessLogicService {
    List<SocialEnvironment> RetrieveSocialEnvironments();
    List<SocialEnvironment> RetrieveLocations();
    List<SocialEnvironment> RetrievePeople();
    SocialEnvironment SearchSocialEnvironment(int SocialEnvironmentID);
    void CreateSocialEnvironment(String relation, boolean isLocation);
    void UpdateSocialEnvironment(int SocialEnvironmentID, String relation, boolean isLocation);
    void DeleteSocialEnvironment(int SocialEnvironmentID);
}
