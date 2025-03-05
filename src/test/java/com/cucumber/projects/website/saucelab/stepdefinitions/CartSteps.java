package com.cucumber.projects.website.saucelab.stepdefinitions;

import com.cucumber.hooks.TestContext;
import com.cucumber.projects.website.saucelab.pages.SauceCartPage;
import com.cucumber.projects.website.saucelab.pages.SauceProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {

    SauceProductPage sauceProductPage;
    SauceCartPage sauceCartPage;

    public CartSteps(TestContext testContext) {
        sauceProductPage = testContext.getsauceProductPage();
        sauceCartPage = testContext.getsauceCartPage();
    }

    @When("user click checkout button")
    public void checkout() {
        sauceCartPage.checkout();
    }

    @When("user click continue button")
    public void continues() {
        sauceCartPage.continues();
    }

    @When("user click finish button")
    public void finish() {
        sauceCartPage.finishs();
    }

    @When("user input valid customer info")
    public void inputShippingInfo() {
        sauceCartPage.inputShippingInfo();
    }

    @Then("verify {string} are on the cart")
    public void verifyProductInCart(String product_name){
        sauceCartPage.verifyProductInCart(product_name);
    }

    @Then("verify {string} are out the cart")
    public void verifyProductOutCart(String product_name){
        sauceCartPage.verifyProductOutCart(product_name);
    }

    @When("user remove {string} out of cart")
    public void removeProductInCart(String product_name){
        sauceCartPage.removeProductInCart(product_name);
    }

    @Then("verify order message after completed checkout")
    public void verifyOrderMessage(){
        sauceCartPage.verifyCompleteOrder();
    }
}
