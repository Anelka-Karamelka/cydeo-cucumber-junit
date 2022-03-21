Feature: Examples of Cucumber Data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | grape       |
      | mango       |
      | pomegranate |

  @dataTables
  Scenario: User should be able to see all 12 month in months dropdown
  Given User is on login page of CRM
  When User enters below credentials
    | username | helpdesk59@cydeo.com |
    | password | UserUser             |
  Then user should see



    #to bueatify the pipes above
  #mac command+option+l
  #windows control+alt+l


