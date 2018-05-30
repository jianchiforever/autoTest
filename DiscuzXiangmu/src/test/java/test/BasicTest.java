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
public class BasicTest {
    public SeleniumUtil seleniumUtil=null;
    public WebDriver dirver = null;
    @BeforeMethod
    public void set() throws IOException {

        LogConfiguration.inLog();
        seleniumUtil=new SeleniumUtil();

        dirver=seleniumUtil.getDirver(DiaoyongConfig.browserName);
        seleniumUtil.url(DiaoyongConfig.url);
    }
}
