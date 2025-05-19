package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.WaitHelper;

public class BrokenLinksdemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		WaitHelper.waitImpliciti(driver, 5);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String hrefvalue=link.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("href value is empty , so not possible to cheak");
				continue;
			}
			URL myurl=new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
			conn.connect();
			int responsecode=conn.getResponseCode();
			if(responsecode>=400) {
				System.out.println("its a broken link");
			}
			else {
				System.out.println("its a not broken link");
			}
			
		}
		
	}

}
