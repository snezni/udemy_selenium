import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BasicActionsTest {

    String basicUrl = "https://letskodeit.teachable.com/p/practice";
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
        driver.get(basicUrl);
        //javaScript.executeScript("window.scrollBy(0,700)");
        WebElement mainElement = driver.findElement(By.id("mousehover"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mainElement).perform();
        Thread.sleep(3000);
        WebElement subElement = driver.findElement(By.xpath("//div[@class='mouse-hover-content']/a[text()='Top']"));

        subElement.click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}