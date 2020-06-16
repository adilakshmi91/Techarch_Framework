package com.teckarch.browser;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtilities {

	public static WebDriver driver;
	static Logger log = LogManager.getLogger(BrowserUtilities.class);

	public static WebDriver ChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		log.info("browser launching");
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		return driver;
	}

	public static void waitElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public static void Input_sendkeys(WebElement ele, String KeysToSend) {
		ele.sendKeys(KeysToSend);
	}

	public void bt_click(WebElement ele) {
		ele.click();
	}

	public static void quitBrowser() {
		driver.quit();
	}

}
