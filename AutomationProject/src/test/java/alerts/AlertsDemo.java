package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	//	driver.findElement(By.id("promtButton")).click();
	
		Alert myalert=driver.switchTo().alert();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		//myalert.dismiss();
		myalert.sendKeys("nirmal");
		myalert.accept();
		
		
		
		

	}

}
