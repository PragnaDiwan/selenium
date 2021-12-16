package selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsertest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		String Browser="edge";
		
		switch (Browser.toLowerCase())
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver", "c://chromedriver_win32 (7)//chromedriver.exe");
		    driver =new ChromeDriver();  //launch chrome
		    break;
		}		
		

			
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", "c://geckodriver-v0.30.0-win32//geckodriver.exe");
			
		 driver=new FirefoxDriver();
			break;
		}
			
		case "safari":
		{
			System.out.println("safart browser");
			break;
		}
			

		default:
			System.out.println("please pass the correct browser");
		}
		

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
	}

}
