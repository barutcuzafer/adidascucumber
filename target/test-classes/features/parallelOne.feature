Feature: parallel one functionality

  @parallel
  Scenario: Verify all the products exist in the products pages
    Then Under "Phones" category User should be able to see the list of the following products
      | Samsung galaxy s6 |
      | Nokia lumia 1520  |
      | Nexus 6           |
      | Samsung galaxy s7 |
      | Iphone 6 32gb     |
      | Sony xperia z5    |
      | HTC One M9        |
    Then Under "Laptops" category User should be able to see the list of the following products
      | Sony vaio i5        |
      | Sony vaio i7        |
      | MacBook air         |

    Then Under "Monitors" category User should be able to see the list of the following products
      | Apple monitor 24  |
      | ASUS Full HD     |