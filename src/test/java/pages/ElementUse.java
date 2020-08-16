package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUse {

    public static void useElement (WebDriver driver, WebElement webElement) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(webElement)).click();
    }

    public static void sendDataInElement(WebDriver driver, WebElement webElement, String data) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(webElement)).clear();
        wait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(data);
    }
}