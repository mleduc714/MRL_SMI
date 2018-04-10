@screener @TEST
Feature: Testing screener

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirement: At least one student below 2nd grade in SAM with valid credentials for login
  #Note: Student must be different from student used in smi_login file
  #SMI_student4
  #Student goes through screener
  Scenario: SMICC-1170
    When I type "grade1c_1" into field
    When I type "Welcome1" into pw field
    And click login
    And I click next
    And I take Grade1 screener and logout