package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.ForgotPage;
import org.example.pages.LoginPage;
import org.junit.Assert;

public class ForgotSteps {

    private LoginPage loginPage;
    private ForgotPage forgotPage;

    @Step
    public void checkUserForgotPass(String message){
        forgotPage.verifyForgotMessage(message);
        Assert.assertTrue(forgotPage.isForgotTextDisplayed(message));
        Assert.assertEquals(message, forgotPage.getForgotText());
    }
}
