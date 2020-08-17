package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TsumMainPage extends AbstractPage {

    public TsumMainPage (WebDriver driver) {
        super(driver);
    }
    @Step("Открытие сайта ЦУМ.РУ")
    public void openSite () {
        driver.get("https://www.tsum.ru/");
    }
    @Step("Получение инпута для ввода Email")
    public void getInputEmailSubscription (String email) {
        driver.findElement(By.xpath("//input[@name='email']"))
                .sendKeys(email);
    }
    @Step("Нажатие на кнопку отправить")
    public void clickOnButtonSubscription () {
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();
    }
    @Step("Сверяем результат подписки")
    public void сheckSubscriptionTitle () {
        driver.findElement(By.xpath("//p[contains(text(), 'Вы успешно подписаны!')]"));
    }
}



