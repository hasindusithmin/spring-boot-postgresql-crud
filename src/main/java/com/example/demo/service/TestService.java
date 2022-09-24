package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TestModel;
import com.github.javafaker.Faker;

@Service
public class TestService {
    
    @Autowired

    Faker faker = new Faker();

    public TestModel getTestModel() {
        return new TestModel(faker.idNumber().valid(), faker.name().fullName(), faker.internet().emailAddress(), faker.university().name());
    }

}
