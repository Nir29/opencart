package automationPratice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String url="https://testautomationpractice.blogspot.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
		/*Set<String>windows=driver.getWindowHandles();
		List<String>windowid=new ArrayList(windows);
		String parentid=windowid.get(0);
		String childid=windowid.get(1);
		Thread.sleep(3000);
		driver.switchTo().window(parentid);
		Thread.sleep(3000);
		*///driver.switchTo().window(childid);
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
