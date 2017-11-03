import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {

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
        WebElement bmwElement = driver.findElement(By.id("bmwradio"));
        bmwElement.click();
        Thread.sleep(3000);
        WebElement benzElement = driver.findElement(By.id("benzradio"));
        benzElement.click();
        Thread.sleep(3000);
        WebElement bmwchckElement = driver.findElement(By.id("bmwcheck"));
        bmwchckElement.click();
        WebElement benzCheckElement = driver.findElement(By.id("benzcheck"));
        benzCheckElement.click();
        Thread.sleep(3000);
        System.out.println("BMW Radio is selected? " + bmwElement.isSelected());
        System.out.println("Benz Radio is selected? " + benzElement.isSelected());
        System.out.println("BMW check button is selected? " + bmwchckElement.isSelected());
        System.out.println("Benz check button is selected? " + benzCheckElement.isSelected());
        System.out.println("Benz check button is selected? " + driver.findElement(By.id("hondacheck")).isSelected());







    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}