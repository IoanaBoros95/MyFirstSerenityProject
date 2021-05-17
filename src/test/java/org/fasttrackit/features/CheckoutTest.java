package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CheckoutSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.BaseTest;
import org.fasttrackit.utils.Constants;
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
