package com.assingment_3.swe645.service;

import com.assingment_3.swe645.dao.SurveyDao;
import com.assingment_3.swe645.model.SurveyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    SurveyDao surveyDao;

    public Integer storeData(SurveyForm surveyForm) {
        return surveyDao.save(surveyForm).getId();
    }

    public List<SurveyForm> getAllSurvey() {
        return surveyDao.findAll();
    }

    public int deleteSurvey(int id) {
        surveyDao.deleteById(id);
        return id;
    }

    public int updateSurvey(SurveyForm surveyForm) {
        return surveyDao.save(surveyForm).getId();
    }

    public SurveyForm getSurveyById(int id) {
        return surveyDao.findById(id).orElse(null);
    }
}
