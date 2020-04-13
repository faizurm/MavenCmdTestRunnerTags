Feature: i verify mobiles are sorted according to the names

  Scenario Outline: i verify mobile r sorted according to the names
    Given user lands on home page
    And i verify user is on home page
    When user clicks mobile button
    And i verify user lands on mobile page
    When user selects sort by to "<name>"
    And i verify all products are sorted according to names

    Examples: 
      | name |
      |    1 |
