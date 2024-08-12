package com.cucumber.hooks;

import com.cucumber.driver.DriverManager;
import com.cucumber.driver.TargetFactory;
import com.cucumber.projects.website.cms.pages.CommonPageCMS;
import com.cucumber.projects.website.cms.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;

    public TestContext() {
        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }

    private LoginPage loginPage;
    private CommonPageCMS commonPageCMS;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CommonPageCMS getCommonPage() {
        if (commonPageCMS == null) {
            commonPageCMS = new CommonPageCMS();
        }
        return commonPageCMS;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
