package automationPratice;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class Assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			String hrefval=link.getAttribute("href");
			if(hrefval==null || hrefval.isEmpty()) {
				System.out.println("not possible to check");
				continue;
			}
			URL myurl=new URL(hrefval);
			HttpURLConnection conn=(HttpURLConnection)myurl.openConnection();
			conn.connect();
			int res=conn.getResponseCode();
			if(res>=400) {
				System.out.println("its broken link");
			}
			else {
				System.out.println("not broken link");
			}
		}

	}

}
