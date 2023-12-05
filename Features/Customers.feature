
Feature: Customer
 
  Scenario: Add new Customer
   Given Launch Chrome Browser
   When User opens URL "https://admin-demo.nopcommerce.com/login"
   And  User enters Email as "admin@yourstore.com" and Password as "admin"
   And  Click on Login
   Then User can view Dashboard
   When User click on customers menu
   And click on customers menu item
   And click on Add new button
   Then User can view Add new customer page
   When User enters customer info
   And click on Save button
   Then User can view confirmation message "The new customer has been added succcessfully."
   And Close Browser
   
 
