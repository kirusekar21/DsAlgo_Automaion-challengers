Feature: Login page Automation of DS-ALGO 

Scenario: DS Introduction page
Given The user should open the DS Algo Portal URL
And User is on the DS Introduction page 
When User clicks the datastructures dropdown list

Scenario: Checking Dropdown List
When The User selects any datastructures from the dropdown list without signin
Then The User should be able to see the error message "You are not logged in"

Scenario: Checking Get Started button for DS Introduction page 
When The User clicks any "Get started" button of datastructures on the DS introduction page
Then The User should be able to see the error message "You are not logged in"

Scenario: Validation of Registration link
When User clicks Registration link on the DS introduction page
Then User should be able to navigate to Registration page

Scenario: Login page
Given The User is on the DS Algo Sign in page
When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
Then The User should navigate to Data structures - Introduction page

Scenario: Login page
Given The User should navigate to Data structures - Introduction page

Scenario: Data structures - Introduction page
Given The User is on Data structures - Introduction page
When The User clicks Time complexity
And click tryme
Then The User should be directed to code Editor

Scenario: Data structures - Valid Introduction page
Given user enter valid data 
When user click run
Then The User should be see output

Scenario: Data structures - with No data Introduction page
Given user enter no data 
When user click run
Then Nothing displays and user directed to dspage

Scenario: Data structures - practice page
Given user on practice question
When User click practice
And  Nothing displays 
Then user directed to Ds Home page

Scenario: sign out page
Given sign out