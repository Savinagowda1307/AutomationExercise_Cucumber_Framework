Feature: Add To Card
  
  
  Scenario : Add To cart validation
    Given User should be Logged into the automation exercies page
    When user add multiple items to the cart with quantities
    Then Cart Page should Contains the same Items with corresponding qunatities
