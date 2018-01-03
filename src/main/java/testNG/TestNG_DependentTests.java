package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_DependentTests {

    @BeforeClass
    public void setUp() throws Exception {
        System.out.println("TestNG_Priority -> before class");

    }

    @AfterClass
    public void tearDown() throws Exception {
        System.out.println("TestNG_Priority -> after class");
    }

    @Test (priority=2)
    public void testMethod1() throws Exception {
        System.out.println("TestNG_Priority -> testMethod1");
    }

    @Test (priority=1)
    public void testMethod2() throws Exception {
        System.out.println("TestNG_Priority -> testMethod2");
    }

    @Test(priority=0)
    public void testMethod3() throws Exception {
        System.out.println("TestNG_Priority -> testMethod3");
    }

}
