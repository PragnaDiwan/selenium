package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 
		 List<WebElement>linklist=driver.findElements(By.tagName("a"));
		 System.out.println("totla no of link:"+linklist.size());
		 
		 for(int i=0;i<linklist.size();i++)
		 {
			String text= linklist.get(i).getText();
			
			if(!text.isEmpty())
			System.out.println(text);
		 }
		 
		 
		
	}

}
