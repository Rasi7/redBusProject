package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BusTicketHomePage;
import com.elementRepository.FAQPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Information {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility= new FileUtility();
	BusTicketHomePage busTicketHome=new BusTicketHomePage(driver);
	FAQPage faqPage=new FAQPage(driver);
	JavaScriptUtil javaScriptUtil= new JavaScriptUtil(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	
	
	
	@When("Broswer should be launched and url navigated")
	public void broswer_should_be_launched_and_url_navigated() throws Exception {
		String actualurl=fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
	    Reporter.log("navigated to the redbus", true);
	}

	@When("user  click on FAQ")
	public void user_click_on_faq() {
		javaScriptUtil.jsScrollIntoView(false,busTicketHome.getFaqLink());
		busTicketHome.getFaqLink().click();
		Reporter.log("sucessfuly clicked on frequent asked questions", true);
	}

	@When("user should navigate to the frequent asked Questions")
	public void user_should_navigate_to_the_frequent_asked_questions() {
		webDriverUtility.switchToTabOnTitle(driver, "Frequently Asked Question(FAQ) | redBus");
	    Assert.assertTrue(faqPage.getFaqTitle().isDisplayed());
	    Reporter.log("Sucessfully navigated to the page", true);
	}
	

	@When("user click on ticket related")
	public void user_click_on_ticket_related() {
		faqPage.getTickedRelated().click();
	   Reporter.log("Sucessfully clicked on ticket related link", true);
	}

	@When("user click on  refund related")
	public void user_click_on_refund_related() {
		faqPage.getRefundRelated().click();
	   Reporter.log("Sucessfully clicked on Refund Relatedlink", true);
	}

	@When("user click on cancellation related")
	public void user_click_on_cancellation_related() {
		faqPage.getCancellationRelated().click();
	    Reporter.log("Sucessfully clicked on Cancellation Related link", true);
	}

	@Then("user click on terms and conditions")
	public void user_click_on_terms_and_policy() {
		javaScriptUtil.jsScrollIntoView(false,busTicketHome.getFaqLink());
		busTicketHome.gettAndcLink().click();
		Reporter.log("sucessfuly clicked on terms and conditions", true);
	}

	@Then("user should navigate to the page")
	public void user_should_navigate_to_the_page() {
		webDriverUtility.switchToTabOnTitle(driver, "RedBus - Terms and Conditions | Online Bus Ticket Booking Policies");
	    Assert.assertTrue(faqPage.getPrivacyTitle().isDisplayed());
	    Reporter.log("sucessfuly navigated to terms and policy page", true);
	}

	@Then("user click on userAgrement")
	public void user_click_on_t_c() {
		javaScriptUtil.jsScrollIntoView(false,busTicketHome.getUserAgreement());
		busTicketHome.getUserAgreement().click();
		Reporter.log("sucessfuly clicked on user agreement page", true);
	}

	@Then("user should navigate to the relavent page")
	public void user_should_navigate_to_the_relavent_page() {
		webDriverUtility.switchToTabOnTitle(driver, "User Agreement | redBus");
		Assert.assertTrue(faqPage.getUserTitle().isDisplayed());
		Reporter.log("sucessfuly navigated to user Agreement", true);
	}



}
