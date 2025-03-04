@CMS
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

   @Saucedemo @shopping @debug
   Scenario Outline: user can add products to cart successful
      When user login with valid email and valid password
      And user add product "<product1>" to cart
      And user click on cart icon
      Then verify "<product1>" are on the cart
      Examples:
         | product1              |
         | Sauce Labs Backpack   |
         | Sauce Labs Bike Light |

   @Saucedemo @shopping
   Scenario Outline: user can remove product after adding
      When user login with valid email and valid password
      And user add product "<product1>" to cart
      And user add product "<product2>" to cart
      And user click on cart icon
      And user remove "<product1>" out of cart
      Then verify "<product2>" are on the cart
      And verify "<product1>" are out the cart
      Examples:
         | product1              | product2              |
         | Sauce Labs Backpack   | Sauce Labs Bike Light |
         | Sauce Labs Bike Light | Sauce Labs Backpack   |