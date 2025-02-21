Feature: Registercustomer

@sanity
 Scenario: Registering a new Customer
  Given User Launch Chrome browser
  When User opens URL "http://localhost/opencart/upload/"
  And Clicks on MyAccount Register
  And User enters customer details as  fname as "<fname>" and lname as "<lname>" and email as "<email>" and telephone as "<telephone>" and password as "<password>"  and cnfpassword as "<cnfpassword>"
  And Click on continue
  Then Page Title should be "Your Account Has Been Created!"
  When User click continue after AccCreation
  Then Page Title should be "My Account"
  And close browser
 
