
Feature:  To Test New Regitration 
#
Scenario: New user registration page
Given The user is on new registration page
When The user clicks Register button 
Then The error message appears below  username textbox 

Scenario: New user registration page
Given The user is on new registration page
When user enter username with digits
Then The error message appears below  username textbox 

Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering username with other field empty
Then The error message appears below  password textbox 
    
 Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering Username and password with Password Confirmation field empty
Then The error message appears below  Password Confirmation textbox    
 
Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering valid username and password and invalid Password Confirmation
Then The user is able to see warning msg password did not match

Scenario: New user registration page
Given The user is on new registration page
When user enter username and password already register
Then user should see user already exist message 

Scenario: New user registration page
Given The user is on new registration page
When user click register after enter password with digits
Then user should see invalid password message

Scenario: New user registration page
Given The user is on new registration page
When user enter username and password with correct password confimation
Then The user should able to see  successful message New Account Created.You are logged in as ninjagirlss on the DS Algo Home Page




