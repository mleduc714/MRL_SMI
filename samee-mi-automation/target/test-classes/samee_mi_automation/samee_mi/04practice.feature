@practice @TEST
Feature: Going through practice test

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirement: At least one student above 2nd grade in SAM with valid credentials for login, must have
  #taken the typing test before taking practice test
  #SMI_s2
  #Student goes through practice test
  Scenario: SMICC-1183
    When I type "grade2c_1" into field
    When I type "Welcome1" into pw field
    And click login
    Then the welcome back page displays
    And I click next
    And I click next
    And I click next
    Then I take the practice test
    Then I validate the precense of the speaker icon for instructions
    Then I validate the text for finishing the practice test