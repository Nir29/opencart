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

public class Errorlinks {

	public static void main(String[] args) throws IOException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String hrefval=link.getAttribute("href");
			if(hrefval==null || hrefval.isEmpty()) {
				System.out.println("not possible to check");
			}
			URL myurl=new URL(hrefval);
			HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
			conn.connect();
			int responsecode=conn.getResponseCode();
			if(responsecode>=400) {
				System.out.println("its a broken link");
			}
			else {
				System.out.println("not a broken liks");
			}
			
		}
		
	}

}
