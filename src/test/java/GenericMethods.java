import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GenericMethods {
    WebDriver driver;

   public GenericMethods(WebDriver driver){
        this.driver = driver;
   }

   public WebElement getElement(String locator, String type ){

       type = type.toLowerCase();
       switch (type){
           case "id":
               return this.driver.findElement(By.id(locator));
               break;
           case "name":
               return this.driver.findElement(By.name(locator));
               break;
           case "xpath":
               return this.driver.findElement(By.xpath(locator));
               break;
           case "cssselector":
               return this.driver.findElement(By.cssSelector(locator));
               break;
           case "linktext":
               return this.driver.findElement(By.linkText(locator));
               break;
           case "partialinktext":
               return this.driver.findElement(By.partialLinkText(locator));
               break;
           case "classname":
               return this.driver.findElement(By.className(locator));
               break;
           default:
              return new IllegalArgumentException("Invalid type of web element argument: " + type);


       }

   }

}