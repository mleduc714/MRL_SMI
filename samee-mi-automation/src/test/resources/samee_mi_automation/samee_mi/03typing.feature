@typing @TEST
Feature: Going through typing test

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirement: At least one student above 2nd grade in SAM with valid credentials for login
  #SMI_s2
  #Student goes through typing test
  Scenario: SMICC-1273
    When I type "grade2d_1" into field
    When I type "Welcome1" into pw field
    And click login
    Then the welcome back page displays
    And I click next
    Then I check typing test displays