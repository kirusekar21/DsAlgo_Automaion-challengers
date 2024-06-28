Feature: Login page Automation of Queue

Scenario: Login page
Given The User is on the DS Algo Sign in page
When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
Then The User should navigate to Queue Page

Scenario: Check the implementation of Queue in python
Given The User is in the Queue page after logged in
When The User clicks the Implementation of Queue in python link
Then The User should be directed to "Implementation of Queue in Python" Page
And User is in the Try Editor page
When User clicks the "Try Editor" button
Then page navigated to the python coding part

Scenario: Check the implementation of Queue in python
Given User given valid code in the Try Editor 
When The User clicks the Run button
Then we get output in the output window

Scenario: Check the implementation of Queue in python
Given User given invalid code in the Try Editor
When The User clicks the "Run" button again
Then we get the "Error message"

Scenario: Check the implementation using collections.deque
Given  The User navigated back to the Queue page
When The User clicks the "Implementation using collections.deque" 

Scenario: Check the implementation using collections.deque
Given User is on the Try here page
When User clicks "Try Here" button
Then page navigated to the pythonbox

Scenario: Check the implementation using collections.deque
Given User given valid code in the Try Here box
When The User clicks the Run button 
Then we get output for the code

Scenario: Check the implementation using collections.deque
Given User given invalid code in the Try Here box
When The User clicks "Run" button again 
Then we get the "Error message" in the Alertbox

Scenario: Check the implementation using Array
Given The User is on the Implementation Array page
When The User click the "Implementation using Array"

Scenario: Check the implementation using Array 
Given User is on the Try here page for Implementation of Array
When User clicks "Try Here" button in the Array page
Then page navigated to the pythoncodebox page

Scenario: Check the implementation using Array
Given User given valid code in the Try Here box for Array
When The User clicks "Run" button for Array Implementation
Then User get valid output for the Array Implementation

Scenario: Check the implementation using Array
Given User given invalid code in the Try Here box for Array
When The User clicks "Run" button again for Array Implementation
Then we get the "Error message" in the Alertbox for Array Implementation


Scenario: Check the Queue Operations
Given The User is on the Queue operations page
When The User clicks the "Queue operations" button in the Queue

Scenario: Check the Queue Operations
Given User is on the Try here page for Queue operations
When User clicks the "Try Here" button in the Queue operations page
Then page navigated to the python code textbox

Scenario: Check the Queue Operations
Given User given valid code in the Try Here box for Queue operations
When the User clicks the "Run" button for Queue operations
Then User get the valid output for the Queue operations

Scenario: Check the Queue Operations
Given User given invalid code in the Try Here box for Queue operations
When The User clicks "Run" button again for Queue operations
Then we get the "Error message" in the Alertbox for Queue operations

Scenario: Navigate to the practice questions page
Given The User is on the Queue page
When The User clicks the "practice questions" button in the Queue page
Then page get navigated to the practice questions page

Scenario: sign out page
Given sign out