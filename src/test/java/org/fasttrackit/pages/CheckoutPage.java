package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {
    @FindBy(css = ".page-title")
    private WebElementFacade checkoutMessageParagraph;

    public void verifyCheckoutMessage(String message){
        checkoutMessageParagraph.shouldContainOnlyText(message);
    }

    public boolean isCheckoutTextDisplayed(String text){
        return checkoutMessageParagraph.containsOnlyText(text);
    }

    public String getCheckoutText(){
        return checkoutMessageParagraph.getText();
    }
}
