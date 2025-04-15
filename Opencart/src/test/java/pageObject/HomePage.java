package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//span[normalize-space()='My Account']")WebElement lynkMyAccount;
	@FindBy(xpath="//a[normalize-space()='Register']")WebElement lynkRegister;
	@FindBy(xpath="//a[normalize-space()='Login']")WebElement lynklogin;

	
	
	public void clickMyAccount() {
		lynkMyAccount.click();
	}
	
	public void clickRegister() {
		lynkRegister.click();
	}
	public void clickLogin() {
		lynklogin.click();
	}
}
