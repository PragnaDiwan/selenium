package selenium_Session;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchtest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("naveen autoamation labs");
	    Thread.sleep(5000);
	    
	    By suggetion=By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span");
	    
	    searchsuggetionlist(suggetion,"linkedin");
	  
	}
	 
	   public static void searchsuggetionlist(By locator,String value)
	   {
		   List<WebElement>suggetionlist= driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
		   System.out.println(suggetionlist.size());
		   
		   for(WebElement e:suggetionlist)
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
