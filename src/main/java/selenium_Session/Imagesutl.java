package selenium_Session;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Imagesutl {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.Amazon.com");
		By images=By.tagName("img");
		By links=By.tagName("a");
		System.out.println(getelementscount(images));
		
		List<String>attrlist=getattributelist(images,"alt");	
		
		
		printelementvalues(getattributelist(images,"src"));
	//	printelementvalues(getattributelist(images,"alt"));
		//printelementvalues(getattributelist(links,"href"));


		
		
	}
	
	
	public static int getelementscount(By locator)
	{
		return getelements(locator).size();
	}
	
	public static void printelementvalues(List<String>elelist)
	{
		for(String e:elelist)
		{
			
			System.out.println(e);
		}
		
	}
	
	public static List<String> getattributelist(By locator,String Attributename)
	{
		   List<WebElement>  elelist= getelements(locator);
		   List<String>attrlist=new ArrayList<String>();
		   
		   for(WebElement e:elelist)
		   {
			   String attrvalue=e.getAttribute(Attributename);
			   attrlist.add(attrvalue);
			   
		   }
		   return attrlist;
	}
	
	public static List<WebElement> getelements(By locator)
	{
		return driver.findElements(locator);
	}

}
