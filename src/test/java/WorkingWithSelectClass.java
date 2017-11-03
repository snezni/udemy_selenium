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

public class WorkingWithSelectClass {

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
        WebElement element = driver.findElement(By.id("carselect"));
        Select select = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select benz by value");
        select.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Select Honda by index");
        select.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select BMW by visible text");
        select.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("Print a list of all options");
        List<WebElement>options = select.getOptions();
        for (int i = 0; i<options.size();i++) {
            String optionName = options.get(i).getText();
            System.out.println(optionName);
            
        }





    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}