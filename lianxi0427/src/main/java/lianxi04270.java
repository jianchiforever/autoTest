import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by new on 2018/4/27.
 */
public class lianxi04270 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ceshi\\linux\\课件\\day04\\driver&chrome\\chromedriver.exe");

        WebDriver chromDriver = new ChromeDriver();
//      进入网页
        chromDriver.get("F:\\ceshi\\linux\\linuxs\\test\\Sublime Text 3\\selenium0425作业\\lianxi0427.html");
//      找到对应的元素
        WebElement element=chromDriver.findElement(By.id("jia"));
//      导入包
        Select list=new Select(element);
//        通过test来找对应的元素
        Thread.sleep(3000);
        list.selectByVisibleText("产品经理");
//        通过value来找对应的元素
        Thread.sleep(3000);
        list.selectByValue("2");
//        通过Index来找对应的元素
        Thread.sleep(3000);
        list.selectByIndex(2);
//        查看事是否是多选按钮
        System.out.println(list.isMultiple());
//        获取选项的值
        System.out.println("获取选项的值"+list.getFirstSelectedOption());
//        获取指定选项的值
        System.out.println("获取指定选项的值"+list.getOptions().get(4).getText());
//        获取所有选项
        List<WebElement>options=list.getAllSelectedOptions();
//        遍历出每一个选项的值
        for (WebElement option:options
             ) {
            System.out.println(option);

        }
        System.out.println("个数"+options.size());
    }
}
