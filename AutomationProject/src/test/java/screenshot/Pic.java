package screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pic {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();
		TakesScreenshot tc=(TakesScreenshot)driver;
		File sourcefile=tc.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"//pic//mi.png");
		sourcefile.renameTo(targetfile);
		

	}

}
