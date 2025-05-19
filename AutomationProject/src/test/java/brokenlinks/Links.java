package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Links {

	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get(" http://www.deadlinkcity.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(WebElement alllinks:links) {
			String hrefvalue=alllinks.getAttribute("href");
			if(hrefvalue.isEmpty()||hrefvalue==null) {
				System.out.println("not posiible bcoz hreflue is null");
				continue;
			}
			URL myurl=new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400) {
				System.out.println("its a broken link");
			}
			else {
				System.out.println("not a broken link");
			}
		}

	}

}
