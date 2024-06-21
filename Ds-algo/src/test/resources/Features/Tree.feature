
Feature: Tree functionality
  To check the features in linked Tree Page
  
  Background: 
    Given user is on the Tree page

  Scenario: Check the contents in the Tree page
    
    Given user clicks on the introduction Treelink
    When clicks on Try it tree button
    And text editor Tree opens up
    Then navigate back to Tree home page
  
   
    Given user clicks on the insert Tree link
    When clicks on Try it tree button
    And user enters tree wrong code
    Then close the tree browser
