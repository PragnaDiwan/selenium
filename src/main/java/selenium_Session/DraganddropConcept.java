package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DraganddropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		 driver.get("https://jqueryui.com//resources/demos/droppable/default.html");
		 
		 
		
		 
		
		 WebElement drage=driver.findElement(By.cssSelector("#draggable"));
		 WebElement drop=driver.findElement(By.id("droppable"));
		 
		 Actions act=new Actions(driver);
		 act.clickAndHold(drage).moveToElement(drop).release().build().perform();
		
	}
	
	
	
}
