$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("orangehrmlive_employee_registration_datatable.feature");
formatter.feature({
  "line": 2,
  "name": "Valid registration of Employees Account by Admin/HR",
  "description": "",
  "id": "valid-registration-of-employees-account-by-admin/hr",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login_datatable"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the orangehrmlive webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.i_am_on_the_orangehrmlive_webpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "#create scenario with a header"
    }
  ],
  "line": 17,
  "name": "Employee Registration with header",
  "description": "",
  "id": "valid-registration-of-employees-account-by-admin/hr;employee-registration-with-header",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Login_datatable_withHeader"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I login as a Admin/Hr",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I register Employee Accounts with header",
  "rows": [
    {
      "comments": [
        {
          "line": 20,
          "value": "# directly putting data here"
        }
      ],
      "cells": [
        "fname",
        "lname",
        "username",
        "password",
        "comfirmpassword"
      ],
      "line": 21
    },
    {
      "cells": [
        "Nina",
        "Lou",
        "Meandyou",
        "key12345",
        "key12345"
      ],
      "line": 22
    },
    {
      "cells": [
        "Vale",
        "Toy",
        "totoes",
        "key12345",
        "key12345"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Employee accounts are created any ready for further use",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefs.i_login_as_a_Admin_Hr()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Add_Employee.i_register_Employee_Accounts_with_header(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Add_Employee.employee_accounts_are_created_any_ready_for_further_use()"
});
formatter.result({
  "status": "skipped"
});
});