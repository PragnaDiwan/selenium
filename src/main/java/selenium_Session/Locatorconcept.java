package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorconcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      
        driver=new ChromeDriver();
      
      driver.get("https://demo.opencart.com/index.php?route=account/login");
      
      
		By username=By.id("input-email");
		By password=By.id("input-password");
		
//		WebElement emailid=driver.findElement(username);
//		WebElement pwd=driver.findElement(password);
//		
//		emailid.sendKeys("test@gmail.com");
//		pwd.sendKeys("global");
//		
//		driver.quit();
		
//		//getelement(username).sendKeys("test@gmail.com");
		//getelement(password).sendKeys("global916");
		
	//	dosendkeys(username,"test@gmail.com");
	//	dosendkeys(password,"global916");
		
		
		Elementutl eleutl=new Elementutl(driver);
		eleutl.dosendkeys(username, "pragna");
		eleutl.dosendkeys(password, "global916");
	}
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void dosendkeys(By locator,String value)
	{
		getelement(locator).sendKeys(value);
	}
	
}
