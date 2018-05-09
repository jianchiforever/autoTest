package util;


import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.List;

/**
 * Created by new on 2018/5/8.
 */
public class SeleniumUtil {
    public static Logger logger = Logger.getLogger(SeleniumUtil.class);
    public WebDriver dirver = null;
//     加载驱动
    public WebDriver getDirver(String driverType){
        if (driverType.equals("chrome")){
            dirver = new ChromeDriver();
            logger.info("启动谷歌");
        }else if (driverType.equals("firefox")){
            dirver = new FirefoxDriver();
            logger.info("启动火狐");
        }else{
            logger.error("不能启动浏览器");
        }
        return dirver;
    }
//     识别元素
    WebElement element = null;
    public WebElement findElement(By by){
        try {
            element = dirver.findElement(by);
            logger.info("找到元素");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("找不到元素");
        }
        return element;
    }
//     打开网页
    public void url(String url){
        dirver.get(url);
        logger.info("打开"+url+"网页");
    }
//     返回元素定位值
    public String getLocatorByElement(WebElement element,String exceptText){
        String text = element.toString();
        String except=null;
        try{
           except = text.substring(text.indexOf(exceptText)+1,text.length()-1);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("failed to find the String:"+exceptText);
        }
        return except;
    }
//    识别一组元素
    public List<WebElement> findElements(By by) {
        List<WebElement> elements = null;
        try {
          elements=dirver.findElements(by);
            logger.info("找到组元素");
        }catch (NoSuchElementException e){
          e.printStackTrace();
            logger.error("找不到组元素");
        }
        return elements;
    }
//    清除元素内容
      public void clear(By by){
          WebElement webElement=findElement(by);
          webElement.clear();
          logger.info("清除元素内容成功");
      }
//    文本框输入内容
     public void sendKey(By by,String te){
         WebElement wb = findElement(by);
         wb.sendKeys(te);
         logger.info("输入内容成功");
     }
//    对元素的点击操作
     public void click(By by){
         WebElement web = findElement(by);
         try{
             web.click();
             logger.info("点击成功");
         }catch (StaleElementReferenceException e){
             e.printStackTrace();
             logger.error("点击失败");
         }
     }
//    设置等待元素
    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(dirver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }



}
