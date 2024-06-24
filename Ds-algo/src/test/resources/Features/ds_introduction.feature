Feature: Login page Automation of DS-ALGO 

Scenario: Login page
#Given The User is on the DS Algo Sign in page
#When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
Then The User should navigate to Data structures - Introduction page

Scenario: Data structures - Introduction page
Given The User is on Data structures - Introduction page
When The User clicks Time complexity
And click tryme
Then The User should be directed to code Editor

Scenario: Data structures - Introduction page
Given user enter valid data 
When user click run
Then The User should be see output

Scenario: Data structures - Introduction page
Given user enter no data 
When user click run
Then Nothing displays and user directed to dspage

Scenario: Data structures - Introduction page
Given user on practice question
When User click practice
Then Nothing displays and user directed to dspage