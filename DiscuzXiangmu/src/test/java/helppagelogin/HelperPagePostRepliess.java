package helppagelogin;

import org.apache.log4j.Logger;
import page.PagePostReplies;
import page.PagePostRepliess;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/10.
 */
public class HelperPagePostRepliess {

        public static Logger logger = org.apache.log4j.Logger.getLogger(HelperPagePostRepliess.class);
        //    点击新建的板块
        public static void clickbankuai(SeleniumUtil seleniumUtil)  {
            seleniumUtil.waitForElementLoad(PagePostRepliess.LOGIN_LINK_BANKUAI,10);
            seleniumUtil.click(PagePostRepliess.LOGIN_LINK_BANKUAI);
        }
        //    快速发帖
        public static void textfatie(SeleniumUtil seleniumUtil,String fatei){
            seleniumUtil.waitForElementLoad(PagePostRepliess.LOGIN_TEXT_FATEI,5);
            seleniumUtil.sendKey(PagePostRepliess.LOGIN_TEXT_FATEI,fatei);
        }
        //    帖子内容
        public static void textneirong(SeleniumUtil seleniumUtil,String neirong){
            seleniumUtil.waitForElementLoad(PagePostRepliess.LOGIN_TEXT_NEIRONG,5);
            seleniumUtil.sendKey(PagePostRepliess.LOGIN_TEXT_NEIRONG,neirong);
        }
        //    发表帖子
        public static void clickfabiao(SeleniumUtil seleniumUtil){
            seleniumUtil.click(PagePostRepliess.LOGIN_LINK_FABIAO);

        }
        //    回复帖子
        public static void clickhuifu(SeleniumUtil seleniumUtil){
            seleniumUtil.waitForElementLoad(PagePostRepliess.LOGIN_LINK_HUIFU,5);
            seleniumUtil.click(PagePostRepliess.LOGIN_LINK_HUIFU);

        }
        //    回复内容
        public static void texthuif(SeleniumUtil seleniumUtil,String huifuneirong){
            seleniumUtil.waitForElementLoad(PagePostRepliess.LOGIN_TEXT_HUIF,5);
            seleniumUtil.sendKey(PagePostRepliess.LOGIN_TEXT_HUIF,huifuneirong);

        }
        //    点击回复主题
        public static void clickzhuti(SeleniumUtil seleniumUtil){
            seleniumUtil.click(PagePostRepliess.LOGIN_LINK_ZHUTI);

        }
        //    发表回复帖子方法
        public static void FH(SeleniumUtil seleniumUtil,String fatei,String neirong,String huifuneirong) throws InterruptedException {
            clickbankuai(seleniumUtil);
            textfatie(seleniumUtil,fatei);
            textneirong(seleniumUtil,neirong);
            clickfabiao(seleniumUtil);
            clickhuifu(seleniumUtil);
            texthuif(seleniumUtil,huifuneirong);
            Thread.sleep(16000);
            clickzhuti(seleniumUtil);
        }
    }
