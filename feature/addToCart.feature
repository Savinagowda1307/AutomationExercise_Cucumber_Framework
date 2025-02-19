Feature: Add To Card

  @tag2
  Scenario Outline: Add To cart validation
    Given User should be Logged into the automation exercies page
    Then user can see the added Item in the cart once he add item to the cart with the excel row "<row_number>"

    Examples: 
      | row_number |
      |          1 |
      |          2 |
      |          3 |
      |          4 |
      |          5 |
