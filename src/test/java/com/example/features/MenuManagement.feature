#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
   #@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Menu Management

@SmokeTest
Scenario: Add a menu item
Given I have menu item with name "Aaloo Paratha" and price 30
When I add that menu item
Then Menu Item with name "Aaloo Paratha" should be added

@RegularTest
Scenario: Add another menu item
Given I have menu item with name "Chicken Tikka" and price 240
When I add that menu item
Then Menu Item with name "Aaloo Paratha" should be added

@LoadTest @RegularTest
Scenario: Add third menu item
Given I have menu item with name "Hakka Noodles" and price 130
When I add that menu item
Then Menu Item with name "Aaloo Paratha" should be added