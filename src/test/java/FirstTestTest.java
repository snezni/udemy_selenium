import org.junit.*;

import static org.junit.Assert.*;

public class
FirstTestTest {
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Executed before class");
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("Executed after class");
    }
    @Test
    public void test1(){
        System.out.println("Executed test1");
    }
    @Test
    public void test2(){
        System.out.println("Executed test1");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after test");
    }

}