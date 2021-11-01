Feature: Purchase items functionality
  User story : should complete the purchase process of an item from the inventory



  Scenario: User purchases cart items
    Given user is logged in main page as "standard user"
    When user adds <1> item to cart
    And user clicks on "cart badge" button
    And user clicks on "check out" button
    Then user enters zipcode,first and last name
    And user clicks on "continue" button
    And user clicks on "finish" button
    Then user should see check out complete in title



