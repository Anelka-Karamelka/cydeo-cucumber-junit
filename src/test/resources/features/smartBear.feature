@smartBear
Feature: SmartBear order process

  Scenario: TC#5: SmartBear order process
    Given User is logged into SmartBear Tester account and on Order page
    And User fills out the form as followed:
    And User selects FamilyAlbum from product dropdown
    When User enters information:
      | quantity        | 4                |
      | customer Name   | John Wick        |
      | street          | Kinzie Ave       |
      | city            | Chicago          |
      | state           | IL               |
      | zipcode         | 60056            |
      | card type       | Visa             |
      | card number     | 1111222233334444 |
      | expiration date | 12/22            |

    Then User clicks process button
    And User verifies John Wick is in the list


