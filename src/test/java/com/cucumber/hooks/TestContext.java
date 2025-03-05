package com.cucumber.hooks;

import com.cucumber.driver.DriverManager;
import com.cucumber.driver.TargetFactory;
import com.cucumber.projects.website.saucelab.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    public TestContext() {
        WebDriver driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }

    private SauceLoginPage sauceLoginPage;
    private SauceProductPage sauceProductPage;
    private SauceCartPage sauceCartPage;



    public SauceLoginPage getsauceLoginPage() {
        if (sauceLoginPage == null) {
            sauceLoginPage = new SauceLoginPage();
        }
        return sauceLoginPage;
    }

    public SauceProductPage getsauceProductPage() {
        if (sauceProductPage == null) {
            sauceProductPage = new SauceProductPage();
        }
        return sauceProductPage;
    }

    public SauceCartPage getsauceCartPage() {
        if (sauceCartPage == null) {
            sauceCartPage = new SauceCartPage();
        }
        return sauceCartPage;
    }


    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
