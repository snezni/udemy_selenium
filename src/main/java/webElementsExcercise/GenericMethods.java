package webElementsExcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenericMethods {
    private final WebDriver driver;

    public GenericMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type) {

        type = type.toLowerCase();
        switch (type) {
            case "id":
                System.out.println("Element found with id: " + locator);
                return this.driver.findElement(By.id(locator));
            case "name":
                System.out.println("Element found with name: " + locator);
                return this.driver.findElement(By.name(locator));
            case "xpath":
                System.out.println("Element found with xpath: " + locator);
                return this.driver.findElement(By.xpath(locator));
            case "cssselector":
                System.out.println("Element found with css: " + locator);
                return this.driver.findElement(By.cssSelector(locator));
            case "linktext":
                System.out.println("Element found with linkText: " + locator);
                return this.driver.findElement(By.linkText(locator));
            case "partialinktext":
                System.out.println("Element found with partialLinkText: " + locator);
                return this.driver.findElement(By.partialLinkText(locator));
            case "classname":
                System.out.println("Element found with classname: " + locator);
                return this.driver.findElement(By.className(locator));
            default:
                System.out.println("Locator type not suported");
                return null;

        }
    }

    public List<WebElement> getElementList(String locator, String type) {

        type = type.toLowerCase();
        switch (type) {
            case "id":
                System.out.println("Element found with id: " + locator);
                return this.driver.findElements(By.id(locator));
            case "name":
                System.out.println("Element found with name: " + locator);
                return this.driver.findElements(By.name(locator));
            case "xpath":
                System.out.println("Element found with xpath: " + locator);
                return this.driver.findElements(By.xpath(locator));
            case "cssselector":
                System.out.println("Element found with css: " + locator);
                return this.driver.findElements(By.cssSelector(locator));
            case "linktext":
                System.out.println("Element found with linkText: " + locator);
                return this.driver.findElements(By.linkText(locator));
            case "partialinktext":
                System.out.println("Element found with partialLinkText: " + locator);
                return this.driver.findElements(By.partialLinkText(locator));
            case "classname":
                System.out.println("Element found with classname: " + locator);
                return this.driver.findElements(By.className(locator));
            default:
                System.out.println("Locator type not suported");
                return null;

        }
    }
    public boolean isElementPresent(String locator, String type){
        List<WebElement>elementList = getElementList(locator,type);
        int listSize = elementList.size();
        if(listSize>0){
            return true;
        }
        else{
            return false;
        }
    }


    }
