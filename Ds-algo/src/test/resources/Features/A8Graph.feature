  Feature: To Test Graph page
  
  Scenario: Login page
  Given The User is on the DS Algo Sign in page
  When The User clicks Login button after entering valid "numpygirls" and "@Aagks123"
 
  #Scenario: Graph home page
    #Given The user is on the graph home page

  Scenario: Graph home page
    Given The user is on the graph home page
    When The user click link "Graph"
    Then The user should be redirected to inside of "Graph" page.

  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  Scenario: Python Editor page
    Given The user is on the Python Editor
    When The user writes the valid python code
    And click run
    Then The user is able to see the output inside the console.

  Scenario: Python Editor page
    Given The user refresh Python Editor
    When The user writes the invalid python code
    And click run
    Then The user see error msg in alert window.

  Scenario: The user is on the Graph page
    Given The user navigated back to graph page
    When The user clicks Graph Representations link
    Then The user should be redirected to Graph Representations page.

  Scenario: The user is on the Graph Representations page
    Given The user is on the Graph Representations page
    When The user clicks Try Here button
    Then The user should be redirected to a page having Editor and run button

  Scenario: Python Editor page without data
    Given The user is on the Python Editor
    When The user clicks the Run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

  Scenario: Graph Representation Python Editor page
    Given The user is on the Python Editor
    When The user writes the valid Graph Representation python code
    When click run
    Then The user is able to see the output inside the console.

  Scenario: Python Editor page
    Given The user refresh Python Editor
    When The user writes the invalid python code
    And click run
    Then The user see error msg in alert window.

  Scenario: The user is on the "Graph" page
    Given The user navigated back to graph page
    When The user clicks Practice Questions link
    Then The user should be redirected to Practice Questions page.
   Scenario: sign out page
    Given sign out 

