package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifyelement {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		 
		 By formfeields=By.className("text");
		 
		 int fieldcount=driver.findElements(formfeields).size();
		 if(fieldcount==0)
		 {
			 System.out.println("form fields are not available");
		 }
		 
		 else
		 {
			 System.out.println("form feild are available");
		 }

		 
		 
		 // to verify the single element
		 By Contactsale=By.linkText("CONTACT SALES");
		 //driver.findElement(Contactsale).click();
		 
		 Boolean flag=driver.findElement(Contactsale).isDisplayed();
		 System.out.println(flag);
		 
		 if(driver.findElements(Contactsale).size()>=1)
		 {
			 System.out.println("contact sale is present on the page");
		 }
		 
		 System.out.println(isElementexist(Contactsale));
	}
	
	
	public static boolean isElementexist(By locator)
	{
		int elementcount=driver.findElements(locator).size();
		System.out.println("total element found:"+elementcount);
		if(elementcount>=1)
		{
			System.out.println("element is found" +locator);
			return true;
		}
		else
			
		{
			System.out.println("element is not found"+locator);
		}
		return false;
	}
	

}
