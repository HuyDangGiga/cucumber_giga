package com.cucumber.projects.website.saucelab.pages;

import com.cucumber.keywords.WebUI;
import org.openqa.selenium.By;

public class SauceProductPage {

    private By header = By.xpath("//*[@data-test='title' and .='Products']");
    private By cart_icon = By.xpath("//a[@class='shopping_cart_link']");
    private String str_add_button ="//*[.='%s']/../..//button";
    public void verifyProductPageDisplayed() {
        WebUI.verifyElementPresent(header);
    }

    public void addProduct2Cart(String productName) {
        String xpathAdd2Cart = String.format(str_add_button, productName);
        WebUI.getWebElement(By.xpath(xpathAdd2Cart)).click();
    }

    public void navigateToCartPage(){
        WebUI.clickElement(cart_icon);
    }


}
