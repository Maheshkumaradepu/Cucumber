package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public WebDriver lgdriver;

	public LogoutPage(WebDriver rdriver) {
		lgdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@id=\"content\"]/h1")
	WebElement logoutScreenHeader;

	@FindBy(xpath = "//a[contains(text(),\"Continue\")]")
	WebElement continuebtn;

	public String get_logoutheader() {
		return logoutScreenHeader.getText();
	}

	public void Click_continue() {
		continuebtn.click();
	}
}
