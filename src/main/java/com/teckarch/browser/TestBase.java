package com.teckarch.browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.teckarch.listner.ExtentManager;

@Listeners(com.teckarch.listner.TestListner.class)
public class TestBase {

	public static BrowserUtilities browutili = new BrowserUtilities();

	public static CommonUtilites commonutil = new CommonUtilites();

	public static ExtentManager ext = new ExtentManager();

	public static WebDriver driver;

	@SuppressWarnings("static-access")
	@BeforeSuite
	public void dependencyTriggering() throws Exception {
		driver = browutili.ChromeBrowser();
		commonutil.Load_Pro_File(System.getProperty("user.dir") + "/Inputdata.properties");
	}

	@SuppressWarnings("static-access")
	@AfterSuite
	public void downdependency() {
		browutili.quitBrowser();
	}

}