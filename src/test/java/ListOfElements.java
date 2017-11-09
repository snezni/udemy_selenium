import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfElements {

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
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains (@name,'cars')]"));
        int radioButtonsSize = radioButtons.size();
        System.out.println("Size of the list is: " + radioButtonsSize);
        boolean isChecked = false;
        for (WebElement radioButton : radioButtons) {
            isChecked = radioButton.isSelected();
            if (!isChecked) {
                radioButton.click();
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