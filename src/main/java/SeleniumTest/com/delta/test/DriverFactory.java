package SeleniumTest.com.delta.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static DriverFactory driverFactory;
	private static WebDriver driver;
	private DriverFactory() {
		
	}
	
	public  WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.firefox.bin","E:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
		
	}
	
	public static DriverFactory getInstance() {
		
		synchronized(DriverFactory.class) {
			if(driverFactory == null) {
				return new DriverFactory();
			}
		}
		return driverFactory;
		
	}
}
