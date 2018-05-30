import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by new on 2018/5/2.
 */
public class TriangleTest {
    Triangle triangle=null;
    @Test
    public void testGetType1() throws Exception {
    triangle=new Triangle(1,2,3);
        Assert.assertEquals(triangle.isTriangle(triangle),false,"不是三角形");
        Assert.assertEquals(triangle.getType(triangle),"Illegal");
    }
    @Test
    public void testGetType2() throws Exception {
        triangle=new Triangle(1,-2,3);
        Assert.assertEquals(triangle.isTriangle(triangle),false,"不是三角形");
        Assert.assertEquals(triangle.getType(triangle),"Illegal");

    }
    @Test
    public void testGetType3() throws Exception {
        triangle=new Triangle(3,3,3);
        Assert.assertEquals(triangle.isTriangle(triangle),true,"是三角形");
        Assert.assertEquals(triangle.getType(triangle),"Regular");

    }
    @Test
    public void testGetType4() throws Exception {

        triangle=new Triangle(3,3,4);
        Assert.assertEquals(triangle.isTriangle(triangle),true,"是三角形");
        Assert.assertEquals(triangle.getType(triangle),"Isosceles");
}
    @Test
    public void testGetType5() throws Exception {
        triangle=new Triangle(3,4,5);
        Assert.assertEquals(triangle.isTriangle(triangle),true,"是三角形");
        Assert.assertEquals(triangle.getType(triangle),"Scalene");

    }

    @Test
    public void testDiffOfBorders() throws Exception {

    }

    @Test
    public void testGetBorders() throws Exception {
        triangle=new Triangle(3,4,5);
        long[] borders =triangle.getBorders();
        Assert.assertEquals(borders[0],3);
        Assert.assertEquals(borders[1],4);
        Assert.assertEquals(borders[2],5);

    }
}