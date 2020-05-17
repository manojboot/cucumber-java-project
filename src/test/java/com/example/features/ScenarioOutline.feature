
Feature: Final Bill Calculation

@SceanrioOutlineExample
Scenario Outline: Customer Bill Amount Calculation
Given I have a Customer
And user enters intial bill amoutn as <IntialBillAmount>
And Sales Tax Rate is <TaxRate> percent
Then final bill amount calculate is <CalculatedBillAmount>
Examples:
|IntialBillAmount|TaxRate|CalculatedBillAmount|
|100						 |10		 |110									|
|200						 |10		 	 |220									|
|100						 |5.85	 |105.85							|