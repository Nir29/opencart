package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartLogin {
	WebDriver driver;
	void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		driver=new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
	}
	
     void testFilpkart() {
    	 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("jeans");
    	 driver.findElement(By.xpath("//span[@data-reactid='1041']")).click();
    	 
    	 
     }
}
