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

public class WorkingWithMultiSelector {

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
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select select = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select orange by value");
        select.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("De-select orange by value");
        select.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Select peach by index");
        select.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select Apple by visible text");
        select.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Print all selected options");
        List<WebElement>selectedOptions = select.getAllSelectedOptions();
        for (WebElement elements : selectedOptions) {

            System.out.println(elements.getText());
            
        }
        Thread.sleep(2000);
        System.out.println("De-select all selected options");
        select.deselectAll();

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}