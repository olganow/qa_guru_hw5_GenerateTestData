package com.demoqa.test;

import com.demoqa.page.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends TestData {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void successfulSubmitFormTest() {
        registrationFormPage
                .openPage()
                .setFirstName(firstNameUser)
                .setLastName(lastNameUser)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setDateOfBirth(dayOfbirth, monthOfbirth, yearOfBirth)
                .setSubject(subjectOne, subjectSecond)
                .setHobby(hobbyOne, hobbySecond)
                .uploadPicture()
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        registrationFormPage
                .checkResultsTableVisible();
        registrationFormPage.checkResult(firstNameUser, lastNameUser, email, gender,
                phone, dayOfbirth, monthOfbirth, yearOfBirth, subjectOne, subjectSecond, hobbyOne, hobbySecond,
                address, state, city, file);

    }

}