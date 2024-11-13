package com.stepDefinition;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import com.elementRepository.BusTicketHomePage;
import com.elementRepository.OffersPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;
import com.utilityClasses.WebDriverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrendingOffers {
	WebDriver driver=DriverFactory.getDriver();
	FileUtility fileUtility= new FileUtility();
	BusTicketHomePage busTicketHome=new BusTicketHomePage(driver);
	JavaScriptUtil javaScriptUtil= new JavaScriptUtil(driver);
	OffersPage offersPage=new OffersPage (driver);
	WebDriverUtility utility=new WebDriverUtility ();
	@Given("Browser should be launch and navigate to url")
	public void browser_should_be_launch_and_navigate_to_url() throws Exception {
		String actualurl=fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), actualurl);
	    Reporter.log("navigated to the redbus", true);
	}
	@When("user should click on Bus Ticket")
	public void user_should_click_on_bus_ticket() throws Exception {
		// busTicketHome.getBusTicketButton().click();
		// busTicketHome.clickMethod(busTicketHome.getBusTicketButton());
		javaScriptUtil.jsClick(busTicketHome.getBusTicketButton());
		
	  String actualurl=fileUtility.getDataFromPropertiesFiles("url");
	  Assert.assertEquals(driver.getCurrentUrl(), actualurl);
	}

	@When("user should  click on ViewAll link")
	public void user_should_click_on_view_all_link() {
		//busTicketHome.getOfferViewLink().click();
		// busTicketHome.clickMethod(busTicketHome.getOfferViewLink());
		javaScriptUtil.jsClick(busTicketHome.getOfferViewLink());
	    Reporter.log("user navigate to offer",true);
	}

	@When("user should navigate to Offer page")
	public void user_should_navigate_to_offer_page() throws InterruptedException {
	 // Thread.sleep(3000);
	  utility.switchToTabOnTitle(driver,"Offers: Bus Offers & Coupon Codes | Grab Discount on Bus Booking");
//	  offersPage.getFirstOfferLink().click();
	  
	  javaScriptUtil.jsClick(offersPage.getFirstOfferLink());
	 // offersPage.clickMethod(offersPage.getFirstOfferLink());
	  Thread.sleep(3000);
	  Reporter.log("user navigates to bus offer", true);
	}

	@Then("user should get bus Offers")
	public void user_should_get_bus_offers() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(offersPage.getOfferTitle().isDisplayed());
		Reporter.log("user navigates to bus offer", true);
	}
	@Then("user should come back from bus offers")
	public void user_should_come_back_from_bus_offers() throws InterruptedException {
	  
		try {
			// offersPage.getOffersClose().click();
			javaScriptUtil.jsClick(offersPage.getOffersClose());
			
		} catch (ElementNotInteractableException e) {
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", offersPage.getOffersClose());
		}
		
	   Reporter.log("user sucessfully came back to offers page", true);
	}
}
