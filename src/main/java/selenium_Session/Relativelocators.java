package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativelocators {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		
		
		WebElement ele=driver.findElement(By.xpath("//p[@class='card-live-text2']/a[text()='Terrebonne, Canada']"));
		String aqnumber=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqnumber);
		
		String indent=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(indent);
		
		String belowtext=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowtext);
		
		
		WebElement location=driver.findElement(By.xpath("//a[text()='Alberta']"));
		
		String status=driver.findElement(with(By.tagName("td")).toRightOf(location)).getText();
		System.out.println(status);
		
		String aqi=driver.findElement(with(By.className("AQI_toggle")).toRightOf(location)).getText();
		System.out.println(aqi);
		
		System.out.println("********************************************************************");
		
		WebElement manitoba=driver.findElement(By.xpath("//a[text()='Manitoba']"));
		
		List<WebElement>result=driver.findElements(with(By.tagName("td")).toRightOf(manitoba));
		
		for(WebElement e:result)
			
		{
			String text=e.getText();
			System.out.println(text);
		}
		
		
	}
	
	

}
