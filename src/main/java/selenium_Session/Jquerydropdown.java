package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author NEW-1
 *
 */
public class Jquerydropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		By choices=By.xpath("//span[@class='comboTreeItemTitle']");
		
	//	selectchoice(choices,"choice 2 1");
		//selectchoice(choices,"choice 1","choice 2","choice 2 1");
		
		selectchoice(choices,"all");
	}
	
	public static void selectchoice(By locator,String... Value)
	{
List<WebElement>ChoicesList=driver.findElements(locator);

			if(! Value[0].equalsIgnoreCase("all"))
			{
		
		for(WebElement e:ChoicesList)
		{
			String text=e.getText();
			System.out.println(text);
			
			for(int i=0;i<Value.length;i++)
			{
				if(text.equals(Value[i]))
			
			{
				e.click();
				break;
		}
		
		}
		
	}
		

}
			else
			{
				try {
				for(WebElement e:ChoicesList)
				{
					e.click();
				}
				
				
			}		catch(ElementNotInteractableException e)
				{
				System.out.println("all choices are over");
				}
				}
}}

	
