package helppagelogin;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/8.
 */
public class HelperPageLogin {
    public static Logger logger=org.apache.log4j.Logger.getLogger(HelperPageLogin.class);
//    用户名
    public static void textyonghu(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_TEXT_YHM,5);
        seleniumUtil.sendKey(PageLogin.LOGIN_TEXT_YHM,name);
    }
//    密码
    public static void textmima(SeleniumUtil seleniumUtil,String pwd){
            seleniumUtil.waitForElementLoad(PageLogin.LOGIN_TEXT_MIMA,5);
        seleniumUtil.sendKey(PageLogin.LOGIN_TEXT_MIMA,pwd);
    }
//    点击登录按钮
    public static void clickdenglu(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageLogin.LOGIN_LINK_LOGIN,5);
        seleniumUtil.click(PageLogin.LOGIN_LINK_LOGIN);
    }
//    登录方法
    public static void login(SeleniumUtil seleniumUtil,String name,String pwd) throws InterruptedException {
        textyonghu(seleniumUtil,name);
        textmima(seleniumUtil,pwd);
        clickdenglu(seleniumUtil);
        Thread.sleep(5000);
    }
}
