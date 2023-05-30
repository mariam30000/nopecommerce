@smoke
Feature: login-user could log in website with his valid credentials
  Scenario: user can login with valid email and password
    Given user go to login page
    When user fill with valid data
    And press on login button
    Then login done successfully
  Scenario: user can't login with invalid email and password
    Given user go to login page
    When user fill with invalid data
    And press on login button
    Then login doesn't done

