package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutorizationPageHabr extends AbstractPage {

    public AutorizationPageHabr(WebDriver driver) {
        super(driver);
    }
    public void inputEmail (String email) {
        driver.findElement(By.xpath("//input[name='email']"))
                .sendKeys(email);
    }
    public void inputPassword (String pass) {
        driver.findElement(By.xpath("//input[name='password']"))
                .sendKeys(pass);
    }
    public void buttonEnter () {
        driver.findElement(By.xpath("//button[type='submit']"))
                .click();
    }
}
