package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIsdisplayed {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		By emailid=By.id("input-email");
		
		if(doisdisplayed(emailid));
		{
			System.out.println("element is displayed........");
		}
		
		
	}
	
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static boolean doisdisplayed(By locator)
	{
		
		return getelement(locator).isDisplayed();

	}

}
