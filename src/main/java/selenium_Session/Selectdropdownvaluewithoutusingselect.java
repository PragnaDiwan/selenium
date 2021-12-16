package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownvaluewithoutusingselect {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
       //   WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
//		
//		Select select=new Select(country);
//		List<WebElement>countrylist=select.getOptions();
//		
//		for(WebElement e:countrylist)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("India"))
//			{
//				
//				e.click();
//				break;
//			}
//			
//				
//		}
//			
//		
		By country=By.id("Form_submitForm_Country");
		doselectdropdownvalue(country,"India");
		
	}
	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doselectdropdownvalue(By locator,String value)
	{
		Select select=new Select(getelement( locator));
	    List<WebElement>optionslist=select.getOptions();
	
	for(WebElement e:optionslist)
	{
		String text=e.getText();
		System.out.println(text);
		if(text.equals("value"))
		{
			
			e.click();
			break;
		}
		
			
	}
		
	}

}
