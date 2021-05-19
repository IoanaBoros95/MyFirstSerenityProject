package org.example.features;

import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.steps.RegisterSteps;
import org.example.steps.ResultsSteps;
import org.example.utils.BaseTest;
import org.junit.Test;

public class ResultsTest extends BaseTest {

    @Steps
    private ResultsSteps resultsSteps;

    @Test
    public void searchProductByName(){
        resultsSteps.navigateToSearch("necklace");
        resultsSteps.getListOfProducts();
    }
}
