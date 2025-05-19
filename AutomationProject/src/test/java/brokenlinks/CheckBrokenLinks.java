package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		for(WebElement linkelement:links) {
			String hrefvalue=linkelement.getAttribute("href");
			if(hrefvalue==null||hrefvalue.isEmpty()) {
				System.out.println("href attributr is null");
				continue;
			}
		
		
        URL linkurl=new URL(hrefvalue);
         HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
         conn.connect();
         if(conn.getResponseCode()>=400) {
        	 System.out.println("its a brokenlink");
         }
         else {
        	 System.out.println("not broken link");
         }
         
		}
	}

}
