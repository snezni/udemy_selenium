package webElementsExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicElements {
    public static void main(String[] args) {
        String url = "https://Google.com";
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //find element by xpath
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("This is a text to search");

        // find element by name
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("btnK")).click();

        // find element using link text or partialLink
        driver.findElement(By.linkText("More")).click();
        // find element using partial link need to exist only one per page or we should use with collections
        driver.findElement(By.partialLinkText("Sign")).click();
        // find by class name need to exist only one per page or we should use with collections
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("LXRPh")).sendKeys("My mail@mail.com");
        // find by id
        driver.findElement(By.id("identifierNext")).click();
        // find by tag name











    }


}
