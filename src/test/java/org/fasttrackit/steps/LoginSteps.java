package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.ForgotPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ForgotPage forgotPage;

    @Step
    public void navigateToLogin(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickLogInLink();
    }

    @Step
    public void enterCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogIn(){
        loginPage.clickLoginButton();
    }

    @Step
    public void checkUserIsLoggedIn(String message){
        accountPage.verifyWelcomeMessage(message);
        Assert.assertTrue(accountPage.isWelcomeTextDisplayed(message));
        Assert.assertEquals(message.toLowerCase(), accountPage.getWelcomeText().toLowerCase());
    }

    @Step
    public void doLogin(String email, String pass){
        navigateToLogin();
        enterCredentials(email,pass);
        clickLogIn();
    }

    @Step
    public void checkNotLoggedIn(){
        loginPage.checkInvalidCredentialsMessage();
    }

    @Step
    public void userIsNotLoggedIn(){
        loginPage.checkRequiredFieldMessage();
    }

    @Step
    public void checkUserForgotPass(String message){
        forgotPage.verifyForgotMessage(message);
        Assert.assertTrue(forgotPage.isForgotTextDisplayed(message));
        Assert.assertEquals(message, forgotPage.getForgotText());
    }

    @Step
    public void clickForgot(){
        loginPage.clickForgotLink();
    }
}
