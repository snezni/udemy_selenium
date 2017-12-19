package base;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class BaseTestSuiteTest {


    @BeforeSuite
    public void setUp() throws Exception {
        System.out.println("Execution before suite");
    }


    @AfterSuite
    public void tearDown() throws Exception {
        System.out.println("Execution after suite");
    }
    @BeforeClass
    public void setUpClass() throws Exception {
        System.out.println("Execution before class");
    }


    @AfterClass
    public void tearDownClass() throws Exception {
        System.out.println("Execution after class");
    }

}