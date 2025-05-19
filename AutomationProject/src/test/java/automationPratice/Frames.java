package automationPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		//driver.switchTo().frame(frame1);
		//driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hii");
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	}

}
