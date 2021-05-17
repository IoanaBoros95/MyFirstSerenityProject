package org.example.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ForgotPage extends PageObject {
    @FindBy(css = ".form-instructions")
    private WebElementFacade forgotMessageParagraph;

    public void verifyForgotMessage(String message){
        forgotMessageParagraph.shouldContainOnlyText(message);
    }

    public boolean isForgotTextDisplayed(String text){
        return forgotMessageParagraph.containsOnlyText(text);
    }

    public String getForgotText(){
        return forgotMessageParagraph.getText();
    }
}
