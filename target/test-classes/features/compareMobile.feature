Feature: i verify user can compare 2 selected products

  Scenario Outline: i verify user can compare 2 mobiles
    Given user lands on home page
    And i verify user is on home page
    When user clicks mobile button
    And i verify user lands on mobile page
    When user select "<xperiaAddTocompare>" button and "<iphoneAddTocompare>" of two mobiles and selects compare button
    When user switches the window
    And i verify that user witched his control to pop up
    And i verify compare products and the selected compare products are displayed in it

    Examples: 
      | xperiaAddTocompare | iphoneAddTocompare |
      |                  0 |                  1 |
