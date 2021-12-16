package MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTEst {
	
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		
		
	}
	
	
 @Test
  public void search()
   {
	boolean flag=driver.findElement(By.name("q")).isDisplayed();
	Assert.assertTrue(flag);
  }
	@Test
 public void searchbox()
 {
	boolean flag=driver.findElement(By.name("q")).isDisplayed();
	Assert.assertTrue(flag);
}
	
	@Test
	public void urltest()
	{
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("Google"));
		
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
}
