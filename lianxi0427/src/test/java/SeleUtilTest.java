import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.LogConfiguration;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/4.
 */
public class SeleUtilTest {
    public static void main(String[] args) {
        LogConfiguration.initLog();
        SeleniumUtil util = new SeleniumUtil();
        String path = "F:\\ceshi\\linux\\mavens\\huohuqudong\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        WebDriver element=util.getDriver("firefox");
        util.url("https://www.baidu.com");
        WebElement element1=util.findElement(By.id("kw"));
        util.click(By.id("su"));
        util.assertPage("百度一下，你就知道");
    }
}
