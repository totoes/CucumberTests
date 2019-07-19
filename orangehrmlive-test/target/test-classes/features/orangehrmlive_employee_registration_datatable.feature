@Login_datatable
Feature: Valid registration of Employees Account by Admin/HR

Background:
   Given I am on the orangehrmlive webpage
   
   Scenario: Employee Registration 
     When I login as a Admin/Hr
     And I register Employee Accounts
     # directly putting data here 
         | Nina   |  Lou   |Meandyou  | key12345 | key12345 |
         | Vale   |  Toy   |  totoes  |  key12345 | key12345 |
      Then Employee accounts are created any ready for further use 
     
  #create scenario with a header 
  @Login_datatable_withHeader   
      Scenario: Employee Registration with header 
     When I login as a Admin/Hr
     And I register Employee Accounts with header 
     # directly putting data here 
          | fname  |   lname |  username  |  password | comfirmpassword |
         | Nina   |  Lou   |Meandyou  | key12345 | key12345 |
         | Vale   |  Toy   |  totoes  |  key12345 | key12345 |
      Then Employee accounts are created any ready for further use 
      
     
     
     
     
     