package test;

import helppagelogin.HelperPageLogin;
import helppagelogin.HelperPagePostReplies;
import helppagelogin.HelperPageQuit;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/8.
 */
public class DiscuzOne extends BasicTest {
    @Test
    public void one() throws InterruptedException {
        HelperPageLogin.login(seleniumUtil, "wen", "123456");
        HelperPagePostReplies.FH(seleniumUtil, "江山", "江山易改，本性难移", "啦啦啦啦啦");
        HelperPageQuit.quit(seleniumUtil);
    }
}