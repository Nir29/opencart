package automationPratice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		URL url=new URL("https://testautomationpractice.blogspot.com/");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.id("country"));
		Select drpcountry=new Select(drp);
		//drpcountry.selectByIndex(1);
		//drpcountry.selectByVisibleText("France");
		//drpcountry.deselectByValue("Germany");
		List<WebElement>option=drpcountry.getOptions();
		
		for(WebElement op:option) {
			System.out.println(op.getText());
		
		}
		

	}

}
