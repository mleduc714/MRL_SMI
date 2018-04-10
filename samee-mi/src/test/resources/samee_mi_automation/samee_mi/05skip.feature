@skip @TEST
Feature: Validating skip functionality

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirements: At least one student in SAM with valid credentials for login
  #SMI_s1
  #Skip
  Scenario: SMICC-1176
    When I type "grade2c_1" into field
    When I type "Welcome1" into pw field
    And click login
    And I click next
    And I click next
    And I click next
    When I click skip
    Then I validate the skip popup dialogue
    Then I click no
    And I check if I still have 3 skips
    When I click skip
    Then I validate the skip popup dialogue
    Then I click yes
    And I check if I still have 2 skips