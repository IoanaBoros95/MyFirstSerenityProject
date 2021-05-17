package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.example.steps.LoginSteps;
import org.example.utils.BaseTest;
import org.example.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void addToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
    @Test
    public void addMultipleItemsToCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }
}
