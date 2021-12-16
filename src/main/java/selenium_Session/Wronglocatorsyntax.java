package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wronglocatorsyntax {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		 
		 By firstname=By.xpath("//[@id=\"Form_submitForm_FirstName\"]");
		 driver.findElement(firstname).sendKeys("pragna");
	}

}
