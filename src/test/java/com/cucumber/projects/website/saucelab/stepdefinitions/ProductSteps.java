package com.cucumber.projects.website.saucelab.stepdefinitions;

import com.cucumber.hooks.TestContext;
import com.cucumber.keywords.WebUI;
import com.cucumber.projects.website.saucelab.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {

    SauceProductPage sauceProductPage;
    SauceCartPage sauceCartPage;

    public ProductSteps(TestContext testContext) {
        sauceProductPage = testContext.getsauceProductPage();
        sauceCartPage = testContext.getsauceCartPage();
    }

    @When("user add product {string} to cart")
    public void userAddProduct(String product_name) {
        sauceProductPage.addProduct2Cart(product_name);
    }

    @When("user click on cart icon")
    public void navigateToCart() {
        sauceProductPage.navigateToCartPage();
    }

}
