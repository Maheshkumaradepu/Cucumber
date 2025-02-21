Feature: Login

@sanity
  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://localhost/opencart/upload/"
    And Clicks on MyAccount Login
    And User enters Email as "firstemail@mailinator.com" and Password as "mahesh@12"
    And Click on Login
    Then Page Title should be "My Account"
    When User click MyAccount and on Log out link
    Then Page Title should be "Account Logout"
    And close browser
    
@regression   
  Scenario Outline: Login Data Driver
    Given User Launch Chrome browser
    When User opens URL "http://localhost/opencart/upload/"
    And Clicks on MyAccount Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "My Account"
    When User click MyAccount and on Log out link
    Then Page Title should be "Account Logout"
    And close browser
    
    Examples:
    | email | password |
    | firstemail@mailinator.com | mahesh@12 |
    | firstemail@mailinator.com | mahesh@121 |