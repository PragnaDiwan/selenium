package selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launchfirefox {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.gecko.driver", "c://geckodriver-v0.30.0-win32//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		
		
		
		driver.get("https://www.google.com");  //launch the url
		String title=driver.getTitle();        //get the url
		System.out.println("page title is:"+" "+title);
		
		
		if(title.equalsIgnoreCase("google"))
			
		{
			System.out.println("pass -corect tile");
		}
		
		else
			
			System.out.println("Incorrect title");
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
