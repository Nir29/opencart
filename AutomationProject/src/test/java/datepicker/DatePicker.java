package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	 
 
	public static void main(String[] args) {
		String year="2026";
		String month="April";
		String date="15";
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        if(currentmonth.equals(month)&&currentyear.equals(year)) {
        	break;
        }
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
        List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
         for(WebElement dt:alldates) {
        	 if(dt.getText().equals(date)) {
        		 dt.click();
        		 break;
        	 }
        }
}
}
