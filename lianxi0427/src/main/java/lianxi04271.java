import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

/**
 * Created by new on 2018/4/27.
 */
public class lianxi04271 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");

        WebDriver chromDriver = new ChromeDriver();
//      进入网页
        chromDriver.get("https://www.imooc.com/");
//      找到对应的元素
        WebElement html =chromDriver.findElement(By.linkText("前端开发"));
        html.click();
//        跳转到新的窗口
//        获取所有的窗口
        Set<String> windowHandles=chromDriver.getWindowHandles();
        for (String h:windowHandles
             ) {
//            让驱动去找到对应的窗口
            chromDriver.switchTo().window(h);
            System.out.println("获得到的每一个句柄为"+h);
        }
//        通过linkText查找框架的对应元素，并点击
        WebElement kuangjia=chromDriver.findElement(By.linkText("框架"));
        kuangjia.click();
    }
}