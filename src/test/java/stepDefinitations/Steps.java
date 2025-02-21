package stepDefinitations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AccRegistrationPage;
import pageObjects.AccountPage;
import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.RegSuccessPage;

public class Steps extends BaseClass {

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {

		logger = Logger.getLogger("NopCommerce");
		PropertyConfigurator.configure("log4j.properties");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		lg = new LogoutPage(driver);
		hm = new Homepage(driver);
		ap = new AccountPage(driver);
		arp = new AccRegistrationPage(driver);
		rsp = new RegSuccessPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String URL) {
		logger.info("*****************Launching URL***************");
		driver.get(URL);

	}

	@When("Clicks on MyAccount Login")
	public void clicks_on_MyAccount_login() {
		logger.info("***************** Clicking MyAccount***************");
		hm.clickMyAccount();
		hm.login();
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String psswd) {
		logger.info("*****************Entering Credentials***************");
		lp.email_entry(email);
		lp.pswd_entry(psswd);

	}

	@When("Click on Login")
	public void click_on_Login() throws InterruptedException {
		logger.info("*****************submitting Credentials***************");
		lp.login_submit();
		Thread.sleep(3000);
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String Title) {
		logger.info("*****************Validating title ***************");
		if (driver.getPageSource().contains("Warning: No match for E-Mail Address and/or Password.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(Title, driver.getTitle());
		}

	}

	@When("User click MyAccount and on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		logger.info("*****************logging out ***************");
		hm.clickMyAccount();
		ap.logout();
	}

	@Then("close browser")
	public void close_browser() {
		logger.info("*****************closign Browser***************");
		driver.quit();
	}
	/*
	 * ***********************************************************************
	 */

	@When("Clicks on MyAccount Register")
	public void clicks_on_my_account_register() {
		logger.info("***************** Clicking MyAccount Register***************");
		hm.clickMyAccount();
		hm.register();
	}

	@When("User enters customer details as  fname as {string} and lname as {string} and email as {string} and telephone as {string} and password as {string}  and cnfpassword as {string}")
	public void user_enters_customer_details_as_fname_as_and_lname_as_and_email_as_and_telephone_as_and_password_as_and_cnfpassword_as(
			String string, String string2, String string3, String string4, String string5, String string6) {
		logger.info("*****************Entering Details***************");
		arp.setFirstName(randomString(6));
		arp.setLastName(randomString(5));
		arp.setEmail(randomString(7) + "@gmail.com");
		arp.settelephone(randomNumber());
		String password = randomAlphaNum();
		arp.setPwd(password);
		arp.setcnfPwd(password);
		arp.clickchkbx();
	}

	@When("Click on continue")
	public void click_on_continue() {
		logger.info("***************** Clicking Reg Continue***************");
		arp.ctnu();
	}

	@When("User click continue after AccCreation")
	public void user_click_continue_after_acc_creation() {
		logger.info("***************** Clicking  Continue After Reg Success***************");
		rsp.click_ctninregSuccess();
	}

}
