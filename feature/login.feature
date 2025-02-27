Feature: Successfull Login

@sanity
  Scenario: Login Validation
    Given user should be on login page
    When user enters email as "savinagowdahnr@gmail.com" and password as "Savina@1307"
    And user click on login button
    Then user nagigate to the my account page successfully

@regression
  Scenario Outline: Login Data driven
   Given user should be on login page
   When user enters email as "<email>" and password as "<password>"
    And user click on login button
    Then user nagigate to the my account page successfully

    Examples: 
      | email                    | password    |
      | savinagowdahnr@gmail.com | Savina@1307t |
      | savinagowdahnr@gmail.com | Savina@1307 |
