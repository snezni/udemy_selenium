import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import webElementsExcercise.GenericMethods;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class GenericsMethodDemo {

    private String basicUrl = "https://letskodeit.teachable.com/";
    private final String  practisePage = "https://letskodeit.teachable.com/p/practice";
    private WebDriver driver;
    private GenericMethods generic;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        generic = new GenericMethods(driver);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(practisePage);
        WebElement element = generic.getElement("name", "id");
        element.sendKeys("Test2");



    }

    @Test
    public void test2() throws InterruptedException {
        driver.get(practisePage);
        List<WebElement> elementList = generic.getElementList("//input[@type='text']", "xpath");
        System.out.println("Size of elements are: " + elementList.size());
    }
    @Test
    public void test3() throws InterruptedException {
        driver.get(practisePage);
        boolean result = generic.isElementPresent("name","id");
        System.out.println("Element is present is: " + result);

        boolean result2 = generic.isElementPresent("name-not-present","id");
        System.out.println("Is element present is: " + result2 );
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }



}