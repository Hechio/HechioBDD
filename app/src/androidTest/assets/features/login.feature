Feature: Ability of the customer to login

  Scenario Outline: Where the customer request to login
    Given the login screen is displayed to the customer
    When the customer enters email "<email>"
    And the customer enters password "<password>"
    And the customer requests to  login
    Then the login status will be "<status>"
    Examples:
      | email                 | password   | status        |
      | someemail@gmail.com   | qwerty1234 | Login Failed  |
      | example@gmail.com     | somePass02 | Login Failed  |
      | stevehechio@gmail.com | sayNerd001 | Login Success |