package page;

import org.openqa.selenium.By;

/**
 * Created by new on 2018/5/9.
 */
public class PageBankuaiGuanli {
//       进入板块页面
    public static final By GUAN_LINK_BANKUAI=By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
//       密码写入
    public static final By GUAN_TEXT_MIMA=By.name("admin_password");
//       点击提交
    public static final By GUAN_LINK_TITI=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
//       点击论坛
    public static final By GUAN_LINK_LUNTAN=By.xpath("//*[@id=\"header_forum\"]");
//       创建新的板块
    public static final By GUAN_LINK_CHUANG=By.className("addtr");
//       提交
    public static final By GUAN_LINK_TIJIAO=By.id("submit_editsubmit");
//       提交
    public static final By GUAN_LINK_TIJIA=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
//       退出
    public static final By GUAN_LINK_TUICHU=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
}
