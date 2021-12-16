package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownhandelwithselect {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
//		WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
//		
//		Select select=new Select(country);
//	//	select.selectByIndex(5);
//	//	select.selectByVisibleText("India");
//		
//		select.selectByValue("Afghanistan");
//		
		By country=By.id("Form_submitForm_Country");
		
		dodropdownselectbyindex(country,10);
		dodropdownselectbyvisibletext(country,"India");
		dodropdownselectbyvalue(country,"India");
	}

	
	
	public static void dodropdownselectbyindex(By locator,int index)
	{
		Select select=new Select(getelement( locator));
		
		select.selectByIndex(index);
	}
	
	public static void dodropdownselectbyvisibletext(By locator,String text)
	{
		Select select=new Select(getelement( locator));
		
		select.selectByVisibleText(text);
	}
	public static void dodropdownselectbyvalue(By locator,String value)
	{
		Select select=new Select(getelement( locator));
		
		select.selectByValue(value);
	}
	public static WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
}
