package test;

import helppagelogin.*;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/9.
 */
public class DiscuzTwo extends BasicTest {
@Test
    public void two()throws InterruptedException{
    HelperPageLogin.login(seleniumUtil,"admin","123456");
    HelperPageDele.Dele(seleniumUtil);
    HelperPageBankuaiGuanli.xinjian(seleniumUtil,"123456");
    HelperPageQuit.quit(seleniumUtil);
    HelperPageQuit.quit(seleniumUtil);
    HelperPageLogin.login(seleniumUtil,"wen","12 3456");
    HelperPagePostRepliess.FH(seleniumUtil,"大海","面朝大海，春暖花开","飒飒撒撒所所所");
}
}
