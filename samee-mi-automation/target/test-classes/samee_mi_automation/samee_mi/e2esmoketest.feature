@e2esmoke
Feature: Validating login test
 
 ## Data is sent through properties file
 Scenario: SMICC-878
 		Given I open the "Firefox" browser in "ACS or AWS" env
 	  Then Student opens and logs into Math Inventory application
 	#	When Student navigates to StudentAccess page //mi_test2
 	#And Clicks on Math Inventory application
 	#Then "Grade 10" Student logs in with the Credentials
   #Then Completes Typing Test
    