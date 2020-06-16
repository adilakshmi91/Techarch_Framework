package com.teckarch.browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilites {
	private static Logger log = LogManager.getLogger(CommonUtilites.class);
	public static WebDriver driver;

	static Properties pro = new Properties();


	public void Load_Pro_File(String Fpath) throws Exception {
		log.info("dir path=" + Fpath);
		FileInputStream fi = new FileInputStream(Fpath);
		pro.load(fi);
		System.getProperties().putAll(pro);
	}
}
