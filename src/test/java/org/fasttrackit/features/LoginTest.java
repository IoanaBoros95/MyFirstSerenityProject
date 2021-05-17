package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
        loginSteps.clickLogIn();
        loginSteps.checkUserIsLoggedIn("Hello, Ioana B B!");
    }

    @Test
    public void loginWithInvalidPassword(){
        loginSteps.navigateToLogin();
        loginSteps.enterCredentials(Constants.USER_EMAIL, "1234567");
        loginSteps.clickLogIn();
        loginSteps.checkNotLoggedIn();
    }

    @Test
    public void loginWithoutMandatoryFields(){
        loginSteps.navigateToLogin();
        loginSteps.clickLogIn();
    }

    @Test
    public void forgotPassword(){
        loginSteps.navigateToLogin();
        loginSteps.clickForgot();
        loginSteps.checkUserForgotPass("Please enter your email address below. You will receive a link to reset your password.");
    }
}
