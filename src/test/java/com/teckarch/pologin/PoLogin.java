package com.teckarch.pologin;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.teckarch.browser.TestBase;

public class PoLogin extends TestBase {
	private static Logger log = LogManager.getLogger(PoLogin.class);

	@FindBy(id = "email_field")
	WebElement emailid;

	@FindBy(id = "password_field")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"login_div\"]/button")
	WebElement loginButton;

	@FindBy(xpath = "//h1[contains(text(),'Student Registration Form')]")
	WebElement text;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logout;

	public PoLogin(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void Valid_credits() throws Exception {

		emailid.sendKeys(System.getProperty("susername"));
		password.sendKeys(System.getProperty("spassword"));
		loginButton.click();
		//text.isDisplayed();
	}

	

	public void Invalid_credits() throws Exception {
		emailid.clear();

		emailid.sendKeys(System.getProperty("invalidusername"));
		password.clear();

		password.sendKeys(System.getProperty("invalidpassword"));
		loginButton.click();
	}
	public void Logout() throws Exception {
		logout.click();
	}
}
