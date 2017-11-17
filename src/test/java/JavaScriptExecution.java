import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {

    String basicUrl = "https://letskodeit.teachable.com/";
    private final String  practisePage = "https://letskodeit.teachable.com/p/practice";
    WebDriver driver;
    private JavascriptExecutor javascript;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testScroll() throws InterruptedException {
        driver.get(practisePage);
        javascript = (JavascriptExecutor) driver;
        javascript.executeScript("window.scrollBy(0,1900)");
        Thread.sleep(3000);
        javascript.executeScript("window.scrollBy(0,-1900)");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("mousehover"));
        javascript.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(3000);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(basicUrl);
        javascript = (JavascriptExecutor) driver;
        long height = (Long) javascript.executeScript("return window.innerHeight;");
        long width = (Long) javascript.executeScript("return window.innerWidth;");
        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);
        Thread.sleep(3000);
    }

        @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}