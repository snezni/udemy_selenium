import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BasicActionsSlider {

    String basicUrl = "https://letskodeit.teachable.com/p/practice";
    String jqueryPage = "https://jqueryui.com/slider/";
    WebDriver driver;
    JavascriptExecutor javaScript;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        javaScript = (JavascriptExecutor) driver;
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(jqueryPage);
        //javaScript.executeScript("window.scrollBy(0,700)");
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
        Actions actions = new Actions(driver);



        Thread.sleep(3000);



    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}