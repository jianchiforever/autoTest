import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by new on 2018/4/23.
 */
public class jiawenjie002 {
    public static void main(String[] args) throws InterruptedException{
//        找驱动
        String path = "F:\\ceshi\\linux\\mavens\\chrome&driver\\chromedriver.exe";
//        设置系统属性
        System.setProperty("webdriver.chrome.driver",path);
//        实例化/新建一个驱动
        WebDriver chromDriver = new ChromeDriver();
//        驱动找到对应的页面
        chromDriver.get("F:\\ceshi\\linux\\mavens\\light\\index.html");
//        实例化一个页面元素对象
        WebElement element = chromDriver.findElement(By.className("switch"));
//        操作元素
        for (int i=1;i<=5;i++){
            Thread.sleep(2000);
            element.click();
        }
    }
}