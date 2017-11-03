import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {

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
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text box displayed: " + textBox.isDisplayed());
        Thread.sleep(2000);

        WebElement  hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("--------------------------------------------------------- ");
        System.out.println("Text box displayed: " + textBox.isDisplayed());
        System.out.println("Text box Enabled: " + textBox.isEnabled());
        System.out.println("Text box selected: " + textBox.isSelected());


        WebElement  showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("--------------------------------------------------------- ");
        System.out.println("Text box displayed: " + textBox.isDisplayed());
        System.out.println("Text box Enabled: " + textBox.isEnabled());
        System.out.println("Text box selected: " + textBox.isSelected());


    }
    @Test
    public void testExpedia() throws InterruptedException {
       driver.get(expediaPage);
       WebElement childEllemntHidden = driver.findElement(By.id("package-1-age-select-1-hp-package"));
        System.out.println("Text box displayed: " + childEllemntHidden.isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}