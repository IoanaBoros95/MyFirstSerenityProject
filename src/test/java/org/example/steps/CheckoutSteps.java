package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.*;
import org.junit.Assert;

public class CheckoutSteps {
    private HomePage homePage;
    private CheckoutPage checkoutPage;

    @Step
    public void navigateToCheckout(){
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickCheckoutLink();
    }

    @Step
    public void checkUserCheckoutMessage(String message){
        checkoutPage.verifyCheckoutMessage(message);
        Assert.assertTrue(checkoutPage.isCheckoutTextDisplayed(message));
        Assert.assertEquals(message, checkoutPage.getCheckoutText());
    }
}
