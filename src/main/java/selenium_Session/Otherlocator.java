package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Otherlocator {

	
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		 driver.get("https://www.freshworks.com/");
		//driver.get("https://demo.opencart.com/index.php?route=account/register");
//		driver.get("https://classic.crmpro.com/index.html");
//		driver.findElement(By.name("username"));
//		driver.findElement(By.name("password"));
//		
//		By emaild=By.name("username");
//		By password=By.name("password");
//		
		//Elementutl elutl=new Elementutl(driver);
//		elutl.dosendkeys(emaild, "pragna@gmail.com");
//		elutl.dosendkeys(password, "global916");
		
		
//		By register=By.linkText("Register");
//	
//		doclick(register);
		
		By header=By.tagName("h1");
		
		getelement(header);
		dogettext(header);
		if(dogettext(header).contains("Delight made easy"))
				{
			System.out.println("h1 header is correct");
				}
		
	
		
	}
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doclick(By locator)
	{
		getelement(locator).click();
	}

	public static String dogettext(By locator)
	{
		return getelement(locator).getText();
		
	}
	
}
