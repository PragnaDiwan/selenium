package selenium_Session;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricketscoretable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/australia-vs-pakistan-2nd-semi-final-1273755/full-scorecard");
		
		//System.out.println(getwickettakername("Asif Ali"));
		System.out.println(getplayerscorecard("Asif Ali"));
	}
	public static String getwickettakername(String playername)
	{
		String xpath="//a[text()='"+playername+"']/parent::td/following-sibling::td/span";
		
		return driver.findElement(By.xpath(xpath)).getText();
		
			
	}
	
	public static List<String>  getplayerscorecard(String playername)
	{
		List<WebElement>scorelist=driver.findElements(By.xpath("//a[text()='"+playername+"']/parent::td/following-sibling::td"));
		List<String>scorevallist= new ArrayList<String>();
				
		for(WebElement e:scorelist)
		{
			
			String text=e.getText();
			scorevallist.add(text);
			
		}
		return scorevallist;
	}
	

}
