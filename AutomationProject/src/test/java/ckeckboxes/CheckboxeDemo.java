package ckeckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxeDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		for(int i=0;i<checkbox.size();i++) {
			if(i==2) {
				checkbox.get(i).click();
			}
		}

	}
	
}