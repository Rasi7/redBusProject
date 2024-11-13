package com.stepDefinition;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BusTicketHomePage;
import com.elementRepository.GovernmentBusPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GovernmentBuses {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility fileUtility = new FileUtility();
	BusTicketHomePage busTicketHomePage = new BusTicketHomePage(driver);
	GovernmentBusPage governmentBusPage = new GovernmentBusPage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

	@Given("Browser should be lunched and url should be navigated")
	public void browser_should_be_lunched_and_url_should_be_navigated() throws Exception {
		String actualurl = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
		Reporter.log("navigated to the redbus", true);
	}

	@When("user  click on government buses viewAll")
	public void user_click_on_government_buses_view_all1() {
		javaScriptUtil.jsClick(busTicketHomePage.getGovernmentBusesViewLink());
		Reporter.log("sucessfully clicked on viewAll");
	}

	@When("user should navigate to the find all the RTC Operator directories page")
	public void user_should_navigate_to_the_find_all_the_rtc_operator_directories_page() throws InterruptedException {

		Thread.sleep(3000);
		webDriverUtility.switchToTabOnTitle(driver,
				"List of RTC Operators in India, Bus Directory, Top Bus Routes - redbus.in");
		Assert.assertTrue(governmentBusPage.getRtcTitle().isDisplayed());
		Reporter.log("Sucessfully navigated to the all the RTC Operator directories page", true);
	}

	@When("user  able to click on north zone PEPSU bus link")
	public void user_shouls_able_to_click_on_north_zone_pepsu_bus_link() throws InterruptedException {

		javaScriptUtil.jsClick(governmentBusPage.getPepsuLink());
		Thread.sleep(3000);
		Reporter.log("Sucessfully clicked on PEPSU link ", true);
	}

	@Then("user should able to navigate to that paticular page")
	public void user_should_able_to_navigate_to_that_paticular_page() {

		Assert.assertTrue(governmentBusPage.getPepsPageText().isDisplayed());
		Reporter.log("Sucessfully navigated to PEPSU Page", true);
	}

	@Then("user click on head office of punjab")
	public void user_click_on_head_office_of_punjab() {
		javaScriptUtil.jsScrollIntoView(false, governmentBusPage.getHeadOfficeLink());

		try {

			javaScriptUtil.jsClick(governmentBusPage.getHeadOfficeLink());

		} catch (ElementNotInteractableException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", governmentBusPage.getHeadOfficeLink());
		}

		Reporter.log("sucessfully clicked ", true);
	}

	@Then("user should navigate")
	public void user_should_navigate() throws Exception {
		Assert.assertTrue(governmentBusPage.getPunjabHeading().isDisplayed());
		Reporter.log("Sucessfully navigated", true);
	}

}
