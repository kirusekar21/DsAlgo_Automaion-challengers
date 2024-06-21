Feature: Verify the invalid login
 
Scenario: Check the login negative scenarios
 Given user inputs the wrong credentials
 Then user is navigated wrong credentials message
 