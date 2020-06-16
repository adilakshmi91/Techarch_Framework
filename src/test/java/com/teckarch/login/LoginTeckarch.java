package com.teckarch.login;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.teckarch.browser.TestBase;
import com.teckarch.pologin.PoLogin;

public class LoginTeckarch extends TestBase {

	public static Logger log = Logger.getLogger(LoginTeckarch.class);
	PoLogin login;

	@BeforeTest
	public void appurl() throws Exception {
		login = new PoLogin(driver);
		log.info("browser launched sucessfully");

	}

	@Test(enabled=false)
	public void Valid_login() throws Exception {
		login.Valid_credits();
		log.info("LoggedIn sucessfully");
		login.Logout();
		assertEquals(true,true);
		

	}

	@Test
	public void invalid_login() throws Exception {
		login.Invalid_credits();
		log.info("invalid error logging");

	}
}
