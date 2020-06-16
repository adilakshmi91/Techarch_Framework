package com.teckarch.listner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	public static ExtentReports reports;
	// public static WebDriver driver;

	public static ExtentReports createInstance() {
		String uniquedate = new SimpleDateFormat("'sample 'yyyymmddHHmm''").format(new Date());
		String path = System.getProperty("user.dir") + "//TeckarchReports//Report" + uniquedate + ".html";
		reports = new ExtentReports(path);
		return reports;
	}
	    

}
