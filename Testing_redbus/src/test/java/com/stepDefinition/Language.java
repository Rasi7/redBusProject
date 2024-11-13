package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BusTicketHomePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Language {
	WebDriver driver = DriverFactory.getDriver();
	FileUtility fileUtility = new FileUtility();
	BusTicketHomePage busTicketHome = new BusTicketHomePage(driver);
	JavaScriptUtil javascriptutil = new JavaScriptUtil(driver);

	@Given("Brower should be lunched and url be navigated")
	public void brower_should_be_lunched_and_url_be_navigated() throws Exception {
		String actualurl = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
		Reporter.log("navigated to the redbus", true);

	}

	@When("user is able to click on  {int} in the language dropdown")
	public void user_is_able_to_click_on_in_the_language_dropdown(Integer LanguageData) throws Exception {
		busTicketHome.getLanguageDropDown().click();
		String data = fileUtility.getDataFromExcel("LanguageData", LanguageData, 0);
		switch (data) {
		case "English":

			javascriptutil.jsClick(busTicketHome.getEnglishLink());
			break;
		case "हिंदी (Hindi)":

			javascriptutil.jsClick(busTicketHome.getHindiLink());
			break;
		case "தமிழ் (Tamil)":

			javascriptutil.jsClick(busTicketHome.getTamilLink());
			break;
		}
		Reporter.log("language changed ", true);

	}

	@Then("user should able to see the information in relavent language")
	public void user_should_able_to_see_the_information_in_relavent_language() {
		Assert.assertTrue(busTicketHome.getHomeTitle().isDisplayed());
	}

}
