package selenium_Session;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandles {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);

		
		//driver.findElement(By.xpath("//a[text()='deepti Gupta']/parent::td/preceding-sibling::td/input")).click();
		//selectcontact("deepti Gupta");
		//getcompanyname("Amar3 Singh3");
		getphonelist("Amar3 Singh3");
		
	}
	
	public static void selectcontact(String contactname)
	{
		 String xpath=("//a[text()='"+contactname+"']/parent::td/preceding-sibling::td/input");
		 driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void getcompanyname(String contactname)
	{
		 String xpath=("//a[text()='"+contactname+"']/parent::td/following-sibling::td/a[@context='company']");
		 String companyname=driver.findElement(By.xpath(xpath)).getText();
		 System.out.println(companyname);
	}
	
	public static List<String> getphonelist(String contactname)
	{
		String xpath=("//a[text()='"+contactname+"']/parent::td/following-sibling::td/span[@context='phone']");
		
		List<WebElement>phonelist=driver.findElements(By.xpath(xpath));
		List<String>phonevallist=new ArrayList<String>();
		for(WebElement e:phonelist)
		{
			String text=e.getText();
			System.out.println(text);
			phonevallist.add(text);
		}
		return phonevallist;
	}

	

}
