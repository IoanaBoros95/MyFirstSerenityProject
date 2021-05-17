package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = ".error-msg span")
    private WebElementFacade erroMessageSpan;

    @FindBy(id = "advice-required-entry-pass")
    private WebElementFacade erroMessage;

    @FindBy(css=".form-list .f-left")
    private WebElementFacade forgotLink;

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void checkInvalidCredentialsMessage(){
        erroMessageSpan.shouldContainOnlyText("Invalid login or password.");
    }

    public void checkRequiredFieldMessage(){
        erroMessageSpan.shouldContainOnlyText("This is a required field.");
    }

    public void clickForgotLink(){
        clickOn(forgotLink);
    }

}
