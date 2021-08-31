package completeAID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases {
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/hrm/login.php";
  @Test
  public void TC1() {
	    bo.get(bpath);
	    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	    bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		System.out.println(bo.getTitle());
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  }
  @Test
  public void TC2() {
	    bo.get(bpath);
	    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab2");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login" );
	
  }
  @BeforeMethod
  public void beforemethod() {
	  System.setProperty("webdriver.chrome.driver","E:\\seliniumfiles\\drivers\\chromedriver.exe");
	  bo=new ChromeDriver();
	 
}
  @AfterMethod
  public void aftermethod() {
	    bo.close();
	  
}
}
