package SeleniumTest.com.delta.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = DriverFactory.getInstance().getDriver();
		System.out.println(driver);
	}
	
	
	
	@Test(description="this is a test")
	public void test1() {
		driver.get("http://www.baidu.com");
		Assert.assertEquals(1, 1);
	}
	
	
	
}
