package MyTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsonMethodConcept {
	
	@BeforeMethod
	public void createuser()
	{
		System.out.println("create user");
	}
	
	
	@Test(priority=1)
	public void logintest()
	{
		System.out.println("logintest");
		int i=9/0;
	}

	
	@Test(dependsOnMethods ="logintest",priority=2)
	public void homepagelist()
	{
		System.out.println("homepagelist");
	}
	
	
	@Test
	public void searchtest()
	{
		System.out.println("searchtest");
	}
}
