package SeleniumTest.com.delta.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
    }
}
