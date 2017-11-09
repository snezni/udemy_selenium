import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfElements2 {

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
       List<WebElement> rbCars = driver.findElements(By.xpath("//input[@type = 'radio' and (@name = 'cars')]"));
       boolean isSelected = false;
       int rbCarsSize = rbCars.size();
        System.out.println("Number of size elements are: " + rbCarsSize);
        for (WebElement rbCar : rbCars) {
            isSelected = rbCar.isSelected();
            if (!isSelected) {
                rbCar.click();
                Thread.sleep(2000);
            }
        }



    }
    @Test
    public void test2() throws InterruptedException {
        driver.get(practisePage);
        List<WebElement>rbCars = driver.findElements(By.xpath("//input[@type = 'radio' and (@name = 'cars')]"));
        for (WebElement rbCar : rbCars) {
            boolean checked = false;
            checked = rbCar.isSelected();
            if (!checked) {
                rbCar.click();
                Thread.sleep(2000);
            }
        }

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}