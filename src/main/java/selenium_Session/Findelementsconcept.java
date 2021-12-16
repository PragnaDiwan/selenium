package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelementsconcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.Amazon.com");
		
	//	List<WebElement>linkslist=driver.findElements(By.tagName("a"));
		
		
		By links=By.tagName("a");
		List<WebElement>linkslist=getelements(links);
		System.out.println("total links:"+linkslist.size());
		
//		for(int i=0;i<linkslist.size();i++)
//			
//		{
//			String text=linkslist.get(i).getText();
//			if(!text.isEmpty())
//			System.out.println(text.trim());
//		}
		
		
		for(WebElement e:linkslist)
		{
		 String text=e.getText();
		 if(!text.isEmpty())
		 System.out.println(text);
		}
			
	}
	public static List<WebElement> getelements(By locator)
	{
		return driver.findElements(locator);
	}

}
