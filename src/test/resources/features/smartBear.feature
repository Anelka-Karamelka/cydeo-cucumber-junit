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


    @scenarioOutline
    Scenario Outline: TC#5: SmartBear order process
      Given User is logged into SmartBear Tester account and on Order page
      When User fills out the form as followed from the table below:
      And User selects "<product>" from product dropdown
      And  User enters "<quantity>" to quantity
      And  User enters "<customer name>" to costumer name
      And  User enters "<street>" to street
      And  User enters "<city>" to city
      And  User enters "<state>" to state
      And User enters "<zip>" to zip
      And  User selects "<cardType>" as card type
      And  User enters "<card number>" to card number
      And User enters "<expiration date>" to expiration date
      And  User clicks process button
      Then  User verifies "<customer name>" is in the list
Examples:
  | product     | quantity | customer name | street           | city                | state  | zip   | cardType   | card number  | expiration date | customer name |
  | ScreenSaver | 2        | Paul Brown    | 5, Ringer Street | Las Vegas,NV        | US     | 748   | MasterCard | 123456789012 | 02/07           | Paul Brown    |
  | FamilyAlbum | 1        | Mark Smith    | 9, Maple Valley  | Whitestone, British | Canada | 76743 | VISA       | 770077007700 | 01/09           | Mark Smith    |
  | ScreenSaver | 1        | Steve Johns   | 17, Park Avenue  | Salmon Island       | Canada | 21233 | MasterCard | 444555444555 | 03/09           | Steve Johns   |

