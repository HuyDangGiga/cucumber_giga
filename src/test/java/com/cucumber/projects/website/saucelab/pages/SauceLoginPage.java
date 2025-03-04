package com.cucumber.projects.website.saucelab.pages;

import com.cucumber.keywords.WebUI;
import com.cucumber.constants.FrameworkConstants;
import org.openqa.selenium.By;

public class SauceLoginPage {


    private By username = By.xpath("//input[@id='user-name']");
    private By password = By.xpath("//input[@id='password']");
    private By loginBtn = By.xpath("//input[@id='login-button']");
    private By errorMessage = By.xpath("//h3[@data-test='error']");
    private By header = By.xpath("//div[.='Swag Labs']");

    public void loginSaucelab(String username_text, String password_text) {
        WebUI.setText(username, username_text);
        WebUI.setText(password, password_text);
    }

    public void loginSaucelab() {
        WebUI.setText(username, FrameworkConstants.USERNAME);
        WebUI.setText(password, FrameworkConstants.PASSWORD);
    }

    public void clickLogin(){
        WebUI.clickElement(loginBtn);
//        WebUI.getWebElement(loginBtn).click();
    }

    public void enterUsername() {
        WebUI.setText(username, FrameworkConstants.USERNAME);
    }

    public void enterPassword() {
        WebUI.setText(password, FrameworkConstants.PASSWORD);
    }

    public void verifyValidatorErrorDisplays() {
        WebUI.verifyElementPresent(errorMessage);
    }

}
