Feature: Linked list functionality
  To check the features in linked list

  Background: 
    Given user is on the linked list page
    
   
  Scenario: Check the contents in the linked list page
    Given user clicks on the introduction link
    When clicks on Try it button
    And text editor opens up
    Then navigate back to linked list home page

    Given user clicks on the insert link
    When clicks on Try it button
    And user enters wrong code
    Then close the browser