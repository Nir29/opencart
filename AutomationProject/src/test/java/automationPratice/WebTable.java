package automationPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		//System.out.println(rows);
		int clo=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//th")).size();
		//String cols=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//th")).getText();
		//System.out.println(cols);
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=clo;c++) {
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println("");
		}
		
	}

}
