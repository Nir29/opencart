package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokLink {

	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String hrefval=link.getAttribute("href");
			if(hrefval==null || hrefval.isEmpty() ) {
				System.out.println("not possible");
			}
			
			URL myurl=new URL(hrefval);
			HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
			conn.connect();
			int response=conn.getResponseCode();
			if(response>=400) {
				System.out.println("it s brokrn link");
			}
			else {
				System.out.println("not broken link");
			}
		}
	}

}
