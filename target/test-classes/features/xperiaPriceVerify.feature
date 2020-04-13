Feature: i verify xperia mobile cost in the result page

  Scenario: i verify xperia mobile cost in the result page
    Given user lands on home page
    And i verify user is on home page
    When user clicks mobile button
    And i verify user lands on mobile page
    When i get the  price of the xperia mobile
    When i click the sony xperia mobile
    And i verify user land on sony Xperia cart page
    Then i verify the price in the detail page and the previous page are same
