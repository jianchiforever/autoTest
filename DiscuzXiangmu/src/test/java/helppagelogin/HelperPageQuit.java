package helppagelogin;

import org.apache.log4j.Logger;
import page.PageQuit;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/8.
 */
public class HelperPageQuit {
     public static Logger logger=org.apache.log4j.Logger.getLogger(HelperPageQuit.class);
//    用户退出
     public static void clicktuichu(SeleniumUtil seleniumUtil){
         seleniumUtil.click(PageQuit.LOGIN_LINK_TUICHU);
     }
}
