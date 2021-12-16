package selenium_Session;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Elementutl {
	
	private  WebDriver driver;
	

	public Elementutl(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  WebElement getelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public  void dosendkeys(By locator,String value)
	{
		getelement(locator).sendKeys(value);
	}
	
	public  void doclick(By locator)
	{
		getelement(locator).click();
	}
	

	public  String dogettext(By locator)
	{
		return getelement(locator).getText();
		
	}
	public  boolean doisdisplayed(By locator)
	{
		
		return getelement(locator).isDisplayed();

	}
	
	public  boolean isElementexist(By locator)
	{
		int elementcount=getelements(locator).size();
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
	
	
	public  List<String> getelementtextlist(By locator)
	{
		List<WebElement>elelist=getelements(locator);
		List<String>eletextlist=new ArrayList<String>();
		
		
		for(WebElement e:elelist)
			
			{String eletext=e.getText();
		
		if(!e.getText().isEmpty())
				{
			eletextlist.add(eletext);
				}
			}
		return eletextlist;
		}
	
	
	
	public  int getlinkscount(By locator)
	{
		return getelements(locator).size();
	}
	
public  List<WebElement> getelements(By locator)
	
	{
		return driver.findElements(locator);
		
	}
	

public  void printelementvalues(List<String>elelist)
{
	for(String e:elelist)
	{
		
		System.out.println(e);
	}
	
}

public  List<String> getattributelist(By locator,String Attributename)
{
	   List<WebElement>  elelist= getelements(locator);
	   List<String>attrlist=new ArrayList<String>();
	   
	   for(WebElement e:elelist)
	   {
		   String attrvalue=e.getAttribute(Attributename);
		   attrlist.add(attrvalue);
		   
	   }
	   return attrlist;
}



public  String getattributevalue(By locator,String attrname)
{
	String attrvalue= getelement(locator).getAttribute(attrname);
	System.out.println(attrvalue);
	return attrvalue;
}

//****************************************************************************Dropdown utility************************************************************************

public void dodropdownselectbyindex(By locator,int index)
{
	Select select=new Select(getelement( locator));
	
	select.selectByIndex(index);
}

public void dodropdownselectbyvisibletext(By locator,String text)
{
	Select select=new Select(getelement( locator));
	
	select.selectByVisibleText(text);
}
public void dodropdownselectbyvalue(By locator,String value)
{
	Select select=new Select(getelement( locator));
	
	select.selectByValue(value);
}

public  void doselectdropdownvalue(By locator,String value)
{
	Select select=new Select(getelement( locator));
    List<WebElement>optionslist=select.getOptions();

for(WebElement e:optionslist)
{
	String text=e.getText();
	System.out.println(text);
	if(text.equals("value"))
	{
		
		e.click();
		break;
	}		
}

}

public  void selectdropdownvaluewithoutselect(By locator,String Value)
{
	List<WebElement>countrylist=getelements(locator);	
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

//***********************************************searchsuggetionlist************************************************************

public  void searchsuggetionlist(By locator,String value)
{
	   List<WebElement>suggetionlist= getelements(locator);
	   System.out.println(suggetionlist.size());
	   
	   for(WebElement e:suggetionlist)
	   {
		   String text=e.getText();
		   System.out.println(text);
		   if(text.contains(value))
		   {
			   e.click();
			   break;
		   }	   
		   		  
	   }     
}

//************************************************links util********************************************************************
public  List<String> getlinkstextlist(By locator)
{
	 List<WebElement>linkslist=getelements(locator);
	 List<String>linkstextlist=new ArrayList<String>();		 

	 System.out.println(linkslist.size());
	 
	 for(WebElement e:linkslist)
	 {
		 String text=e.getText().trim();
		 linkstextlist.add(text);
	 }
		 
	 return linkstextlist;
}
	

public  void clickonelement(By locator,String linktext)
{
	 List<WebElement>langlist=getelements(locator);
		

	 System.out.println(langlist.size());
	 
	 for(WebElement e:langlist)
	 {
		 String text=e.getText().trim();
		 System.out.println(text);
		 
		 if(text.equals(linktext))
		 {
			 e.click();
			 break;
		 }
	 }
	 
}

///**************************************************************static webtable handel***********************************************************
public void printtable(By rowlocator,By collocator,String beforexpath,String afterxpath)
{
	int rowcount=getelements(rowlocator).size();
	int colcount=getelements(collocator).size();
	for(int row=2;row<=rowcount;row++)
	{
		for(int col=1;col<=colcount;col++)
		{
			String xpath=beforexpath+row+afterxpath+col+"]";
			//System.out.println(xpath);
			String text=dogettext(By.xpath(xpath));
			System.out.print(text + "    | ");
		}
		System.out.println();
		
	}
	
}
}
