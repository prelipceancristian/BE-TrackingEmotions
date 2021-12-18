package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.Description;

import java.util.List;

public interface IDescriptionBusinessLogicService {
    List<Description> RetrieveDescriptions();

    Description SearchDescription(int descriptionID);

    void CreateDescription(String text);

    void UpdateDescription(int descriptionID, String text);

    void DeleteDescription(int descriptionID);
}
