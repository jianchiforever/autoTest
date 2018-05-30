import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 * Created by new on 2018/5/2.
 */
public class AbsTest {
    Abs abs=null;
    @BeforeMethod
    public void setUp() throws Exception{
        abs=new Abs();
    }
    @Test
    public void testAbs() throws Exception {
        Assert.assertEquals(abs.abs(-1),1,"-1的绝对值是1");
    }
    @Test
    public void testAbs1() throws Exception {
        Assert.assertEquals(abs.abs(1),1,"-1的绝对值是1");
    }
    @Test
    public void testAbs2() throws Exception {
        Assert.assertEquals(abs.abs(0),0,"-1的绝对值是1");
    }
}