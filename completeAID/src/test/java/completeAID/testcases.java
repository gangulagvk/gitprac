package completeAID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcases{
	
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/hrm/login.php";
	
  @Test(enabled=true,priority=3,groups="login")
  public void TC1() {
	    bo.get(bpath);
	    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
	    bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab1");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
  }
  @Test(enabled=true,priority=2,groups="login")
  public void TC2() {
	    bo.get(bpath);
	    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab2");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login" );
	}
  @Test(enabled=true,priority=1,groups="groups")
  public void TC3() {
	    bo.get(bpath);
	    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("lab2");
		bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
		Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(),"Invalid Login" );
	  
  }
  @Test(enabled=true,priority=4,groups="login")
  public void TC4() {
	bo.get(bpath);
    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("RRRRR");
	bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("YYYY");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
}
  @Test(enabled=true,priority=5,groups="groups")
  public void TC5() {
    bo.get(bpath);
    bo.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("");
    bo.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("");
	bo.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
    Assert.assertEquals(bo.switchTo().alert().getText(), "User Name not given!");
    bo.switchTo().alert().accept();     
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
