import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/7.
 */
public class JdTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumUtil util = new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");

        WebDriver element = util.getDriver("chrome");
        util.url("http://www.jd.com");

        util.click(By.className("link-login"));
        Thread.sleep(3000);
        util.click(By.linkText("账户登录"));
        Thread.sleep(3000);
        util.sendkey(By.id("loginname"),"18434394050");
        Thread.sleep(3000);
        util.sendkey(By.id("nloginpwd"),"SY1123..0");
        Thread.sleep(3000);
        util.click(By.id("loginsubmit"));
    }
}
