package com.assingment_3.swe645.dao;

import com.assingment_3.swe645.model.SurveyForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyDao extends JpaRepository<SurveyForm, Integer> {
}
