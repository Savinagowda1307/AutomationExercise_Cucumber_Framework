 Feature: Login Data driven with Excel

  Scenario Outline: Login Data driven  Excel
    Given the user is navigate to login page
    Then user should be redirected to the MyAccount page by passing email and password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
