package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassiccrmframeHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
	 
	 driver.get("https://classic.freecrm.com/index.html");
	 
	 driver.findElement(By.name("username")).sendKeys("groupautomation");
	 driver.findElement(By.name("password")).sendKeys("Test@1234");
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	 
	 Thread.sleep(10000);
		
	 driver.switchTo().frame("mainpanel");
	 Thread.sleep(5000);
	 
	 driver.findElement(By.linkText("COMPANIES")).click();
	 
	 
		
		
		
	}

}
