package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement emailtxt;
	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement pswdtxt;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement loginsubmitbtn;
	@FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]/i")
	WebElement errormsg;

	public void email_entry(String email) {
		emailtxt.sendKeys(email);
	}

	public void pswd_entry(String pswd) {
		pswdtxt.sendKeys(pswd);
	}

	public void login_submit() {
		loginsubmitbtn.click();
	}

	public String geterrormsg() {
		return	errormsg.getText();

	}

}