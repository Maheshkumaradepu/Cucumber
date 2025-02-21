package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public WebDriver hmdriver;

	public Homepage(WebDriver rdriver) {
		hmdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement myAccount;

	@FindBy(linkText = "Register")
	WebElement registerBtn;

	@FindBy(linkText = "Login")
	WebElement loginBtn;

	// Clicks on 'My Account' to open the dropdown
	public void clickMyAccount() {
		myAccount.click();
	}

	// Clicks on 'Register' link inside 'My Account' dropdown
	public void register() {
		registerBtn.click();
	}

//Clicks on 'Login' inside My Account dropdown
	public void login() {
		loginBtn.click();
	}

	public WebElement element() {
		return myAccount;
	}
}
