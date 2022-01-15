package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.Description;

import java.util.List;

public interface IDescriptionDataAccessService {
    List<Description> RetrieveDescriptions();

    Description SearchDescription(int descriptionID);

    void CreateDescription(String text);

    void UpdateDescription(int descriptionID, String text);

    void DeleteDescription(int descriptionID);
}
