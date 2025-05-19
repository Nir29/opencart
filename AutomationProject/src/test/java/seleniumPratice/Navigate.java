package seleniumPratice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		String url="https://demo.nopcommerce.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to(url);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);

	}

}
