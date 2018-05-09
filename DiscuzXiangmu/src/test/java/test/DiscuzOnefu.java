package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.DiaoyongConfig;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by new on 2018/5/8.
 */
public class DiscuzOnefu {
    public SeleniumUtil seleniumUtil=null;
    public WebDriver dirver = null;
    @BeforeMethod
    public void set() throws IOException {
        LogConfiguration.inLog();
        seleniumUtil=new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");
        dirver=seleniumUtil.getDirver("chrome");
        seleniumUtil.url("http://127.0.0.1:8088/Discuz_X3.2_SC_GBK/upload/forum.php");
    }
}
