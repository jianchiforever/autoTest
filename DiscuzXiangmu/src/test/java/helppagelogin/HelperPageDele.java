package helppagelogin;

import org.apache.log4j.Logger;
import page.PageDelete;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/9.
 */
public class HelperPageDele {
    public static Logger logger = org.apache.log4j.Logger.getLogger(HelperPageDele.class);
//     点击默认模板
    public static void clickBankuai(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelete.DELEDT_LINK_BANKUAI,5);
        seleniumUtil.click(PageDelete.DELEDT_LINK_BANKUAI);
    }
//     点击文章
    public static void clickWenZhang(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelete.DELEDT_LINK_WENZHANG,5);
        seleniumUtil.click(PageDelete.DELEDT_LINK_WENZHANG);
    }
//     点击删除
    public static void clickDele(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelete.DELEDT_LINK_DELE,5);
        seleniumUtil.click(PageDelete.DELEDT_LINK_DELE);
    }
//     点击确认
    public static void clickQueren(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelete.DELEDT_LINK_QUEREN,5);
        seleniumUtil.click(PageDelete.DELEDT_LINK_QUEREN);
    }
//     删除操作
    public static void Dele(SeleniumUtil seleniumUtil) throws InterruptedException {
        clickBankuai(seleniumUtil);
        clickWenZhang(seleniumUtil);
        clickDele(seleniumUtil);
        clickQueren(seleniumUtil);
    }
}
