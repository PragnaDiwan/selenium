package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElementconcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("http://mrbool.com/search/");
		 
		 WebElement parentmenu=driver.findElement(By.xpath("//a[@href='http://mrbool.com/articles/listcomp.asp']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(parentmenu).build().perform();
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("COURSES")).click();
		 
	}

}
