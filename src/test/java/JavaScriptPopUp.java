import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptPopUp {

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
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Zoran");
        driver.findElement(By.id("alertbtn")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);






    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();


    }


}