package com.orangehrmlive.step_definitions;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrmlive.pages.AddEmployee;
import com.orangehrmlive.pages.Dashboard;
import com.orangehrmlive.pages.PIM;
import com.orangehrmlive.pages.PersonalDetails;
import com.orangehrmlive.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Employee {

	PIM pimObject = new PIM();
	AddEmployee addEmployee = new AddEmployee();
	PersonalDetails personalDetails = new PersonalDetails();
	Dashboard dashboard = new Dashboard();

	@When("^I go to PIM tab from menu$")
	public void i_go_to_PIM_tab_from_menu() throws Throwable {
		// click on PIM TAB
		pimObject.pim.click();
	}

	@When("^I click add employee$")
	public void i_click_add_employee() throws Throwable {
		// click on add Employee
		addEmployee.addEmp.click();
	}

	@When("^I complete the required information$")
	public void i_complete_the_required_information() throws Throwable {
		// enter first name
		addEmployee.firstName.sendKeys("Nina");
		// enter last name
		addEmployee.lastName.sendKeys("Lou");
		// select the checkbox
		addEmployee.checkBox.click();
		// enter username

		addEmployee.userName.sendKeys("Meandyou");
		// enter password
		addEmployee.passWord.sendKeys("key12345");
		// confirm password
		addEmployee.RepassWord.sendKeys("key12345");
		// get the enabled option and store it inside a variable
		assertTrue(addEmployee.enabledOption.isSelected());
	}

	@When("^I save new employee data$")
	public void i_save_new_employee_data() throws Throwable {
		// click on save button
		addEmployee.save.click();
		Thread.sleep(3000);
	}

	@Then("^click on employee list for verification$")
	public void click_on_employee_list_for_verification() throws Throwable {
		// identify the table and store it inside a variable
		WebElement webtable = Driver.getInstance().findElement(By.id("resultTable"));

		// print number of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int rowSize = rows.size();
		System.out.println("WebTable rows Count: " + rowSize);

		// print number of columns in a table
		List<WebElement> cols = webtable.findElements(By.tagName("th"));
		int colSize = cols.size();
		System.out.println("WebTable cols count: " + colSize);

		// print some specific value in Webtable row 2 and cell/column 3
//		List<WebElement> cells1 = rows.get(1).findElements(By.tagName("td"));
//		System.out.println(cells1.get(2).getText()); // linda

		// Print all the elements from the webtable
		// go through each row
//		for (WebElement row : rows) {
//			// within that row and find all tds/bunch
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//			// loop through each cell within that row
//			for (WebElement cell : cells) {
//				System.out.print(cell.getText() + "|");
//			}
//			// Hit enter
//			System.out.println();
//		}

		// Loop through webTable rows
		for (int rowNum = 1; rowNum < rowSize; rowNum++) {
			String cellValue = null;
			// loop through each cell
			for (int cellNum = 1; cellNum < colSize; cellNum++) {
				cellValue = Driver.getInstance()
						.findElement(
								By.xpath("//table[@id='resultTable']/tbody/tr[" + rowNum + "]/td[" + cellNum + "]"))
						.getText();
				System.out.println(cellValue);
				if (cellValue.equals("Nina")) {
					assertTrue(cellValue.equals("Nina"));
					break;
				}
				if (cellValue.equals("Nina")) {
					break;
				}
			}
		}
	}

	@When("^I register Employee Accounts$")
	public void i_register_Employee_Accounts(DataTable data) throws Throwable {
		// click on PIM TAB
		pimObject.pim.click();
		List<Map<String, String>> maps = data.asMaps(String.class, String.class);
		for (Map<String, String> map : maps) {

			System.out.println(map);

			// add employee
			addEmployee.addEmp.click();
			Thread.sleep(1000);

			// enter first name
			addEmployee.firstName.sendKeys(map.get("fname"));
			// enter last name
			addEmployee.lastName.sendKeys(map.get("lname"));
			// select the checkbox
			addEmployee.checkBox.click();
			// enter username

			addEmployee.userName.sendKeys(map.get("username"));
			// enter password
			addEmployee.passWord.sendKeys(map.get("password"));
			// confirm password
			addEmployee.RepassWord.sendKeys(map.get("comfirmpassword"));
			// get the enabled option and store it inside a variable
			assertTrue(addEmployee.enabledOption.isSelected());
			addEmployee.save.click();
			Thread.sleep(1000);

		}

	}

	@Then("^Employee accounts are created any ready for further use$")
	public void employee_accounts_are_created_any_ready_for_further_use() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		pimObject.pim.click();
		// verify employee
		assertTrue(Driver.getInstance().findElement(By.xpath("//a[contains(text(),'Nina')]")).isDisplayed());
		assertTrue(Driver.getInstance().findElement(By.xpath("//a[contains(text(),'Vale')]")).isDisplayed());
		dashboard.WelcomeHomepage.click();
		dashboard.Logout.click();

	}

	@When("^I register Employee Accounts with header$")
	public void i_register_Employee_Accounts_with_header(DataTable data) throws Throwable {
		// click on PIM
		pimObject.pim.click();
		List<Map<String, String>> maps = data.asMaps(String.class, String.class);
		for (Map<String, String> map : maps) {
			System.out.println(map);
		}
	}
}
