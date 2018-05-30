import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
/**
 * Created by new on 2018/5/2.
 */
public class While {
    @AfterMethod
    public void tearDown() throws Exception{
        whileTest.sum=0;
    }
    @Test
    public void testWhileTest() throws Exception {
      Assert.assertEquals(whileTest.whileTest(1,0),101);
    }
    @Test
    public void testWhileTest1() throws Exception {
        Assert.assertEquals(whileTest.whileTest(1,1),10);
    }
    @Test
    public void testWhileTest2() throws Exception {
        Assert.assertEquals(whileTest.whileTest(1,2),20);
    }
    @Test
    public void testWhileTest3() throws Exception {
        Assert.assertEquals(whileTest.whileTest(-1,2),0);
    }
}