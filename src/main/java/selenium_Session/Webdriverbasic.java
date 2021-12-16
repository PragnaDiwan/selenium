package selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasic {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "c://chromedriver_win32 (7)//chromedriver.exe");
		WebDriver driver =new ChromeDriver();  //launch chrome
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
