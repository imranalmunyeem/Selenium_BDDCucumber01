Feature: Feature to test google search functionality
  I want to use this template for my feature file

  Scenario: Validate google search is working
    Given browser is open 
    And user is on google search page 
    When user enter a text in search box
    And hits enter
    Then user is navigated to search result



