@smoke
Feature: registration-user could register with valid data
  Scenario: user could create account with all valid data

    Given user press on register icon

    When user fill all required data
    And user press on register button
    Then registation done successfully

