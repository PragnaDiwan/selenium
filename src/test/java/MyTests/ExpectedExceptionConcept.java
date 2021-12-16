package MyTests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name="naveen";
	
	@Test(expectedExceptions= {NullPointerException.class,ArithmeticException.class})
	
	public void logintest()
	{
		
		int i= 9/0;
		System.out.println("login");
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();
		obj=null;
		System.out.println(obj.name);
		
	}
	
	

}
