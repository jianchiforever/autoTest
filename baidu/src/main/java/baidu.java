import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by new on 2018/4/24.
 */
public class baidu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","F:\\ceshi\\linux\\mavens\\chrome&driver\\chromedriver.exe");
//      实例化
        WebDriver chromDriver = new ChromeDriver();
//      找到对应的页面
        chromDriver.get("http://home.baidu.com/home/index/contact_us");
//        获取路径
        String url=chromDriver.getCurrentUrl();
        System.out.println("当前的路径是：===》"+url);
//        获取当前标题
        String title=chromDriver.getTitle();
        System.out.println("当前的标题是：===》"+title);
//        获取网页源代码
        String pageSourse=chromDriver.getPageSource();
        System.out.println("网页源代码是：===》"+pageSourse);
    }
}
