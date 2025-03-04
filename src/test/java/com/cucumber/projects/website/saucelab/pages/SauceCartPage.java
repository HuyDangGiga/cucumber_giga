package com.cucumber.projects.website.saucelab.pages;

import com.cucumber.keywords.WebUI;
import org.openqa.selenium.By;

public class SauceCartPage {

    private By header = By.xpath("//*[@data-test='title' and .='Products']");
    private By cart_icon = By.xpath("//a[@class='shopping_cart_link']");
    private By back2Shop_btn = By.id("continue-shopping");
    private String str_product = "//div[.='%s']";
    private String str_remove_button ="//*[.='%s']/../..//button";

    public void verifyProductPageDisplayed() {
        WebUI.verifyElementPresent(header);
    }

    public void removeProductInCart(String productName) {
        String xpathRemoveProduct = String.format(str_remove_button, productName);
        WebUI.getWebElement(By.xpath(xpathRemoveProduct)).click();
    }

    public void navigateToProductPage(){
        WebUI.clickElement(back2Shop_btn);
    }

    public void verifyProductInCart(String productName) {
        String xpathProduct = String.format(str_product, productName);
        WebUI.verifyElementPresent(By.xpath(xpathProduct));
    }

    public void verifyProductOutCart(String productName) {
        String xpathProduct = String.format(str_product, productName);
        WebUI.verifyElementNotPresent(By.xpath(xpathProduct));
    }
}
