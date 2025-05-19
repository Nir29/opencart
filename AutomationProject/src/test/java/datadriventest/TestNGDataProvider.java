package datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.WaitHelper;

public class TestNGDataProvider {
	WebDriver driver;
    @Test(dataProvider="dp")
	void testlogin( String email,String pwd) {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WaitHelper.waitImpliciti(driver, 5);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		username.sendKeys(email);
		password.sendKeys(pwd);
		button.click();
		
    }	
		@DataProvider(name="dp")
		Object[][] loginData(){
			Object data[][]= {
					{ "abc@gmai.com","test123"},
					{"kamalakanta@gmail.com","ahnnd5"},
					{"Admin","admin123"}
			};
			
			return data;	
		}
		
		
		
		
	}

