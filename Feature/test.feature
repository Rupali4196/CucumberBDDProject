Feature: Shopping Cart 
Scenario: Add item to cart   
Given I am on the product page for "Mobile Phone"   
When I add the product to the cart    
Then The shopping cart should contain "Mobile Phone"