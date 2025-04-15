package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
 @FindBy(xpath="//input[@id='input-email']")WebElement inputEmail;
 @FindBy(xpath="//input[@id='input-password']")WebElement inputPassword;
 @FindBy(xpath="//input[@value='Login']")WebElement btnLogin;
 
 public void  inputEmail(String email) {
	 inputEmail.sendKeys(email);
 }
 public void InputPassword(String pwd) {
	 inputPassword.sendKeys(pwd);
 }
 public void clickLogin() {
	 btnLogin.click();
 }
 
}
