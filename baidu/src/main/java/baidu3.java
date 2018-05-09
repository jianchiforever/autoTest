import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by new on 2018/4/24.
 */
public class baidu3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\mavens\\chrome&driver\\chromedriver.exe");
//        实例化
        WebDriver chromDriver = new ChromeDriver();
//        找到对应的页面
       chromDriver.get("https://talent.baidu.com/external/baidu/index.html#/social/2");
//        获取路径
        String url = chromDriver.getCurrentUrl();
        System.out.println("这是第一个网页地址==》"+url);
//        进入下个页面
        WebElement element = chromDriver.findElement(By.xpath("//div[@class=\"list-row\"][5]/div/a"));
        element.click();
//        chromDriver.navigate().to("https://talent.baidu.com/external/baidu/index.html#/jobDetail/2/118223");
//        获取路径
        String ur = chromDriver.getCurrentUrl();
        System.out.println("这是第二个网页地址==》"+ur);
//      获取源代码
        String yuan= chromDriver.getPageSource();
        System.out.println("网页源代码==》"+yuan);
//        通过xpath找到申请职位的按钮、并收藏职位

//       chromDriver.findElement(By.xpath("//a[@class=\"apply-job\"]"));

//        WebElement elemnt = chromDriver.findElement(By.xpath("//div[@class='narrow']/div[@class='job-message-container']/div[@class='job-operation']/a[@class='apply-job']"));
//        elemnt.click();

//        WebElement element2 = chromDriver.findElement(By.xpath("//a[@class=\"collect-job\"]"));
//        element2.click();



//        再通过脚本返回上一页
        chromDriver.navigate().back();
//         浏览器最大化
        chromDriver.manage().window().maximize();

//        刷新
        chromDriver.navigate().refresh();
//        关闭
        chromDriver.close();
    }
}
