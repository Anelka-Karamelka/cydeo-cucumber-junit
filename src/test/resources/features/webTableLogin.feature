Feature: User should be able to login using correct credentials

  Background: user is on the login page

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should sees url contains orders

  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should sees url contains orders


  Scenario: User should be able to see all 12 months in months dropdown
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should sees url contains orders

