Feature: Login

Scenario: Sucessful Login with valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://admin-demo.nopcommerce.com/login"
	And User enters Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page Title Should be "Dashboard / nopcommerce administration" 
	When User click on Log out link
	Then Page Title should be "Your store. Login"
	And close browser 