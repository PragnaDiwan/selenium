package MyTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationconcepts {
	
	
/*
 * BS=DB -connection
BT-create user
Bc-Launch browser

bm-loginapp
accountinfotest
am==logout



bm-loginapp
userinfotest
am==logout


Ac-closebrowser
AT-delete user
AS
 */
	
	@BeforeSuite
	public void dbconnection()
	{
		System.out.println("BS=DB -connection");
	}

	@BeforeTest
	public void createuser()
	{
		System.out.println("BT-create user");
	}
	
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("Bc-Launch browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("bm-loginapp");
	}
	
	@Test
	public void userinfoTest()
	{
		System.out.println("userinfotest");
		
	}
	@Test
	public void accountinfotest()
	{
		System.out.println("accountinfotest");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("am==logout");
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("Ac-closebrowser");
	}
	@AfterTest
	public void deleteuser()
	{
		System.out.println("AT-delete user");
		
	}
	@AfterSuite
	public void disconnectdb()
	{
		System.out.println("AS");
	}
		
		
	
}
