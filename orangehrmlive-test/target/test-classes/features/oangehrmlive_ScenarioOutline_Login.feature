@Login_version2
Feature: Login as Admin/Hr 
	As a User, I want to login to OrangeHrmLive Website 
	when I provide username and password
	
 Background:
      Given I am on the orangehrmlive webpage
      
Scenario Outline: Login as a Admin/Hr version two 
	When I login "< username>"  and  "<password>" 
	Then I should be able to verify that I am logged in 3
	
	Examples:
 |	username   |    password |
 |	Admin      |    admin123 |
 | CodeinHub   |    Code12345 |  
 |	Admin      |    admin123 |
	
	