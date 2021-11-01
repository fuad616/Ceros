Feature: Sort items functionality
  User Story : sort the inventory items by price, high to low.
               sort the inventory items by name, Z-to-A


  Scenario: sort the inventory items by price, high to low.

    Given user is logged in main page as "standard user"
    And user clicks on sort button
    When user selects "za"
    Then inventory items are sorted
