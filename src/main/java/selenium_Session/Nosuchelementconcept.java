package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nosuchelementconcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		 WebElement firstname=driver.findElement(By.id("Form_submitForm_FirstName"));
		 firstname.sendKeys("pragna");
		
		 
		 
		 
		 List<WebElement>list=driver.findElements(By.className("text1"));
		 
		System.out.println(list.size());
	
		 
	 }


}
