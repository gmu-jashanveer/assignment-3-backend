package com.assingment_3.swe645.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SurveyForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zip;
    String telephoneNumber;
    String email;
    Date dateOfSurvey;
    String likes;
    String interested;
    String likelihood;
    String raffle;
    String comments;
}
