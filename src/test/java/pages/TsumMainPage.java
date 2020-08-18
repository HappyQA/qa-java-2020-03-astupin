package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
    @Step("Нажатие на кнопку Полезная информация")
    public void clickOnBottomSlider () {
        WebElement webElement = driver.findElement(By.xpath("//span[@class='footer__toggle']"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(webElement)).click();
    }
    @Step("Нажатие на ссылку Контакты")
    public void clickOnContacts () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/contacts/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Наша история")
    public void clickOnOurHistory () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/history/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Карьера")
    public void clickOnCareer () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/career/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Бренды A-Z")
    public void clickOnBrands () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/brand/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Оплата")
    public void clickOnPayments () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/payment/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Доставка")
    public void clickOnDelivery () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/delivery/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Обмен и возврат")
    public void clickOnReturns () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/returns/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Условия продажи")
    public void clickOnTerms () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/terms/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на ссылку Шоппинг-сервисы")
    public void clickOnAboutService () {
        WebElement element = driver.findElement(By.xpath("//a[@href='/about/service/']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Проверка наименования открытой страницы")
    public void checkPageName (String name) {
        driver.findElement(By.xpath("//h1[contains(text(), '" + name + "')]"));
    }
}