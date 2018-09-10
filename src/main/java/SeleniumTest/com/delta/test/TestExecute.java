package SeleniumTest.com.delta.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestExecute {

	public static void main(String[] args) {
		
		
		DriverFactory.getInstance().getDriver().get("https://www.zuche.com/");
		executeJS("inputDay bmnone zc_iptcalendar iptDate dt-left",0,"2018-08-08");
	}
	
	
	public static void executeJS(String classname,int index,String value) {
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("document.getElementsByClassName('"+ classname +"')["+ index + "].value = '"+ value +"'");
		
		
	}
	
	
	
}
