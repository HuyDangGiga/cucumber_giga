package com.cucumber.projects.website.saucelab.stepdefinitions;

import com.cucumber.hooks.TestContext;
import com.cucumber.keywords.WebUI;
import com.cucumber.projects.website.saucelab.pages.SauceLoginPage;
import com.cucumber.projects.website.saucelab.pages.SauceProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    SauceLoginPage sauceLoginPage;
    SauceProductPage sauceProductPage;

    public LoginSteps(TestContext testContext) {
        sauceLoginPage = testContext.getsauceLoginPage();
        sauceProductPage = testContext.getsauceProductPage();
    }

    @Given("user login with valid email and valid password")
    public void userLoginWithStandardAccount(){
        sauceLoginPage.loginSaucelab();
        sauceLoginPage.clickLogin();
    }

    @Given("User navigate and login with valid account")
    public void userNavigateToLoginPageForAdmin() {
        WebUI.openWebsite("https://www.saucedemo.com/");
        sauceLoginPage.loginSaucelab();
    }

    @Given("User navigate to Login Page {string}")
    public void userNavigateToLoginPageForAdmin(String url) {
        WebUI.openWebsite(url);
    }

    @When("user input email {string} password {string}")
    public void userEnterEmailPassword(String email, String password) {
       sauceLoginPage.loginSaucelab(email, password);
    }

    @When("user input invalid email and valid password")
    public void userEnterInvalidEmailPassword() {

        String invalid_email = "danghoanghuy.0910@gmail.com";
        String invalid_pass = "123456";
        sauceLoginPage.loginSaucelab(invalid_email,invalid_pass);
    }

    @When("user input valid email and valid password")
    public void userEnterValidEmailPassword() {
        sauceLoginPage.loginSaucelab();
    }

    @And("user click Login button")
    public void clickLoginButton() {
        sauceLoginPage.clickLogin();
    }

    @Then("user is redirected to the Product page")
    public void userIsRedirectedToTheProductPage() {
        sauceProductPage.verifyProductPageDisplayed();
    }

    @Then("verify validator error is displayed")
    public void verifyValidatorErrorDisplays() {
        sauceLoginPage.verifyValidatorErrorDisplays();
    }

}
