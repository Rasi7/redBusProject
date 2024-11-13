package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTicketHomePage {
	public BusTicketHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "bus_tickets_vertical")
	private WebElement busTicketButton;

	public WebElement getBusTicketButton() {
		return busTicketButton;
	}

	@FindBy(xpath = "//*[@id='language_change']/div[1]/i[2]")
	private WebElement languageDropDown;

	public WebElement getLanguageDropDown() {
		return languageDropDown;
	}

	@FindBy(xpath = "//*[@id='en']/span")
	private WebElement englishLink;

	public WebElement getEnglishLink() {
		return englishLink;
	}

	@FindBy(xpath = "//*[@id='hi']/span")
	private WebElement hindiLink;

	public WebElement getHindiLink() {
		return hindiLink;
	}

	@FindBy(xpath = "//div[text()='India']")
	private WebElement indiaLink;

	public WebElement getIndiaLink() {
		return indiaLink;
	}

	@FindBy(xpath = "//div[text()='Peru']")
	private WebElement peruLink;

	public WebElement getPeruLink() {
		return peruLink;
	}

	@FindBy(xpath = "//div[text()='सिंगापुर']")
	private WebElement sigaporeLink;

	public WebElement getSigaporeLink() {
		return sigaporeLink;
	}

	@FindBy(xpath = "//div[text()='मलेशिया']")
	private WebElement MalaysiaLink;

	public WebElement getMalaysiaLink() {
		return MalaysiaLink;
	}

	@FindBy(xpath = "//div[text()='इंडोनेशिया']")
	private WebElement IndonesiaLink;

	public WebElement getIndonesiaLink() {
		return IndonesiaLink;
	}

	@FindBy(xpath = "//*[@id='ta']/span")
	private WebElement tamilLink;

	public WebElement getTamilLink() {
		return tamilLink;
	}

	@FindBy(xpath = "//*[@id='homeV2-root']/div[1]/h1")
	private WebElement homeTitle;

	public WebElement getHomeTitle() {
		return homeTitle;
	}

	@FindBy(xpath = "//a[@href='https://www.redbus.in/info/offers']")
	private WebElement offerViewLink;

	public WebElement getOfferViewLink() {
		return offerViewLink;
	}

	@FindBy(xpath = "//a[@href='https://www.redbus.in/online-booking/rtc-directory']")
	private WebElement GovernmentBusesViewLink;

	public WebElement getGovernmentBusesViewLink() {
		return GovernmentBusesViewLink;
	}

	@FindBy(xpath = "//div[text()='कोलम्बिया']")
	private WebElement colombiaLink;

	public WebElement getColombiaLink() {
		return colombiaLink;
	}

	@FindBy(id = "terms_n_conditions_footer")
	private WebElement tAndcLink;

	public WebElement gettAndcLink() {
		return tAndcLink;
	}

	@FindBy(id = "privacy_policy_footer")
	private WebElement privacyPolicy;

	public WebElement getPrivacyPolicy() {
		return privacyPolicy;
	}

	@FindBy(id = "faq_footer")
	private WebElement faqLink;

	public WebElement getFaqLink() {
		return faqLink;
	}

	@FindBy(id = "user_agreement_footer")
	private WebElement userAgreement;

	public WebElement getUserAgreement() {
		return userAgreement;
	}

	public void clickMethod(WebElement element) {
		element.click();
	}
}
