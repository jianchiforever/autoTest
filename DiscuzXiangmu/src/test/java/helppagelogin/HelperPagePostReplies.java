package helppagelogin;

import org.apache.log4j.Logger;
import page.PageLogin;
import page.PagePostReplies;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/8.
 */
public class HelperPagePostReplies {
    public static Logger logger = org.apache.log4j.Logger.getLogger(HelperPagePostReplies.class);
    //    点击默认板块
    public static void clickbankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostReplies.LOGIN_LINK_BANKUAI);
    }
    //    快速发帖
    public static void textfatie(SeleniumUtil seleniumUtil,String fatei){
        seleniumUtil.sendKey(PagePostReplies.LOGIN_TEXT_FATEI,fatei);
    }
    //    帖子内容
    public static void textneirong(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.sendKey(PagePostReplies.LOGIN_TEXT_NEIRONG,neirong);
    }
    //    发表帖子
    public static void clickfabiao(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostReplies.LOGIN_LINK_FABIAO);

    }
    //    回复帖子
    public static void clickhuifu(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostReplies.LOGIN_LINK_HUIFU);

    }
    //    回复内容
    public static void texthuif(SeleniumUtil seleniumUtil,String huifuneirong){
        seleniumUtil.sendKey(PagePostReplies.LOGIN_TEXT_HUIF,huifuneirong);

    }
    //    点击回复主题
    public static void clickzhuti(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePostReplies.LOGIN_LINK_ZHUTI);

    }
    //    发表回复帖子方法
    public static void FH(SeleniumUtil seleniumUtil,String fatei,String neirong,String huifuneirong) throws InterruptedException {
        clickbankuai(seleniumUtil);
        Thread.sleep(2000);
        textfatie(seleniumUtil,fatei);
        Thread.sleep(2000);
        textneirong(seleniumUtil,neirong);
        Thread.sleep(2000);
        clickfabiao(seleniumUtil);
        Thread.sleep(5000);
        clickhuifu(seleniumUtil);
        Thread.sleep(2000);
        texthuif(seleniumUtil,huifuneirong);
        Thread.sleep(16000);
        clickzhuti(seleniumUtil);
    }
}
