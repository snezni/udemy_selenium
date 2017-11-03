package webElementsExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvancedLocators {
    public static void main(String[] args) throws InterruptedException {

String url1 = "https://letskodeit.teachable.com/";
String url2 = "https://letskodeit.teachable.com/p/practice";
System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url1);

driver.findElement(By.xpath("//a[@class='btn-primary btn-hg text-center']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='navbar-header']//img")).click();
//*[@id="openwindow"]

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='navbar']//a[contains(@class,'navbar-link')and contains(@href,'sign_in')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='navbar-header']//img")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@class,'btn-primary btn-hg text-center') and contains(text(),'Enroll now')]')]")).click();






    }
}
