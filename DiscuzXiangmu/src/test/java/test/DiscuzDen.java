package test;

import helppagelogin.HelperPageLogin;
import helppagelogin.HelperPagePostReplies;
import helppagelogin.HelperPageQuit;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/30.
 */
public class DiscuzDen extends BasicTest{
    @Test
    public void den() throws InterruptedException {
        HelperPageLogin.login(seleniumUtil, "wen", "123456");
    }
}
