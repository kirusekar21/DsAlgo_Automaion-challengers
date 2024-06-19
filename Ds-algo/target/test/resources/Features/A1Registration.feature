
Feature:  To Test New Regitration   

Scenario: Registeration page driver
Given  Registration page

#Scenario: New user registration page
Given The user is on new registration page
When The user clicks Register button with all fields empty
Then The error message appears below  username textbox 


#Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering username with other field empty
Then The error message appears below  password textbox 
    
    
#Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering Username and password with Password Confirmation field empty
Then The error message appears below  Password Confirmation textbox    
 
#Scenario: New user registration page
Given The user is on new registration page
When The user click register after entering valid username and password and invalid Password Confirmation
Then The user is able to see warning msg password did not match

#Scenario: New user registration page
Given The user is on new registration page
When user enter username and password already register
Then user should see user already exist message 


#Scenario: New user registration page
Given The user is on new registration page
When user click login 
Then user should be redirected to login page

#
#Scenario: New user registration page
#Given The user is on new registration page
#When user enter password with less than eight character 
#And  click register
#Then user should see invalid password message
#
#Scenario: New user registration page
#Given The user is on new registration page
#When user enter username and password with correct password confimation
#Then user redirected to DsAlgo HomePage
#And The user should able to see  successful message "New Account Created. You are logged in as teamchallengers"  on  the DS Algo Home Page