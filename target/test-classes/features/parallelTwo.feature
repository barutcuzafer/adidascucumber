Feature: parallel two functionality

  @parallel
Scenario Outline:User checks different laptops can be added to cart <differentLaptops>
Then User adds some "<differentLaptops>" from "Laptops"
Examples:
| differentLaptops |
| Samsung galaxy s6|
| Nokia lumia 1520 |
