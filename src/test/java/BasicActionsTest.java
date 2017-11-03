import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BasicActionsTest {

    String basicUrl = "https://letskodeit.teachable.com/";
    WebDriver driver;



    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.get(basicUrl);
        driver.findElement(By.xpath("//div[@class = 'navbar-header']//a[@href='/sign_in']")).click();
        System.out.println("Element clicked");
        WebElement email = driver.findElement(By.id("user_email"));
        email.clear();
        email.sendKeys("zoran.v.zivanovic@gmail.com");
        System.out.println("Sending keys to user name field");
        driver.findElement(By.id("user_password")).sendKeys("12345");
        System.out.println("Sending keys to password field");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}