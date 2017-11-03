import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {

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
    public void test() throws InterruptedException {
        driver.get(basicUrl);
        String title = driver.getTitle();
        System.out.println("Browser title is: " + title);

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current page url is: " + currentURL);

        String loginUrlPage = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(loginUrlPage);
        System.out.println("Navigate to login page");
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is :" + currentURL);
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back ");
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is :" + currentURL);
        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate forward ");
        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL is :" + currentURL);
        Thread.sleep(2000);




    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}