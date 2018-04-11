@smilogin @TEST
Feature: Testing login

  Background: 
    Given I open a browser
    And I am on the student access page

  #Requirements: At least one student in Grade K in SAM with valid credentials for login
  # Will only pass if this is their first time logging in - checks for the 'Welcome to the Math Inventory
  # dialogue instead of 'Welcome back'
  #SMI_student1
  #Invalid username
  Scenario: SMICC-797
    When I type "invalidUsername" into field
    When I type "Welcome1" into pw field
    And click login
    Then invalid username or password dialogue box displays
    And I click the popup
	#Valid username, invalid password
  Scenario: SMICC-875
    When I type "gradek_1" into field
    When I type "invalidPassword" into pw field
    And click login
    Then invalid username or password dialogue box displays
    And I click the popup

	#Valid user name, valid password
  Scenario: SMICC-1261
    When I type "grade2a_1" into field
    When I type "Welcome1" into pw field
    And click login
    Then The welcome page displays
    Then I check for speaker icons

	#Logout and decline
  Scenario: SMICC-1169
    When I type "grade2c_1" into field
    When I type "Welcome1" into pw field
    And click login
    When I click the logout button
    Then the logout dialogue box displays
    And I click no
	
	#Logout and confirm
  Scenario: SMICC-1304
    When I type "grade2a_1" into field
    When I type "Welcome1" into pw field
    And click login
    When I click the logout button
    Then the logout dialogue box displays
    And I click yes

	#Log back in
  Scenario: SMICC-1181
    When I type "grade2a_1" into field
    When I type "Welcome1" into pw field
    And click login
    Then the welcome back page displays