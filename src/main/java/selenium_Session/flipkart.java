package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		
		for(WebElement e:list)
		{
			String text=e.getText();
			System.out.println(text);
//			if(text.equals("mobiles under 15000"))
//			{
//				e.click()
//				
//			}
//			break;
		}
		
	}

}
