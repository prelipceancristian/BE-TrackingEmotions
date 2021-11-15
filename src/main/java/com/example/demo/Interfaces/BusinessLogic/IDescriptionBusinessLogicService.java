package com.example.demo.Interfaces.BusinessLogic;

import com.example.demo.Domain.Description;

import java.util.List;

public interface IDescriptionBusinessLogicService {
    List<Description> RetrieveDescription();

    Description SearchDescription(int id);

    void CreateDescription(int DescriptionID, String Text);

    void UpdateDescription(int DescriptionID, String Text);

    void DeleteDescription(int DescriptionID);
}
