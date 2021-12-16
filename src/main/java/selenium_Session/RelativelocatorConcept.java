package selenium_Session;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativelocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://whenwise.com/sign-in");
		
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		
		driver.navigate().to("https://whenwise.com/users/2835/edit");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		
		
	}
	
	

}