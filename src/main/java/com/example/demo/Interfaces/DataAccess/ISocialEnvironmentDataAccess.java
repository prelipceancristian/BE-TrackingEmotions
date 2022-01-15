package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.SocialEnvironment;

import java.util.List;

public interface ISocialEnvironmentDataAccess {
    List<SocialEnvironment> RetrieveSocialEnvironments();
    SocialEnvironment SearchSocialEnvironment(int SocialEnvironmentID);
    List<SocialEnvironment> RetrieveLocations();
    List<SocialEnvironment> RetrievePeople();
    void CreateSocialEnvironment(String relation, boolean isLocation);
    void UpdateSocialEnvironment(int SocialEnvironmentID, String relation, boolean isLocation);
    void DeleteSocialEnvironment(int SocialEnvironmentID);
}
