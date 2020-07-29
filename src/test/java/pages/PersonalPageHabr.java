package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPageHabr extends AbstractPage {

    public PersonalPageHabr(WebDriver driver) {
        super(driver);
    }
    public void buttonSettings () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/auth/settings/profile/']"))
                .click();
    }
    public void inputName (String name) {
        driver.findElement(By.xpath("//input[maxlength='40']"))
                .sendKeys(name);
    }
    public void personalSaveSettings () {
        driver.findElement(By.xpath("//button[type='submit']"))
                .click();
    }
    public void personalUploadButton () {
        driver.findElement(By.xpath("//input[type='file']"))
                .sendKeys("/home/happyqa/example.jpg");
    }
}