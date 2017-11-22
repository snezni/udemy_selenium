import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchingWIndow {

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

        // Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Browser window is: " + parentHandle);
        // Find Open window button
        WebElement openWindowBtn = driver.findElement(By.id("openwindow"));
        openWindowBtn.click();
        // Get all handles
        Set<String> handles = driver.getWindowHandles();
        // Switching between handles
        for(String handle:handles){
            System.out.println(handle);
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                WebElement searchField = driver.findElement(By.id("search-courses"));
                searchField.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
            }

        }

        // Switch back to the parent window
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("benzradio")).click();



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();


    }


}