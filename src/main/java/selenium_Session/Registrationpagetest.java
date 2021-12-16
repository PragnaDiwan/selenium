package selenium_Session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpagetest {

	public static void main(String[] args) throws InterruptedException {

		
		Browserutil brutl=new Browserutil();
		WebDriver driver=brutl.launchbrowser("chrome");
		brutl.enterurl("https://demo.opencart.com/index.php?route=account/register");
		String title=brutl.getPageTitle();
		System.out.println("title is :"+title);
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmpwd=By.id("input-confirm");
		By privacy=By.name("agree");
		By reward=By.linkText("Reward Points");
		
		Elementutl eleutl=new Elementutl(driver);
		eleutl.dosendkeys(firstname, "pragna");
		eleutl.dosendkeys(lastname, "diwan");
		eleutl.dosendkeys(email, "pragna@test.com");
		eleutl.dosendkeys(telephone, "8141143966");
		eleutl.dosendkeys(password, "global");
		eleutl.dosendkeys(confirmpwd, "global");
		eleutl.doclick(privacy);
			Thread.sleep(5000);
			
			eleutl.doclick(reward);
			
			brutl.closebrowser();
			
	}

}
