package com.demoqa.test;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import static com.demoqa.utils.RandomUtils.*;

public class TestData {

    static Faker faker = new Faker();

    static String firstNameUser = faker.name().firstName(),
            lastNameUser = faker.name().lastName(),
            email = getRandomEmail(),
            gender = "Female",
            phone = getRandomNumber(10),
            yearOfBirth = "1998",
            monthOfbirth = "May",
            dayOfbirth = "16",
            address = faker.address().streetAddress(),
            subjectOne = "Economics",
            subjectSecond = "Biology",
            hobbyOne = "Sports",
            hobbySecond = "Music",
            state = "Uttar Pradesh",
            city = "Lucknow",
            file = "testcat.png";



    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        //executeJavaScript("$('footer).remove()"); //Doesn't work ((
        //executeJavaScript("$(#fixedban).remove()");

    }
}
