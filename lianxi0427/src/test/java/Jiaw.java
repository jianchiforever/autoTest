import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by new on 2018/5/2.
 */
public class Jiaw {
    @Test
    public void testWhileTest() throws Exception {
        System.out.println("我是Test");
    }
    @BeforeSuite
    public void testWhileTest1() throws Exception {
        System.out.println("我是BeforeSuite");
    }
    @BeforeTest
    public void testWhileTest2() throws Exception {
        System.out.println("我是BeforeTest");
    }
    @BeforeClass
    public void testWhileTest3() throws Exception {
        System.out.println("我是BeforeClass");
    }
    @BeforeGroups
    public void testWhileTest4() throws Exception {
        System.out.println("我是BeforeGroups");
    }
    @BeforeMethod
    public void testWhileTest5() throws Exception {
        System.out.println("我是BeforeMethod");
    }

}
