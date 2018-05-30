import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by new on 2018/4/27.
 */
public class lianxitianmao {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");

        WebDriver chromDriver = new ChromeDriver();
//      进入网页
        chromDriver.get("https://www.tmall.com/");
        WebElement pl=chromDriver.findElement(By.xpath("//*[@id=\"login-info\"]/a[1]"));
        pl.click();
        chromDriver.switchTo().frame("J_loginIframe");
        chromDriver.findElement(By.id("J_Quick2Static")).click();

        WebElement zhanghao=chromDriver.findElement(By.id("TPL_username_1"));
        zhanghao.sendKeys("15735046299");
        WebElement mima=chromDriver.findElement(By.id("TPL_password_1"));
        mima.sendKeys("jianchiforever");

    }
}
