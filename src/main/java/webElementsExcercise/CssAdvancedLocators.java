package webElementsExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssAdvancedLocators {
    public static void main(String[] args) {
        String url = "https://letskodeit.teachable.com/p/practice";
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        //Pretraga elemenata pomocu css-a ili xpath-a je veoma mocna pretraga koja jeste malo sporija od pretrage
        //po id-u ili name-u ali daje vise mogucnosti, ona se uglavnom koristi kada nemamo ID ili je ID nije static nemamo
        // unique name ili unique link text


        // Osnovna pretraga po css-u:
        //
        // input[id=displayed-text], #displayed-text(# je shortcut za id sto znaci da ce izvrsiti pretragu pi id-u)
        // input#displayed-text(moze da se doda kako bi se smanjila pretraga po kojem tagu se vrsi pretraga)



        driver.findElement(By.cssSelector("[name=show-hide]")).click();
        driver.findElement(By.cssSelector("#displayed-text")).sendKeys("This is a test");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("input#displayed-text")).clear();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.cssSelector("#name")).click();
        driver.findElement(By.cssSelector("input[name=enter-name]")).sendKeys("This is a test");
        driver.findElement(By.cssSelector("#name")).clear();


        //css moze da se izvrsi pretraga i po css klasi

       /* driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
        //pretraga css koristeci wildcards
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.findElement(By.cssSelector(".btn-style.class1")).click();

        driver.close();


    }

}