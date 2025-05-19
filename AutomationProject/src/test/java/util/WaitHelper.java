package util;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	WebDriver driver;
	
	public static void waitJvm(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
	public static void waitImpliciti(WebDriver driver,int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void waitForElement(WebDriver driver,WebElement locator,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
