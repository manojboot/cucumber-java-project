

Feature: Data Tables


@ListofStrings
Scenario: Bill Amount Generation
Given I placed an order for the following items
|Aaloo Parotha|2|20|
When I generate the bill
Then a bill for $40 should be generated


@ListofListOfStrings
Scenario: Bill Amount Generation
Given I placed an order for the following items
|Aaloo Parotha|2|20|
|Onion Parotha|2|20|
|Gobi  Parotha|2|20|
When I generate the bill
Then a bill for $40 should be generated

@ListofMaps
Scenario: Bill Amount Generation
Given I placed an order for the following items
|ItemName     |Units|UnitPrice|
|Aaloo Parotha|2    |20       |
|Onion Parotha|2    |20       |
|Gobi  Parotha|2    |20       |
When I generate the bill
Then a bill for $40 should be generated
