package util;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
/**
 * log4j在项目中如何使用？
 * 解决方案：在每个类中，都加上日志信息，复用性不强，不用
 * 新的解决：对selenium常用的API进行二次封装  log   Exception
 * Created by new on 2018/5/4.
 */
public class SeleniumUtil {
    private static Logger logger = Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver = null;
//1. 加载驱动
    public WebDriver getDriver(String driverType){
       if (driverType.equals("chrome")){
           driver = new ChromeDriver();
           logger.info("启动谷歌");
       }else if (driverType.equals("firefox")){
         driver = new FirefoxDriver();
           logger.info("启动火狐");
       }else{
           logger.error("不能启动浏览器");
       }
        return driver;
    }
//    2.识别一个元素
        WebElement ele = null;
    public WebElement findElement(By by){

        try{
            ele = driver.findElement(by);
            logger.info("找到元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("找不到元素");
        }
        return ele;
    }
//3.打开网页
    public void url(String url){
        driver.get(url);
        logger.info("打开网址"+url);
    }
//4.返回元素定位值
    public String getLocatorByElement(WebElement element,String exceptText){
        String text = element.toString();
        String except=null;
        try{
            except = text.substring(text.indexOf(exceptText)+1,
                    text.length()-1);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("failed to find the String:"+exceptText);
        }
        return except;
    }
//5.识别一组元素
    public List<WebElement> findElements(By by){
        List<WebElement> eles = null;
        try{
            eles = driver.findElements(by);
            logger.info("找到元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("找不到元素");
        }
        return eles;
    }
//    6.清除元素内容
    public void clear(By by){
        WebElement w=findElement(by);
        w.clear();
        logger.info("清除元素内容成功");
    }
//    7.文本框中输入内容
    public void sendkey(By by,String te){
        WebElement www=findElement(by);
        www.sendKeys(te);
        logger.info("输入内容成功");
    }
//    8.对元素做点击操作
    public void click(By by){
        WebElement wwwww=findElement(by);

        try{
            wwwww.click();
           logger.info("点击成功");
        }catch (StaleElementReferenceException e){
            e.printStackTrace();
           logger.error("点击失败");
        }
    }
//    9.获取控件内容
    public void Text(By by){
        WebElement web = findElement(by);
        String test=web.getText();
        driver.get(test);
        logger.info("获取成功");
    }
//    10.根据顶部title判断当前页面是否是预期页面
    public String assertPage(String Title){
        if (Title.equals(driver.getTitle())){
            logger.info("是当前页面");
        }else{
            logger.error("不是当前页面");
        }
        return Title;
    }
//    11.校验元素是否存在
    public boolean isExist(By element){
        try{
            driver.findElement(element);
            return true;
        }catch (NoSuchElementException e){
            logger.info(element.toString()+"元素不存在");
        }
        return false;
    }
//12. 校验文本是否与预期一致
     public void assertPage(WebElement element,String exceptedContent){
         String actual=element.getText();
         try{
             Assert.assertEquals(actual,exceptedContent);
         }catch(Exception e){
             e.printStackTrace();
             logger.error("未找到---当前页面是"+actual+"期望页面是"+exceptedContent);
         }
         logger.info("当前页面是"+actual);
     }
}
