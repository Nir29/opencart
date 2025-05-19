package automationPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		//WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		//WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		//WebElement ntn=driver.findElement();
		WebElement input1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		input1.sendKeys("Admin");
		WebElement input2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		input2.sendKeys("admin123");
		WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		btn.click();
		
		
		

	}

}
