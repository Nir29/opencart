package automationPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement img=driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']"));
        System.out.println(img.isDisplayed());
        WebElement id=driver.findElement(By.id("male"));
        System.out.println(id.isSelected());
       
        
	}

}
