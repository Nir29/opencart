package miniProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import util.WaitHelper;

public class Myntra {
	WebDriver driver;
	@BeforeClass
	void setup() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--start-maximized");
	driver=new ChromeDriver(options);
	driver.get("https://www.myntra.com/");
	
	
	}	
	@Test
	void testOrder() {
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans");
		WaitHelper.waitJvm(5000);
		List<WebElement>jeans=driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		for(WebElement jean:jeans) {
			String jeanspant=jean.getText();
			if(jeanspant.equalsIgnoreCase("jeans for men")) {
				jean.click();
			}
		}
		 WebElement x=driver.findElement(By.id("rootRailThumbLeft"));
		 WebElement y=driver.findElement(By.id("rootRailThumbRight"));
		 Actions act=new Actions(driver);
		 act.dragAndDropBy(x, 50, 0);
		 act.dragAndDropBy(y, -50, 0);
	}

}



