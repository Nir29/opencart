package seleniumPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("name")).sendKeys("nirmal");
		driver.findElement(By.cssSelector("input.form-control[id='email']")).sendKeys("123@");
        driver.findElement(By.cssSelector("input.form-control[id='phone']")).sendKeys("789456123");
        driver.findElement(By.cssSelector("input#female")).click();
        driver.findElement(By.cssSelector("input[value='male']")).click();
        driver.findElement(By.xpath("//input[@value='sunday']")).click();
       */// driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/input[1]")).click();
        //driver.findElement(By.xpath("//label[text()='Wednesday']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'Datepicker')]")).sendKeys("5/4/25");
		driver.findElement(By.xpath("//input[starts-with(@id,'na')]")).sendKeys("hii");
		driver.findElement(By.xpath("//input[@class='form-control'][@id='email']")).sendKeys("kk");
		
	}

}
