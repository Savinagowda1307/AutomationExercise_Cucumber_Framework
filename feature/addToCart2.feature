Feature: Add to cart DDT validation

  Scenario Outline: Add to cart
    Given User shoulb be logged into the login page
    When user add "<product_names>" to the cart
    Then user able to see the same product on the cart page

    Examples: 
      | product_names                                |
      | Men Tshirt                                   |
      | Summer White Top                             |
      | Frozen Tops For Kids                         |
      | Printed Off Shoulder Top - White             |
      | Long Maxi Tulle Fancy Dress Up Outfits -Pink |
