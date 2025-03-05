Feature: Login Test Saucelab

   Background: Navigate to Login page
      Given User navigate to Login Page "https://www.saucedemo.com/"

   @Saucedemo @login @QC_TEAM
   Scenario: Login success with valid username and password
      When user input valid email and valid password
      And user click Login button
      Then user is redirected to the Product page

   @Saucedemo @login @QC_TEAM
   Scenario: Login failed with invalid username but valid password
      When user input invalid email and valid password
      And user click Login button
      Then verify validator error is displayed
