package chromeoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://demo.nopcommerce.com/");
		
		String title=driver.getTitle();
		if(title.equals("Just a moment...")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test fail `1	");
		}

	}

}
