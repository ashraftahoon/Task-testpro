package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
     
	public static WebDriver driver;
	
	@BeforeSuite
	public void StartDriver() 
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterSuite
	public void StopDriver()
	{
		driver.quit();
	}
}
