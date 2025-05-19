package automationPratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>boxes=driver.findElements(By.xpath("//div[@class='form-check form-check-inline']//input[@type='checkbox']"));
		for(WebElement box:boxes) {
			box.click();
		}
		
	}

}
