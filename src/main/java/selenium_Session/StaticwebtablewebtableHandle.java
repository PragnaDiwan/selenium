package selenium_Session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticwebtablewebtableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		//table[@id="customers"]/tbody/tr[2]/td[1]
		//table[@id="customers"]/tbody/tr[3]/td[1]
		//table[@id="customers"]/tbody/tr[4]/td[1]
		//table[@id="customers"]/tbody/tr[5]/td[1]
		
		

//		String beforexpathcom="//table[@id=\"customers\"]/tbody/tr[";	
//		String afterxpathcom="]/td[1]";
//		int rowcount=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
//		
//		
//		for(int i=2;i<=rowcount;i++)
//		{
//			String compxpath=beforexpathcom+i+afterxpathcom;
//			//System.out.println(compxpath);
//			String compname=driver.findElement(By.xpath(compxpath)).getText();
//			System.out.println(compname);
//		}
		
		By row=By.xpath("//table[@id=\"customers\"]/tbody/tr");
		By col=By.xpath("//table[@id=\"customers\"]/tbody/tr/th");
		
		String beforexpath="//table[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[";
		
                    printtable(row,col,beforexpath,afterxpath);
		
	}
	
	public static void printtable(By rowlocator,By collocator,String beforexpath,String afterxpath)
	{
		int rowcount=driver.findElements(rowlocator).size();
		int colcount=driver.findElements(collocator).size();
		for(int row=2;row<=rowcount;row++)
		{
			for(int col=1;col<=colcount;col++)
			{
				String xpath=beforexpath+row+afterxpath+col+"]";
				//System.out.println(xpath);
				String text=driver.findElement(By.xpath(xpath)).getText();
				System.out.print(text + "    | ");
			}
			System.out.println();
			
		}
		
	}

}
