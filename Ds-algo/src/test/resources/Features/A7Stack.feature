Feature: Login page Automation of Stack 

Scenario: Login page
Given The User is on the DS Algo Sign in page
When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
Then The User should navigate to Stack Page

Scenario: Check the user is on the DS stack page
    Given user clicks on Operations in stack
    Then user is navigated to operations in stack page
    Given User enters valid code in Try Editor Box
    
    Scenario: Check the user is on the DS stack page
    When The User clicks code Run button
    Then the output will be displayed in the output window
    
    Scenario: Check the user is on the DS stack page
    Given The User enters invalid code in Try Editor Box
    When The User again clicks on the "Run" button
    Then the "Error message"should appear
    
 Scenario: check the implementation of stack
    Given user clicks on the implementation link in the page
    Then user is navigated to the implementation in stack page
    
    Scenario: check the implementation of stack
    Given User enters valid code Editor
    When The User clicks on the "Run" button of implementation stack link
    Then we get the output in output page
    
    Scenario: check the implementation of stack
    Given User gives invalid code in Try Editor
    When The User clicks on the "Run" button of the page again
    Then the "Error message" should be captured
    
    
    Scenario: check the Application link in stack page
    Given user clicks on the application link in the stack page
    Then user is navigated to the application link page
    
    Scenario: check the Application link in stack page
    Given User enters valid code in Editor application page
    When The User clicks on the "Run" button in the application page
    Then we get output in the output box in the page
    
     Scenario: check the Application link in stack page
    Given User enters invalid code in the Editor application stack
    When The User again clicks on the "Run" button in the application stack page
    Then the alert "Error message" should be displayed
    
    Scenario: check the practice questions link in the stack page
    Given user clicks on the practice questions link in the stack page
    Then user is navigated to the practice questions link in the page
    
    Scenario: sign out page
    Given sign out