package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandle {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
	 
	 driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	 driver.switchTo().frame("main");
	String header=driver.findElement(By.xpath("/html/body/h2")).getText();
	 
		System.out.println(header);
		
	}

}
