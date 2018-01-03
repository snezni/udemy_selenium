
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class CapturingElement {

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

    }

    public static String getRandomString(int length){
      StringBuilder sb = new StringBuilder();
      String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
      for (int i =0; i < length;i++){
          int index = (int)(Math.random() * characters.length());
          sb.append(characters.charAt(index));
      }
      return sb.toString();

    }

    @After
    public void tearDown() throws Exception {
       String fileName = getRandomString(7)+".png";
       String directory = "C:\\Users\\Zoran\\Desktop\\SeleniumCaptures\\";

       File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(sourceFile, new File(directory + fileName));
        driver.quit();
        WebElement element = driver.findElement(By.id("test"));
        element.sendKeys(Keys.ENTER);


    }


}