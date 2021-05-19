package org.example.steps;

import net.thucydides.core.annotations.Step;
import org.example.pages.HomePage;
import org.example.pages.ResultsPage;
import static org.assertj.core.api.Assertions.assertThat;

public class ResultsSteps {

    private HomePage homePage;
    private ResultsPage resultsPage;

    @Step
    public void navigateToSearch(String productName){
        homePage.open();
        homePage.setSearchElement(productName);
        homePage.clickSearchButton();
    }

    @Step
    public void getListOfProducts() {
        resultsPage.getProducts().stream().forEach(product -> assertThat(product.contains("necklace")));
    }
}
