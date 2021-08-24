package browsercommandsprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brosercommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\seliniumfiles\\drivers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.manage().window().maximize();
		bo.navigate().to("https://www.youtube.com/");
		bo.navigate().to("https://www.flipkart.com/");
		bo.navigate().back();
		bo.navigate().forward();
		
	

	}

}
