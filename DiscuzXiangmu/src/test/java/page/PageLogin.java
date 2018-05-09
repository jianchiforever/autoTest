package page;

import org.openqa.selenium.By;

/**
 * Created by new on 2018/5/8.
 */
public class PageLogin {
//     用户名
     public static final By LOGIN_TEXT_YHM=By.name("username");
//     密码
     public static final By LOGIN_TEXT_MIMA=By.id("ls_password");
//     点击登录按钮
     public static final By LOGIN_LINK_LOGIN=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]");

}
