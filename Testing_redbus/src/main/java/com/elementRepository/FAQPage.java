package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQPage {
	public FAQPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='TICKET-RELATED']")
	private WebElement tickedRelated;

	public WebElement getTickedRelated() {
		return tickedRelated;
	}

	@FindBy(xpath = "//span[text()='CANCELLATION-RELATED']")
	private WebElement cancellationRelated;

	public WebElement getCancellationRelated() {
		return cancellationRelated;
	}

	@FindBy(xpath = "//span[text()='REFUND-RELATED']")
	private WebElement refundRelated;

	public WebElement getRefundRelated() {
		return refundRelated;
	}

	@FindBy(xpath = "//h3[text()=' Frequently Asked Questions '] ")
	private WebElement faqTitle;

	public WebElement getFaqTitle() {
		return faqTitle;
	}

	@FindBy(xpath = "//h3[text()='TERMS OF SERVICE']")
	private WebElement privacyTitle;

	public WebElement getPrivacyTitle() {
		return privacyTitle;
	}

	@FindBy(xpath = "//h3[text()='USER AGREEMENT']")
	private WebElement userTitle;

	public WebElement getUserTitle() {
		return userTitle;
	}

}
