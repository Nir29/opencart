package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		WebElement drp=driver.findElement(By.id("dropdown"));
		
		Select myselect=new Select(drp);
		myselect.selectByIndex(1);
		//myselect.selectByValue("");
	//	myselect.selectByVisibleText("");

	}

}
