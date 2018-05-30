package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/7.
 */
public class testFu {
    public WebDriver driver= null;
    public SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public void set(){
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");
        driver=seleniumUtil.getDriver("chrome");
        seleniumUtil.url("http://www.jd.com");

    }
    @AfterMethod
    public void guan(){
        driver.close();
    }
}
