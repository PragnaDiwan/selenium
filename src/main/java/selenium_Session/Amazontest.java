package selenium_Session;

public class Amazontest {

	public static void main(String[] args) {
		
		Browserutil b1=new Browserutil();
		b1.launchbrowser("chrome");
		b1.enterurl(("https:"));
		String Title=b1.getPageTitle();
		System.out.println(Title);
		if(Title.contains("Amazon"))
		{
			System.out.println("correct title");
		}
		
		String url=b1.getAppcurrenturl();
		System.out.println(url);
		
		
		
		b1.closebrowser();
		
		
	}

}
