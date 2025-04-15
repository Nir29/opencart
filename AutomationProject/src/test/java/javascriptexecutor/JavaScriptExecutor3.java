package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
	
	js.executeScript("arguments[0].scrollIntoView();",ele);
     
     
   
     
     
	}

}
