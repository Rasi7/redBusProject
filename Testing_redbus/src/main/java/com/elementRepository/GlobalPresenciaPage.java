package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalPresenciaPage {

	public GlobalPresenciaPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='redBus la forma más fácil de comprar pasajes de bus']")
	private WebElement colombiaTitle;

	public WebElement getColombiaTitle() {
		return colombiaTitle;
	}

	@FindBy(xpath = "(//div[@class='rb_main_secondary_item  link']//i[@class='icon icon-down icon_secondary_item_more'])[1]")
	private WebElement colombiaDropDown;

	public WebElement getColombiaDropDown() {
		return colombiaDropDown;
	}

	@FindBy(id = "en")
	private WebElement colombiaEnglishDropDown;

	public WebElement getColombiaEnglishDropDown() {
		return colombiaEnglishDropDown;
	}

	@FindBy(xpath = " //span[text()=' ¿Necesito registrarme para usar redBus?  ']  ")
	private WebElement mainBusRouteLink;

	public WebElement getMainBusRouteLink() {
		return mainBusRouteLink;
	}

	@FindBy(xpath = "//span[text()=' Mana yang lebih mudah, beli tiket secara online atau di loket?  ']  ")
	private WebElement fqsTextLink;

	public WebElement getFqsTextLink() {
		return fqsTextLink;
	}

	@FindBy(xpath = "(//i[@class='icon icon-down icon_secondary_item_more'])[1]")
	private WebElement malaysiaDropDown;

	public WebElement getMalaysiaDropDown() {
		return malaysiaDropDown;
	}

	@FindBy(xpath = "//h3[text()='Top Operators']")
	private WebElement topOperators;

	public WebElement getTopOperators() {
		return topOperators;
	}

	@FindBy(id = "en")
	private WebElement englishDropDownMalasysia;

	public WebElement getEnglishDropDownMalasysia() {
		return englishDropDownMalasysia;
	}

	@FindBy(xpath = "//p[contains(text(),'No, redBus no le pide a sus clientes que pasen por un proceso de registro.')]")
	private WebElement topBusTitle;

	public WebElement getTopBusTitle() {
		return topBusTitle;
	}

	@FindBy(xpath = "//div[text()='119 things to do']")
	private WebElement singaporeCity;

	public WebElement getSingaporeCity() {
		return singaporeCity;
	}

	@FindBy(xpath = "//span[text()=' Which is the best bus ticket booking app in Singapore? '] ")
	private WebElement busrate;

	public WebElement getBusrate() {
		return busrate;
	}

	@FindBy(xpath = "//div[text()='Booking']")
	private WebElement bookingLink;

	public WebElement getBookingLink() {
		return bookingLink;
	}

	@FindBy(xpath = "//span[text()=' What is the process of booking a bus ticket online? ']")
	private WebElement processOfBooking;

	public WebElement getProcessOfBooking() {
		return processOfBooking;
	}
}
