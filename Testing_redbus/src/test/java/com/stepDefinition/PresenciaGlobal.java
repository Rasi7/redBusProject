package com.stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BusTicketHomePage;
import com.elementRepository.GlobalPresenciaPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PresenciaGlobal {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility= new FileUtility();
	BusTicketHomePage  busTicketHomePage=new BusTicketHomePage(driver);
	WebDriverUtility webDriverUtility = new WebDriverUtility();
	GlobalPresenciaPage globalPresenciaPage=new GlobalPresenciaPage(driver);
	JavaScriptUtil javaScriptUtil= new JavaScriptUtil(driver);
			
	@Given("Browser should be launched and url will be navigated")
	public void browser_should_be_launched_and_url_will_be_navigated() throws Exception {
            String actualurl=fileUtility.getDataFromPropertiesFiles("url");
			Assert.assertEquals(driver.getCurrentUrl(), actualurl);
		    Reporter.log("navigated to the redbus", true);
	}

	@Given("user click on bus ticket button")
	public void user_click_on_bus_ticket_button() {
		// busTicketHomePage.getBusTicketButton().click();
		 javaScriptUtil.jsClick(busTicketHomePage.getBusTicketButton());
	    Reporter.log("bus ticket page navigated", false);
	}

	@Given("user click on Hindi language")
	public void user_click_on_english_language() throws InterruptedException {
		busTicketHomePage.getLanguageDropDown().click();
		 Thread.sleep(3000);
		// busTicketHomePage.getHindiLink();
		 javaScriptUtil.jsClick(busTicketHomePage.getHindiLink());
	}


	@When("user click on Colombia")
	public void user_click_on_colombia() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false,busTicketHomePage.getColombiaLink());
		Thread.sleep(3000);
	//	busTicketHomePage.getColombiaLink().click();
		javaScriptUtil.jsClick(busTicketHomePage.getColombiaLink());
	   Reporter.log("Sucessfully clicked on Colombia", true);
	}

	@When("colombia page should be displayed")
	public void colombia_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(globalPresenciaPage.getColombiaTitle().isDisplayed());
		Reporter.log("Sucessfully navigated to colombia", true);
	}


    @Then("user click on main bus route in colombia")
	public void user_click_on_main_bus_route_in_colombia() throws InterruptedException {
		 javaScriptUtil.jsScrollIntoView(false,globalPresenciaPage.getMainBusRouteLink());
		 Thread.sleep(3000);
		// globalPresenciaPage.getMainBusRouteLink().click();
		 javaScriptUtil.jsClick(globalPresenciaPage.getMainBusRouteLink());
	}

	@Then("user should get the relavent information")
	public void user_should_get_the_relavent_information() {
	   Assert.assertTrue(globalPresenciaPage.getTopBusTitle().isDisplayed());
	   Reporter.log("relavent information ", true);
	   
	}

    @When("user click on Indonesia")
	public void user_click_on_indonesia() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false,busTicketHomePage.getIndonesiaLink());
		Thread.sleep(3000);
		//  busTicketHomePage.getIndonesiaLink().click();
		javaScriptUtil.jsClick(busTicketHomePage.getIndonesiaLink());
	}

	@Then("user click on FAQs")
	public void user_click_on_fa_qs() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false, globalPresenciaPage.getFqsTextLink());
		Thread.sleep(3000);
		// globalPresenciaPage.getFqsTextLink().click();
		javaScriptUtil.jsClick(globalPresenciaPage.getFqsTextLink());
	   
	}

	@Then("user should get relavent answer for that question")
	public void user_should_get_relavent_answer_for_that_question() {
		Assert.assertTrue(globalPresenciaPage.getFqsTextLink().isDisplayed());
		Reporter.log("Sucessfully got revalent information ", true);
	}

	@When("user click on Malaysia")
	public void user_click_on_malaysia() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false,busTicketHomePage.getMalaysiaLink());
		Thread.sleep(3000);
		// busTicketHomePage.getMalaysiaLink().click();
		javaScriptUtil.jsClick(busTicketHomePage.getMalaysiaLink());
	}

	@When("user  click english language")
	public void user_click_english_language() throws InterruptedException {
		globalPresenciaPage.getMalaysiaDropDown().click();
	    Thread.sleep(3000);
	    javaScriptUtil.jsClick( globalPresenciaPage.getEnglishDropDownMalasysia());
	  //  globalPresenciaPage.getEnglishDropDownMalasysia().click();
	    Reporter.log("information displayed in english", true);
	}

	@Then("user click on top operators")
	public void user_click_on_top_operators() throws InterruptedException {
		javaScriptUtil.jsScrollIntoView(false,globalPresenciaPage.getTopOperators());
	    Thread.sleep(3000);
	    javaScriptUtil.jsClick(globalPresenciaPage.getTopOperators());
	  //  globalPresenciaPage.getTopOperators().click();
	    
	}

	@Then("user should get relavent information")
	public void user_should_get_relavent_information() {
		Assert.assertTrue(globalPresenciaPage.getTopOperators().isDisplayed());
        Reporter.log("relavent information is dispalyed", true);
	}
	

    @When("user click on Singapore")
	public void user_click_on_singapore() throws InterruptedException {
    	javaScriptUtil.jsScrollIntoView(false, busTicketHomePage.getSigaporeLink());
		Thread.sleep(3000);
		 javaScriptUtil.jsClick(busTicketHomePage.getSigaporeLink());
		
		// busTicketHomePage.getSigaporeLink().click();
	}

    @When("user click on bus ride")
    public void user_click_on_bus_ride() {
    	javaScriptUtil.jsScrollIntoView(false, globalPresenciaPage.getBusrate());
    	javaScriptUtil.jsClick(globalPresenciaPage.getBusrate());
    	
    	// globalPresenciaPage.getBusrate().click();
    }

    @Then("user should see the relavent data")
    public void user_should_see_the_relavent_data() {
        Assert.assertTrue(globalPresenciaPage.getBusrate().isDisplayed());
        Reporter.log("relavent information is dispalyed", true);
       	
    }

    @Then("user click on Booking")
    public void user_click_on_booking() {
    	javaScriptUtil.jsClick(globalPresenciaPage.getBookingLink());
    	// globalPresenciaPage.getBookingLink().click();
        Reporter.log("Sucessfully clicked on booking", true);
       	
    }

    @Then("user click on the process of booking")
    public void user_click_on_the_process_of_booking() {
    	javaScriptUtil.jsClick(globalPresenciaPage.getProcessOfBooking());
    	// globalPresenciaPage.getProcessOfBooking().click();
    }

    @Then("user should get relavent information about booking")
    public void user_should_get_relavent_information_about_booking() {
    	 Assert.assertTrue(globalPresenciaPage.getProcessOfBooking().isDisplayed());
    }
}
