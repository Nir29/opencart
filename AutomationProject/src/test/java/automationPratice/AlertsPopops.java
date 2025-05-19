package automationPratice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPopops {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		//driver.findElement(By.id("confirmBtn")).click()
		driver.findElement(By.id("promptBtn")).click();
;		//Alert myalert=driver.switchTo().alert();
		//Thread.sleep(3000);
		//myalert.getText();
		//myalert.accept();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		

	}

}
