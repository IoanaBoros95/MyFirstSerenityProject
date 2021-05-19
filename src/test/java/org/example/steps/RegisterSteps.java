package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.HomePage;
import org.example.pages.RegisterPage;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;


    @Step
    public void navigateToRegister(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentials(String firstName, String middleName, String lastName,String email, String password, String confirmation){
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPasswordField(password);
        registerPage.setConfirmationField(confirmation);
    }

    @Step
    public void clickSubscribe(){
        registerPage.clickSubscribeCheckbox();
    }

    @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }
}
