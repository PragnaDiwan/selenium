package selenium_Session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserutil {
	
	public WebDriver driver;
	
	/**
	 * This method is used launch the browser
	 * @param browser
	 * @return
	 */
	public WebDriver launchbrowser(String Browser)
	{
         
		
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
		
		return driver;
	}
	/**
	 * this method is used to enter the url
	 * @param url
	 */
	public void enterurl(String url)
	{
		if(url==null)
		{
			System.out.println("url is null");
			return;
		}
		if(url.indexOf("https")==-1)
		{
			System.out.println("http is missing");
			return;
		}
		driver.get(url);
	}
	
	/**
	 * this method give the current url
	 * @return
	 */

	public String getAppcurrenturl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void closebrowser()
	{
		driver.close();
	}
	
	public void quitbrowser()
	{
		driver.quit();
	}
}
