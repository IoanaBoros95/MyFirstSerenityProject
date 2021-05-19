package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(id="is_subscribed")
    private WebElementFacade subscribeCheckbox;

    @FindBy(css=".buttons-set button")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setMiddleNameField(String middleName){
        typeInto(middleNameField, middleName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void setConfirmationField(String confirmation){
        typeInto(confirmationField, confirmation);
    }

    public void clickSubscribeCheckbox(){
        clickOn(subscribeCheckbox);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}
