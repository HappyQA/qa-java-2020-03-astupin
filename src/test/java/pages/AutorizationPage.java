package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutorizationPage extends AbstractPage {

    public AutorizationPage(WebDriver driver) {
        super(driver);
    }
    public void emailInput (String email) {
        driver.findElement(By.xpath("//input[@placeholder='Электронная почта' and @type='text']"))
                .sendKeys(email);
    }
    public void passwordInput (String pass) {
        driver.findElement(By.xpath("//input[@placeholder='Введите пароль' and @type='password']"))
                .sendKeys(pass);
    }
    public void buttonEnter () {
        driver.findElement(By.xpath("//button[contains(text(), 'Войти')]"))
                .click();
    }
}
