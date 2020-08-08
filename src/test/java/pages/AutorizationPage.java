package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutorizationPage extends AbstractPage {

    public AutorizationPage(WebDriver driver) {
        super(driver);
    }
    @Step("Инпут ввода Email")
    public void emailInput (String email) {
        driver.findElement(By.xpath("//input[@placeholder='Электронная почта' and @type='text']"))
                .sendKeys(email);
    }
    @Step("Инпут ввода Password")
    public void passwordInput (String pass) {
        driver.findElement(By.xpath("//input[@placeholder='Введите пароль' and @type='password']"))
                .sendKeys(pass);
    }
    @Step("Нажатие на кнопку 'Войти'")
    public void buttonEnter () {
        driver.findElement(By.xpath("//button[contains(text(), 'Войти')]"))
                .click();
    }
}
