import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WorkingWithFrames {

    String practisePage = "https://letskodeit.teachable.com/p/practice";
    String expediaPage = "https://www.expedia.com/";
    WebDriver driver;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(practisePage);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("courses-iframe");
        WebElement element = driver.findElement(By.id("search-courses"));
        element.sendKeys("python");
        driver.switchTo().defaultContent();
        WebElement element1 = driver.findElement(By.id("name"));
        element1.sendKeys("Zoran");
        driver.switchTo().frame(2);
        element.sendKeys("pythonnnn");
        Thread.sleep(2000);




    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();


    }


}