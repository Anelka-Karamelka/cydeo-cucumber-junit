Feature: User should be able to login using correct credentials


  Scenario: Positive login scenario
  Given user is on login page of table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should sees url contains orders
  @wip
  Scenario: Positive login scenario
    Given user is on login page of table app
    When user enters username "Test" password "Tester" and logins
    Then user should sees url contains orders

