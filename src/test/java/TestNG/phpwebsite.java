package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class phpwebsite{
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.56.101:9000/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Test
      public void verifyphpwebsite() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/content/about-us.php']")).click();
  }
	@AfterMethod
	public void close() {

		//driver.close();
	}		
}
