
Feature:Etsy Title Verification

  Scenario: Etsy Title Verification
    Given User is on Etsy home page
    Then User sees title is as expected


  Scenario: Etsy Search Functionality Title Verification
    Given User is on Etsy home page
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  @wip
  Scenario: Etsy Search Functionality Title Verification
    Given User is on Etsy home page
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden Spoon" is in the title
