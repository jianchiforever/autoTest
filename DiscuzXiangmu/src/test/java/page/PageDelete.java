package page;

import org.openqa.selenium.By;

/**
 * Created by new on 2018/5/9.
 */
public class PageDelete {
//        点击默认模板
    public static final By DELEDT_LINK_BANKUAI=By.xpath("/html/body/div[7]/div[3]/div[3]/div[1]/div/div[2]/table/tbody/tr[1]/td[2]/h2/a");
//        点击文章
    public static final By DELEDT_LINK_WENZHANG=By.name("moderate[]");
//        点击删除
    public static final By DELEDT_LINK_DELE=By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");
//        点击确认
    public static final By DELEDT_LINK_QUEREN=By.id("modsubmit");

}
