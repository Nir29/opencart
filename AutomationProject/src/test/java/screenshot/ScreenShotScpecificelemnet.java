package screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotScpecificelemnet {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		TakesScreenshot tc=(TakesScreenshot)driver;
		WebElement mobile=driver.findElement(By.xpath("//div[@class='card h-100']"));
		File sourcefile=mobile.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"//pic//new.png");
		sourcefile.renameTo(targetfile);
		
		driver.quit();

	}

}
