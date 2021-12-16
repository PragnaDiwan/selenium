package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationpracticesearchsuggetion {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("dress");
		
		Thread.sleep(5000);
		//generic method use============================''
		By list=By.xpath("//div[@class='ac_results']/ul/li");
				
				selectopttionsuggestionlis(list,"Casual Dresses");
		//////////////////////////////////////////////////////////////////////////
		
//		List<WebElement>sugglist=driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
//		
//		System.out.println(sugglist.size());
//		
//		for(WebElement e:sugglist)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.contains("Casual Dresses"))
//			{
//				e.click();
//				break;
//			}
//		}
		
	}
	
	public static void selectopttionsuggestionlis(By locator,String value)
	{
List<WebElement>sugglist=driver.findElements(locator);
		
		System.out.println(sugglist.size());
		
		for(WebElement e:sugglist)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.contains(value))
			{
				e.click();
				break;
			}
		}
		
	}
	}


