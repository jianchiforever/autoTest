package test;

import helppagelogin.HelperPageLogin;
import helppagelogin.HelperPagePostSearch;
import helppagelogin.HelperPageQuit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/10.
 */
public class DiscuzThree extends BasicTest {
    @Test
     public void three() throws InterruptedException {
        HelperPageLogin.login(seleniumUtil,"wen","123456");
        HelperPagePostSearch.sousuo(seleniumUtil,"大海");

     }
}
