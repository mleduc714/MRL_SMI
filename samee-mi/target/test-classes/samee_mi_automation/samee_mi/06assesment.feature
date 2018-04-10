@assesment @TEST
Feature: Student goes through asssesment

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirement: At least one student in SAM with valid credentials for login, must have
  #taken the typing test and practice test before taking the assessment
  #SMI_s1
  #Assessment
  Scenario: SMICC-1177
    When I type "grade2c_1" into field
    When I type "Welcome1" into pw field
    And click login
    And I click next
    And I click next
    And I click next
    Then I take the assesment
    Then I validate that end assesment dialogue is displayed