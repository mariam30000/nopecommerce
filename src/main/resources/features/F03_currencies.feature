@smoke
  Feature:change currencies for website
    Scenario: user can change currency of website to euro
      Given user click on box of currencies
      When user select euro
      Then website elements changed to euro