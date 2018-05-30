package helppagelogin;
import page.PageLogin;
import org.apache.log4j.Logger;
import util.SeleniumUtil;
/**
 * Created by new on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger = org.apache.log4j.Logger.getLogger(HelperLoginPage.class);
//     你好
    public static void clickNihao(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_NIHAO);
    }
//    登录
    public static void clickDianji(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_DIANJI);
    }
//    用户登录
    public static void textYonghu(SeleniumUtil seleniumUtil,String name){
        seleniumUtil.sendkey(PageLogin.LOGIN_TEXT_YONGHU,name);
    }
//    密码
    public static void textMima(SeleniumUtil seleniumUtil,String pwd){
        seleniumUtil.sendkey(PageLogin.LOGIN_TEXT_MIMA,pwd);
    }
//    登录按钮
    public static void clickAnnie(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_LINK_ANNIE);

    }
//    登录方法
    public static void login(SeleniumUtil seleniumUtil,String name,String pwd){
        clickNihao(seleniumUtil);
        clickDianji(seleniumUtil);
        textYonghu(seleniumUtil,name);
        textMima(seleniumUtil,pwd);
        clickAnnie(seleniumUtil);
    }
}
