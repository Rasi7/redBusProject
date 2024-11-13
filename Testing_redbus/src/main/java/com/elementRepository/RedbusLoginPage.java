package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilityClasses.FileUtility;
import com.utilityClasses.JavaScriptUtil;

public class RedbusLoginPage {

	FileUtility fileUtility = new FileUtility();

	public RedbusLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public FileUtility getFileUtility() {
		return fileUtility;
	}

	// Account
	@FindBy(xpath = "//span[text()=\"Account\"]")
	private WebElement acccountLink;

	public WebElement getAcccountLink() {
		return acccountLink;
	}

	// Login
	@FindBy(xpath = "//span[text()=\"Login/ Sign Up\"]")
	private WebElement loginSignUp;

	public WebElement getLoginSignUp() {
		return loginSignUp;
	}

	@FindBy(xpath = "//input[@id='mobileNoInp']")
	private WebElement phoneTextField;

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public void phoneTextfield1() throws Exception {
		phoneTextField.click();
		String phoneNo = fileUtility.getDataFromExcel("Login", 1, 0);
		phoneTextField.sendKeys(phoneNo);
	}

	// Continue
	@FindBy(xpath = "//span[@class=\"f-w-b\"]")
	private WebElement generateOtpCheckBox;

	public WebElement getGenerateOtpCheckBox() {
		return generateOtpCheckBox;
	}

	public void generateOtp() {
		generateOtpCheckBox.click();
	}

	@FindBy(xpath = "//button[text()=\"VERIFY OTP\"]")
	private WebElement verifyOtpButton;

	public WebElement getVerifyOtpButton() {
		return verifyOtpButton;
	}

	// Other elements
	@FindBy(xpath = "//div[@class=\"recaptcha-checkbox-border\"]")
	private WebElement iAmNotRobot;

	public WebElement getiAmNotRobot() {
		return iAmNotRobot;
	}

	public void notRobot() {
		iAmNotRobot.click();
	}

	@FindBy(xpath = "//input[@id=\"mobileNoInp\"]")
	private WebElement phoneNumber;

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public void phnumber() {
		phoneNumber.click();
	}

	@FindBy(xpath = "//iframe[@class='modalIframe']")
	private WebElement switchTopage;

	public WebElement getSwitchTopage() {
		return switchTopage;
	}

}
