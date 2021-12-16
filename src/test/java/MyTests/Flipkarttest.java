package MyTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkarttest {
	
	
	public WebDriver driver;
	


	@Test
	
	public void setup() throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
		
	
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		List<WebElement>sug=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
//		
//		for(WebElement e:sug)
//		{
//			String text=e.getText();
//			System.out.println(text);
//	
//		}
//	
		
		Thread.sleep(2000);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		
	//	 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		 
//	 driver.findElement(By.xpath("//div[text()='Badminton Shoes']")).click();
		// Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		
	List<WebElement>sug1=driver.findElements(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//a[@class='IRpwTa']"));
		
		for(WebElement j:sug1)
		{
			
			String link=j.getText();
			System.out.println(link);
			if(link.equals("Loafers For Men"))
			{
				j.click();
				break;
			}
			
		}
		System.out.println(sug1.size());
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	





	}


	
	
	
	
}
