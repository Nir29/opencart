package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScrrenShot {
	
	WebDriver driver;
	@BeforeClass
	void setup() {
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test
	void testTS() {
		
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File sourcefile=tc.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"//pic//tc.png");
		sourcefile.renameTo(targetfile);
		
		
	}
	@AfterClass
	void teardown() {
		driver.quit();
	}

}
