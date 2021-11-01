Feature: Ceros Login functionality
  User Story : When i am at login page and enter valid credentials,
  I should get to home page


  Scenario Outline: Login functionality verification
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user is on home page

    Examples:
                  | username | password |
   | standard_user           | secret_sauce  |
   | locked_out_user         | secret_sauce  |
   | performance_glitch_user | secret_sauce  |






