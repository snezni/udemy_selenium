import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GettingTextAnAtrValueFromElement {

    String basicUrl = "https://letskodeit.teachable.com/";
    String practisePage = "https://letskodeit.teachable.com/p/practice";
    WebDriver driver;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(practisePage);
        WebElement btnOpenTab = driver.findElement(By.id("opentab"));
        System.out.println("Text of this button is: " + btnOpenTab.getText() + "\n" +
                "Link from this button is: " + btnOpenTab.getAttribute("href"));


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}