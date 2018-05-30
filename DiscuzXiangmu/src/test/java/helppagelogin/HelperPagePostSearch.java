package helppagelogin;

import org.apache.log4j.Logger;
import page.PagePostSearch;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/10.
 */
public class HelperPagePostSearch {
    public static Logger logger = org.apache.log4j.Logger.getLogger(HelperPagePostSearch.class);
//      搜索框输入
    public static void textshuru(SeleniumUtil seleniumUtil,String abc){
        seleniumUtil.waitForElementLoad(PagePostSearch.SOUSUO_TEXT_SHURU,5);
        seleniumUtil.sendKey(PagePostSearch.SOUSUO_TEXT_SHURU,abc);
    }
//      点击搜索按钮
    public static void clickshuru(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PagePostSearch.SOUSUO_LINK_SHURU,5);
        seleniumUtil.click(PagePostSearch.SOUSUO_LINK_SHURU);
    }
//      点击搜索的帖子
    public static void clicktiezi(SeleniumUtil seleniumUtil){
        seleniumUtil.handle();
        seleniumUtil.click(PagePostSearch.SOUSUO_LINK_SSDTZ);
        seleniumUtil.assertPageText(PagePostSearch.SOUSUO_LINK_SSDTZ,"大海");
        seleniumUtil.waitForElementLoad(PagePostSearch.SOUSUO_LINK_SSDTZ,5);
    }

//       搜索方法
    public static void sousuo(SeleniumUtil seleniumUtil,String abc){
        textshuru(seleniumUtil,abc);
        clickshuru(seleniumUtil);
        clicktiezi(seleniumUtil);
    }
}
