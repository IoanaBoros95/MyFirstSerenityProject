package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.example.steps.LoginSteps;
import org.example.utils.BaseTest;
import org.example.utils.Constants;
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
}
