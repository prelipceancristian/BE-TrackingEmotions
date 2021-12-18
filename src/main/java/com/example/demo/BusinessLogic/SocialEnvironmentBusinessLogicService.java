package com.example.demo.BusinessLogic;

import com.example.demo.DataAccess.SocialEnvironmentDataAccessService;
import com.example.demo.Domain.SocialEnvironment;
import com.example.demo.Interfaces.BusinessLogic.ISocialEnvironmentBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialEnvironmentBusinessLogicService implements ISocialEnvironmentBusinessLogicService {

    SocialEnvironmentDataAccessService socialEnvironmentDataAccessService;

    @Autowired
    public SocialEnvironmentBusinessLogicService(SocialEnvironmentDataAccessService socialEnvironmentDataAccessService) {
        this.socialEnvironmentDataAccessService = socialEnvironmentDataAccessService;
    }

    @Override
    public List<SocialEnvironment> RetrieveSocialEnvironments() {
        return socialEnvironmentDataAccessService.RetrieveSocialEnvironments();
    }

    @Override
    public SocialEnvironment SearchSocialEnvironment(int SocialEnvironmentID) {
        return socialEnvironmentDataAccessService.SearchSocialEnvironment(SocialEnvironmentID);
    }

    @Override
    public void CreateSocialEnvironment(String relation, boolean isLocation) {
        socialEnvironmentDataAccessService.CreateSocialEnvironment(relation, isLocation);
    }

    @Override
    public void UpdateSocialEnvironment(int SocialEnvironmentID, String relation, boolean isLocation) {
        socialEnvironmentDataAccessService.UpdateSocialEnvironment(SocialEnvironmentID, relation, isLocation);
    }

    @Override
    public void DeleteSocialEnvironment(int SocialEnvironmentID) {
        socialEnvironmentDataAccessService.DeleteSocialEnvironment(SocialEnvironmentID);
    }
}
