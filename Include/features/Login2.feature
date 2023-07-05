Feature: Test login functionality 2

  Scenario: Check login is successful with valid credentials
    Given user is on login page 2
    When user enters username and password 2
    And clicks on login button 2
    Then user is navigated to the home page 2
