package stepDefinitations;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import pageObjects.AccRegistrationPage;
import pageObjects.AccountPage;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.RegSuccessPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public LogoutPage lg;
	public Homepage hm;
	public AccountPage ap;
	public AccRegistrationPage arp;
	public RegSuccessPage rsp;
	public static Logger logger;

	public static String randomString(int num) {
		String generatedString1 = RandomStringUtils.randomAlphabetic(num);
		return generatedString1;
	}

	public static String randomNumber() {
		String generatedString1 = RandomStringUtils.randomNumeric(10);
		return generatedString1;
	}

	public static String randomAlphaNum() {
		String psswd = RandomStringUtils.randomAlphanumeric(9);
		return psswd;
	}
}
