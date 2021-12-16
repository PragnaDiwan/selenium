package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getalldropdownvaluewithselecttag {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		
		Select select=new Select(country);
		List<WebElement>countrylist=select.getOptions();
		System.out.println(countrylist.size());
		
		
//		for(WebElement e:countrylist)
//		{
//			String text=e.getText();
//			System.out.println(text);
//		}
		
		
		for(int i=1;i<countrylist.size();i++)
		{
			String text=countrylist.get(i).getText();
			System.out.println(i+":"+""+text);
		}
	}
	
}
