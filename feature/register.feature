Feature: Successfull registration

  Scenario: Registration validation
    Given user should be on registraion page
    When user enters the details into below fields
      | Name          | Savina Gowda |
      | Password      | Savina@1307  |
      | Day           |           13 |
      | Month         | July         |
      | Year          |         2000 |
      | Fname         | Savina       |
      | Lame          | Gowda        |
      | Adress1       | Honnavar     |
      | Adress2       | Banglore     |
      | state         | Karnataka    |
      | city          | Honnavar     |
      | zipcode       |       581334 |
      | mobile Number |   8197038529 |
    And user clicks on create account button
    Then user account get created successfully
