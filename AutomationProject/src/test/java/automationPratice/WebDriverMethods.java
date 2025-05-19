package automationPratice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String page=driver.getPageSource();
		String windowid=driver.getWindowHandle();
		System.out.println(title);
		System.out.println(page);
		System.out.println(url);
		System.out.println(windowid);

	}

}
