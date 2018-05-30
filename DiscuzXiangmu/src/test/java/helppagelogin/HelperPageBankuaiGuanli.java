package helppagelogin;
import org.apache.log4j.Logger;
import page.PageBankuaiGuanli;
import page.PagePostReplies;
import util.SeleniumUtil;
/**
 * Created by new on 2018/5/9.
 */
public class HelperPageBankuaiGuanli {
    public static Logger logger = org.apache.log4j.Logger.getLogger(HelperPageBankuaiGuanli.class);
//     进入板块页面
    public static void clickBankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_BANKUAI,5);
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_BANKUAI);
    }
//     密码写入
    public static void textMima(SeleniumUtil seleniumUtil,String mima){
        seleniumUtil.handle();
        seleniumUtil.sendKey(PageBankuaiGuanli.GUAN_TEXT_MIMA,mima);
    }
//     点击提交
    public static void clickTiti(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_TITI);
    }
//     点击论坛
    public static void clickLuntan(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_LUNTAN,5);
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_LUNTAN);
    }
//     创建新的模板
    public static void clickChuang(SeleniumUtil seleniumUtil){
//        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_CHUANG,5);
        seleniumUtil.iframe("main");
//        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_CHUANG,5);
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_CHUANG);
    }
//     提交
    public static void clickTijiao(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_TIJIAO,5);
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_TIJIAO);
    }
//     退出
    public static void clickTuichu(SeleniumUtil seleniumUtil){
//        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_TUICHU,5);
        seleniumUtil.iframe();
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_TUICHU);
    }
//       提交
    public static void clickTiji(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageBankuaiGuanli.GUAN_LINK_TIJIA,5);
        seleniumUtil.click(PageBankuaiGuanli.GUAN_LINK_TIJIA);
    }

//     模板新建方法
    public static void xinjian(SeleniumUtil seleniumUtil,String mima) throws InterruptedException {
        clickBankuai(seleniumUtil);

        textMima(seleniumUtil,mima);
        clickTiti(seleniumUtil);
        clickLuntan(seleniumUtil);
        Thread.sleep(3000);
        clickChuang(seleniumUtil);
        Thread.sleep(3000);
        clickTijiao(seleniumUtil);
        Thread.sleep(3000);
        clickTuichu(seleniumUtil);
        textMima(seleniumUtil, mima);
        Thread.sleep(3000);
        clickTiji(seleniumUtil);
        Thread.sleep(3000);
    }
}
