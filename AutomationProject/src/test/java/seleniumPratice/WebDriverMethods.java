package seleniumPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		String a=driver.getTitle();
		System.out.println(a);
		String b=driver.getPageSource();
		//System.out.println(b);
		String c=driver.getWindowHandle();
		System.out.println(c);
		
	}

}
