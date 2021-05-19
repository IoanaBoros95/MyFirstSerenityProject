package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.example.steps.ForgotSteps;
import org.example.steps.LoginSteps;
import org.example.utils.BaseTest;
import org.junit.Test;

public class ForgotTest extends BaseTest {

    @Steps
    private ForgotSteps forgotSteps;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void forgotPassword(){
        loginSteps.navigateToLogin();
        loginSteps.clickForgot();
        forgotSteps.checkUserForgotPass("Please enter your email address below. You will receive a link to reset your password.");
    }
}
