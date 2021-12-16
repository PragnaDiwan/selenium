package selenium_Session;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkstextutl {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		By links=By.tagName("a");
		
	System.out.println(getlinkscount(links));
	
	List<String>actlist=getelementtextlist(links);
	for(String e:actlist)
	{
		System.out.println(e);
	}
	getelementtextlist(links).contains("Fabric");
	System.out.println("fabric is present");
	
	}
	
	public static List<String> getelementtextlist(By locator)
	{
		List<WebElement>elelist=getelements(locator);
		List<String>eletextlist=new ArrayList<String>();
		
		
		for(WebElement e:elelist)
			
			{String eletext=e.getText();
		
		if(!e.getText().isEmpty())
				{
			eletextlist.add(eletext);
				}
			}
		return eletextlist;
		}
	
	
	
	public static int getlinkscount(By locator)
	{
		return getelements(locator).size();
	}
	
	public static List<WebElement> getelements(By locator)
	
	{
		return driver.findElements(locator);
		
	}
	

}
