package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import util.WaitHelper;

public class ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WaitHelper.waitImpliciti(driver, 5);
		WebElement input1=driver.findElement(By.id("field1"));
		input1.clear();
		input1.sendKeys("nirmal");
		WebElement btn=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act=new Actions(driver);
		act.doubleClick(btn).build().perform();

	}

}
