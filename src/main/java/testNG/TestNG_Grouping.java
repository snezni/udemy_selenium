package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.out.println("TestNG_Priority -> before class");

    }

    @AfterClass (alwaysRun = true)
    public void tearDown() throws Exception {
        System.out.println("TestNG_Priority -> tearDown");
    }

    @Test (groups = {"cars","suv"})
    public void testBMWX6() throws Exception {
        System.out.println("TestNG_Priority -> testBMWX6");
    }

    @Test (groups = {"cars","sedan"})
    public void testAUdiA6() throws Exception {
        System.out.println("TestNG_Priority -> testAUdiA6");
    }

    @Test(groups = {"bikes"})
    public void testHondaCBR() throws Exception {
        System.out.println("TestNG_Priority -> testHondaCBR");
    }
    @Test (groups = {"bikes"})
    public void testNinja() throws Exception {
        System.out.println("TestNG_Priority -> testNinja");
    }


}
