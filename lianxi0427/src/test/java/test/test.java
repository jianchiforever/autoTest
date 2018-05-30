package test;

import helppagelogin.HelperLoginPage;
import org.testng.annotations.Test;

/**
 * Created by new on 2018/5/7.
 */
public class test extends testFu {

    @Test
    public void denglu(){
        HelperLoginPage.login(seleniumUtil,"18434394050","SY1123..0");
    }
}
