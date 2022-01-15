package com.example.demo.BusinessLogic;

import com.example.demo.DataAccess.DescriptionDataAccessService;
import com.example.demo.Domain.Description;
import com.example.demo.Interfaces.BusinessLogic.IDescriptionBusinessLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescriptionBusinessLogicService implements IDescriptionBusinessLogicService {

    private DescriptionDataAccessService descriptionDataAccessService;

    @Autowired
    public DescriptionBusinessLogicService(DescriptionDataAccessService descriptionDataAccessService) {
        this.descriptionDataAccessService = descriptionDataAccessService;
    }

    @Override
    public List<Description> RetrieveDescriptions() {
        return descriptionDataAccessService.RetrieveDescriptions();
    }

    @Override
    public Description SearchDescription(int descriptionID) {
        return descriptionDataAccessService.SearchDescription(descriptionID);
    }

    @Override
    public void CreateDescription(String text) {
        descriptionDataAccessService.CreateDescription(text);
    }

    @Override
    public void UpdateDescription(int descriptionID, String text) {
        descriptionDataAccessService.UpdateDescription(descriptionID, text);
    }

    @Override
    public void DeleteDescription(int descriptionID) {
        descriptionDataAccessService.DeleteDescription(descriptionID);
    }
}
