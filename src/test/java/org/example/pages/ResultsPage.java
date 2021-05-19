package org.example.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage extends PageObject {

    public List<String> getProducts() {
         return findAll(".products-grid .item").stream()
                 .map(WebElementFacade::getText)
                 .collect(Collectors.toList());
    }
}
