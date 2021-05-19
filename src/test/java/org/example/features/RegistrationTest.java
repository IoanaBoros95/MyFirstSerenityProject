package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.steps.RegisterSteps;
import org.example.utils.BaseTest;
import org.junit.Test;

public class RegistrationTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void registrationWithValidCredentials(){
        String random = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        registerSteps.navigateToRegister();
        registerSteps.enterCredentials("Ioana","Livia","Boros","ioana@gmail.com","123456","123456");
        registerSteps.clickSubscribe();
        registerSteps.clickRegister();
    }
}
