package com.cucumber.projects.website.saucelab.pages;

import com.cucumber.keywords.WebUI;
import org.openqa.selenium.By;

public class SauceCartPage {

    private By header = By.xpath("//*[@data-test='title' and .='Products']");
    private By complete_header =  By.xpath("//h2[@class='complete-header']");
    private By cart_icon = By.xpath("//a[@class='shopping_cart_link']");
    private By firstname =  By.id("first-name");
    private By lastname =  By.id("last-name");
    private By zipcode =  By.id("postal-code");
    private By back2Shop_btn = By.id("continue-shopping");
    private String str_product = "//div[.='%s']";
    private String str_remove_button ="//*[.='%s']/../..//button";
    private By checkout_btn = By.id("checkout");
    private By continue_btn = By.id("continue");
    private By finish_btn = By.id("finish");

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
        WebUI.verifyElementNotPresent(By.xpath(xpathProduct), 3);
    }

    public void inputShippingInfo() {
        WebUI.setText(firstname, "Dang");
        WebUI.setText(lastname, "Huy");
        WebUI.setText(zipcode, "88888");
    }

    public void checkout(){
        WebUI.clickElement(checkout_btn);
    }

    public void continues(){
        WebUI.clickElement(continue_btn);
    }

    public void finishs(){
        WebUI.clickElement(finish_btn);
    }

    public void verifyCompleteOrder(){
        WebUI.verifyElementPresent(complete_header);
        WebUI.verifyElementText(complete_header,"Thank you for your order!");
    }

}
