package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade logInLink;

    @FindBy(css = "[title='Checkout']")
    private  WebElementFacade checkoutLink;

    @FindBy(css = "[title='Register']")
    private  WebElementFacade registerLink;

    @FindBy(id ="search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private  WebElementFacade searchButton;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLogInLink(){
        clickOn(logInLink);
    }

    public void clickCheckoutLink(){
        clickOn(checkoutLink);
    }

    public void clickRegisterLink(){
        clickOn(registerLink);
    }

    public void setSearchElement(String productName){
        typeInto(searchField, productName);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

}
