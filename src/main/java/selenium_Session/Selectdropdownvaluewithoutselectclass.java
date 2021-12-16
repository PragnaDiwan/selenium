package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownvaluewithoutselectclass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By countryoption=By.xpath("//select[@id=\"Form_submitForm_Country\"]/option");
		
		selectdropdownvaluewithoutselect(countryoption,"India");

	}
	
	public static void selectdropdownvaluewithoutselect(By locator,String Value)
	{

		
		List<WebElement>countrylist=driver.findElements(locator);
		
		System.out.println(countrylist.size());
		
		for(WebElement e:countrylist)
		{
			String text=e.getText();
					if(text.equals(Value))
					{
						e.click();
						System.out.println(text);
						break;
					}
		}
	}
	
	

}
