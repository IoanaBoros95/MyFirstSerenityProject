package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.example.steps.CheckoutSteps;
import org.example.utils.BaseTest;
import org.junit.Test;

public class CheckoutTest extends BaseTest {
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void goToCheckoutBeforeAddingToCart(){
        checkoutSteps.navigateToCheckout();
        checkoutSteps.checkUserCheckoutMessage("SHOPPING CART IS EMPTY");
    }
}
