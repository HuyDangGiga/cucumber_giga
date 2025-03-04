package com.cucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/LoginSaucelab.feature",
        glue = {
                "com.cucumber.projects.website.saucelab.stepdefinitions",
                "com.cucumber.hooks"
        },
        plugin = {
                "com.cucumber.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerLoginSaucelab.html",
                "json:target/cucumber-reports/TestRunnerLoginSaucelab.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        //tags = "@Regression or @Smoke"
        tags = "@Saucedemo"
)

public class TestRunnerSaucelab extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
