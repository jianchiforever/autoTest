import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/2.
 */
public class TestCrossBrower {
    @Test(parameters = "Browser")
    public void startBrower(String browser){
       if (browser.equals("chrome")){
           System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");
           WebDriver chromDriver = new ChromeDriver();
           chromDriver.get("https://www.baidu.com");
//           chromDriver.quit();
       }else if (browser.equalsIgnoreCase("firefox")){
           System.setProperty("webdriver.gecko.driver","F:\\ceshi\\linux\\mavens\\huohuqudong\\geckodriver.exe");
           WebDriver Driver = new FirefoxDriver();
           Driver.get("https:\\www.baidu.com");
//           chromDriver.quit();
       }
    }
}