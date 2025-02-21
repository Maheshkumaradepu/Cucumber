package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	public WebDriver aPdriver;

	public AccountPage(WebDriver rdriver) {
		aPdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@id=\"content\"]/h2[1]")
	WebElement AccHeader;
	@FindBy(xpath = "//div/a[contains(text(),'Logout')]")
	WebElement Logoutbtn;

	public String verify_AccountpageAfterlogin() {
		return AccHeader.getText();
	}

	public void logout() {
		Logoutbtn.click();
	}
}
