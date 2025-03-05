Feature:Order product test Saucelab

   Background: Navigate to Login page
      Given User navigate to Login Page "https://www.saucedemo.com/"

   @Saucedemo @shopping @debug
   Scenario Outline: Adding products to cart successful
      When user login with valid email and valid password
      And user add product "<product1>" to cart
      And user click on cart icon
      Then verify "<product1>" are on the cart
      Examples:
         | product1              |
         | Sauce Labs Backpack   |
         | Sauce Labs Bike Light |

   @Saucedemo @shopping
   Scenario Outline: removing product after adding in cart
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

   @Saucedemo @shopping
   Scenario Outline: Ordering product and checkout successfully
      When user login with valid email and valid password
      And user add product "<product1>" to cart
      And user click on cart icon
      And user click checkout button
      And user input valid customer info
      And user click continue button
      And user click finish button
      Then verify order message after completed checkout

      Examples:
         | product1             |
         | Sauce Labs Backpack  |