package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test
	public void loginTest() throws InterruptedException{
		
		WebDriver wd=new FirefoxDriver();
		
	wd.get("http://rediffmail.com");
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	wd.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
	}
	
	@Test
	public void navigate() throws InterruptedException{
		
		WebDriver wd=new FirefoxDriver();
		
	wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	wd.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
	//Thread.sleep(5000);
	//wd.quit();
	}
	

}
