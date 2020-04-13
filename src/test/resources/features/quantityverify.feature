Feature: i verify xperia mobile cost in the result page 

Scenario: i verify xperia mobile cost in the result page 
	Given user lands on home page 
	And i verify user is on home page 
	When user clicks mobile button 
	And i verify user lands on mobile page 
	When i click the cart button of the sony xperia mobile 
	When user clicks the qty button 
	When user enters the quantity 
		| 1000 |
	And i verify the error message 
	When user clicks the empty cart button 
	Then i verify the shopping cart is empty 
