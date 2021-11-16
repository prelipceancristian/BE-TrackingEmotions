package com.example.demo.BusinessLogic;
import com.example.demo.DataAccess.DescriptionDataAccessService;
import com.example.demo.DataAccess.EmotionDataAccessService;
import com.example.demo.Domain.Description;
import com.example.demo.Domain.Emotion;
import com.example.demo.Interfaces.BusinessLogic.IDescriptionBusinessLogicService;
import com.example.demo.Interfaces.DataAccess.IDescriptionDataAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DescriptionBusinessLogicService implements IDescriptionDataAccessService {
    private DescriptionDataAccessService DescriptionDataAccessService;

    @Autowired
    public DescriptionBusinessLogicService(DescriptionDataAccessService DescriptionDataAccessService) {
        this.DescriptionDataAccessService = DescriptionDataAccessService;
    }

    @Override
    public List<Description> RetrieveDescription() {
        List<Description> DescriptionList = DescriptionDataAccessService.RetrieveDescription();
        return DescriptionList;
    }

    @Override
    public Description SearchDescription(int id) {
        return null;
    }

    @Override
    public void CreateDescription(int DescriptionID, String Text) {

    }

    @Override
    public void UpdateDescription(int DescriptionID, String Text) {

    }

    @Override
    public void DeleteDescription(int id) {

    }
}
