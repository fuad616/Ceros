Feature: Shopping cart functionality
  User Story : When i click on add item to cart,
  item name and total number should be shown in cart

  Scenario: User adds item to cart verification
    Given user is logged in main page as "standard user"
    When user adds <1> item to cart
    Then user should see "1" item in cart

  Scenario: User adds 6 item to cart verification
    Given user is logged in main page as "standard user"
    When user adds <6> item to cart
    Then user should see "6" item in cart