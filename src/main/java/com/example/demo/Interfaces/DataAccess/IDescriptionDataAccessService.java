package com.example.demo.Interfaces.DataAccess;

import com.example.demo.Domain.Description;

import java.util.List;

public interface IDescriptionDataAccessService {
    List<Description> RetrieveDescription();

    Description SearchDescription(int id);

    void CreateDescription(int DescriptionID,String Text);

    void UpdateDescription(int DescriptionID, String Text);

    void DeleteDescription(int id);
}
