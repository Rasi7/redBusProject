package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {
	public OffersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='OfferPro'])[1]")
	private WebElement firstOfferLink;
	
	public WebElement getFirstOfferLink() {
		return firstOfferLink;
	}
	@FindBy(xpath = "//td[@data-promo='CASH300']")
	private WebElement secondOfferLink;
	public WebElement getSecondOfferLink() {
		return secondOfferLink;
	}
	@FindBy(id = "offerClose")
	private WebElement OffersClose;
	
	public WebElement getOffersClose() {
		return OffersClose;
	}
	@FindBy(xpath = "//h1[@class='XCN']")
	private WebElement OfferTitle;

	public WebElement getOfferTitle() {
		return OfferTitle;
	}

}
