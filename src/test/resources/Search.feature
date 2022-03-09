@Search
Feature: Search
  Scenario Outline: Search the product
    Given The User open the apps and click next all step on user guide
    And User search the product "<productName>"
    When User click on 1st suggestion list on search bar
    Then Product title should be displayed
    Examples:
    | productName |
    | payung      |
