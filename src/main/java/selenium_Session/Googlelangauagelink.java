package selenium_Session;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlelangauagelink {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.google.com");
	 
	 By langlinks=By.xpath("//div[@id='SIvCob']/a");
	 //clickonelement(langlinks,"मराठी");
	 
	List<String>actuallinkstextlist= getlinkstextlist(langlinks);
	 
	if(actuallinkstextlist.contains("मराठी"))
	{
		System.out.println("मराठी is present on the page");
	}
	}
	
	public static List<String> getlinkstextlist(By locator)
	{
		 List<WebElement>linkslist=driver.findElements(locator);
		 List<String>linkstextlist=new ArrayList<String>();		 

		 System.out.println(linkslist.size());
		 
		 for(WebElement e:linkslist)
		 {
			 String text=e.getText().trim();
			 linkstextlist.add(text);
		 }
			 
		 return linkstextlist;
	}
		
	
	public static void clickonelement(By locator,String linktext)
	{
		 List<WebElement>langlist=driver.findElements(locator);
			

		 System.out.println(langlist.size());
		 
		 for(WebElement e:langlist)
		 {
			 String text=e.getText().trim();
			 System.out.println(text);
			 
			 if(text.equals(linktext))
			 {
				 e.click();
				 break;
			 }
		 }
		 
	}

}
