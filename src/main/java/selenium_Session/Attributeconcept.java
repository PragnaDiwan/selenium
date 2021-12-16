package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributeconcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 
		 By amazonlinktext=By.linkText("About Amazon");
		 
		 String hrefval=getattributevalue(amazonlinktext,"href");
		 
		 if(hrefval.contains("footer"))
		 {
			 System.out.println("this is the correct href");
		 }
	}

	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static String getattributevalue(By locator,String attrname)
	{
		String attrvalue= getelement(locator).getAttribute(attrname);
		System.out.println(attrvalue);
		return attrvalue;
	}
}
