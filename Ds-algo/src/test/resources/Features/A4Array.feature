Feature: Login page Automation of Array 

Scenario: Login page
Given The User is on the DS Algo Sign in page
When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
Then The User should navigate to Array Page

Scenario: Check the user is on the DS Array page
    Given user clicks on Arrays in Python 
    Then user is navigated to Arrays in Python page
Scenario: Check the user is on the DS Array page   
    Given User enters valid code in Arrays in Python Try Editor Box
    When The User clicks "Run" in AIP button
    Then the output will be displayed in the output window AIS 
Scenario: Check the user is on the DS Array page
    Given The User enters invalid code in Arrays in Python Try Editor Box
    When The User again clicks on the "Run" in AIP button
    Then the "Error message"should appear in Arrays in Python 

Scenario: check the Arrays using List
    Given the user clicks on the Arrays using List link in the page
    Then user is navigated to the Arrays using List in Arrays page
    
    Scenario: check the Arrays using List
    Given User enters valid code Editor in Arrays List Page
    When The User clicks on the "Run" button of Arrays using List link
    Then we get the output in output page of Arrays using List
    
    Scenario: check the Arrays using List
    Given User gives invalid code in Arrays using List Try Editor
    When The User clicks on the "Run" button of the Arrays using List page again
    Then the "Error message" should be captured in Arrays using List
    
    Scenario: check the Basic Operations in List page
    Given user clicks on the Basic Operations in List in the Arrays page
    Then user is navigated to the Basic Operations in List page
    
    Scenario: check the Basic Operations in List page
    Given User enters valid code in Editor Basic Operations in List page
    When The User clicks on the "Run" button in the Basic Operations in List page
    Then we get output in the output box in the Basic Operations in List page
    
    Scenario: check the Basic Operations in List page
    Given User enters invalid code in the Editor Basic Operations in List
    When The User again clicks on the "Run" button in the Basic Operations in List page
    Then the alert "Error message" should be displayed in the Basic Operations in List
    
    Scenario: check the Application of Array link in Arrays page
    Given user clicks on the application of Array link in the Arrays page
    Then user is navigated to the application of array link page
    
      Scenario: check the Application of Array link in Arrays page
    Given User enters valid code in Editor application of array page
    When The User clicks on the "Run" button in the application of array page
    Then we get output in the output box in the application of array page
    
      Scenario: check the Application of Array link in Arrays page
    Given User enters invalid code in the Editor application of array
    When The User again clicks on the "Run" button in the application of array page
    Then the alert "Error message" should be displayed in application of array

    Scenario: check the practice questions link in the array page
    Given user clicks on the practice questions link in the array page
    Then user is navigated to the practice questions link in the array page
    
    Scenario: sign out page
    Given sign out