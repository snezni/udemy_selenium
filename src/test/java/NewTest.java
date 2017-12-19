import base.BaseTestSuiteTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import base.BaseTestSuiteTest;
public class NewTest extends BaseTestSuiteTest {

    String basicUrl = "https://letskodeit.teachable.com/p/practice";
    String jqueryPage = "https://jqueryui.com/slider/";
    WebDriver driver;
    JavascriptExecutor javaScript;

    @Test
    public void basicTest1(){
        System.out.println("This is a basicTest1 from newTest class");

    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execution before method");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("Execution after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Execution before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Execution after class");
    }


}