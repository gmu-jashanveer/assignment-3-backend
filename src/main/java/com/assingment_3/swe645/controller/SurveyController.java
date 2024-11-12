package com.assingment_3.swe645.controller;

import com.assingment_3.swe645.model.SurveyForm;
import com.assingment_3.swe645.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    SurveyService surveyService;
    /*
    {
    "firstName": "Jashanveer",
    "lastName": "Singh",
    "streetAddress": "4915, McFarland Dr",
    "city": "Fairfax",
    "state": "VA",
    "zip": "22032",
    "telephoneNumber": "+15712518482",
    "email": "jsingh54@gmu.edu",
    "dateOfSurvey": "2024-11-08T00:00:00Z",
    "likes": "abc",
    "interested": "def",
    "raffle": "abcdef",
    "comments": "Additional comments"
}
     */

    @PostMapping("/submit/survey")
    @CrossOrigin("*")
    public ResponseEntity<String> submitSurvey(@RequestBody SurveyForm surveyForm) {
        String response = "Survey saved for id " + surveyService.storeData(surveyForm);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get/all/survey")
    @CrossOrigin("*")
    public ResponseEntity<List<SurveyForm>> getAllSurvey() {
        return new ResponseEntity<>(surveyService.getAllSurvey(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/survey")
    @CrossOrigin("*")
    public ResponseEntity<String> deleteSurvey(@RequestParam int id) {
        String response = "Survey deleted for id " + surveyService.deleteSurvey(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/update/survey")
    @CrossOrigin("*")
    public ResponseEntity<String> updateSurvey(@RequestBody SurveyForm surveyForm) {
        return new ResponseEntity<>("Survey " + surveyService.updateSurvey(surveyForm) + " updated!", HttpStatus.OK);
    }

    @GetMapping("/get/survey")
    @CrossOrigin("*")
    public ResponseEntity<SurveyForm> getSurveyById(@RequestParam int id) {
        return new ResponseEntity<>(surveyService.getSurveyById(id), HttpStatus.OK);
    }
}