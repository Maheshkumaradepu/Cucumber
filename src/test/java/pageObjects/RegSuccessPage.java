package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegSuccessPage {

	WebDriver rsdriver;

	/**
	 * @param driver
	 */
	public RegSuccessPage(WebDriver rdriver) {
		rsdriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class=\"pull-right\"]/a")
	WebElement contbtn;

	public void click_ctninregSuccess() {
		contbtn.click();
	}
}
