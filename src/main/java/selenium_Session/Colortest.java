package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Colortest {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("naveen");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		System.out.println(driver.findElement(By.xpath("//div[@class='form-group form-error']")).isDisplayed());
		
		
		
		
		
		
	}

}
