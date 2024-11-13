package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import com.elementRepository.BusTicketHomePage;
import com.elementRepository.RedbusLoginPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusTicket {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility fileUtility = new FileUtility();
	BusTicketHomePage busTicketHomePage = new BusTicketHomePage(driver);
	WebDriverUtility driverUtility = new WebDriverUtility();
	RedbusLoginPage redbusLoginPage = new RedbusLoginPage(driver);
	JavaScriptUtil javascriptutil = new JavaScriptUtil(driver);

	@Given("Browser will be lunched and url should be navigated")
	public void Browser_will_be_lunched_and_url_should_be_navigated() throws Exception {

		String actualurl = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
		Reporter.log("navigated to the redbus", true);
	}

	@When("user click on Account")
	public void user_click_on_account() {
		javascriptutil.jsClick(redbusLoginPage.getAcccountLink());
		Reporter.log("user clicked on account ", true);
	}

	@When("user click on login\\/signup")
	public void user_click_on_login_signup() {

		javascriptutil.jsClick(redbusLoginPage.getLoginSignUp());
		Reporter.log("user clicked on login ", true);
	}

	@When("user enter phone number")
	public void user_enter_phone_number() throws Exception {
		driverUtility.switchToFrame(driver, redbusLoginPage.getSwitchTopage());
		javascriptutil.jsScrollIntoView(false, redbusLoginPage.getPhoneTextField());
		Thread.sleep(3000);
		javascriptutil.jsClick(redbusLoginPage.getPhoneTextField());
		redbusLoginPage.phoneTextfield1();
		Thread.sleep(30000);
		Reporter.log("user entred phone number", true);
	}

	@When("click on generate otp")
	public void click_on_generate_otp() throws InterruptedException {
		javascriptutil.jsClick(redbusLoginPage.getGenerateOtpCheckBox());
		Thread.sleep(30000);
		Reporter.log("user generated otp", true);

	}

	@When("click on verify otp")
	public void click_on_verify_otp() throws InterruptedException {
		//redbusLoginPage.clickMethod(redbusLoginPage.getVerifyOtpButton());
		javascriptutil.jsClick(redbusLoginPage.getVerifyOtpButton());
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Reporter.log("User Sucessfully login", true);
	}

	@Then("user is able to click on bus ticket")
	public void user_is_able_to_click_on_bus_ticket() {
		javascriptutil.jsScrollIntoView(false, busTicketHomePage.getBusTicketButton());
		javascriptutil.jsClick(busTicketHomePage.getBusTicketButton());
		Reporter.log("bus ticket page navigated", false);
	}

}
