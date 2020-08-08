package pages;

import io.qameta.allure.Step;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends AbstractPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openPage() {
        driver.get("https://otus.ru/");
    }
    @Step("Нажатие на кнопку Логина")
    public void buttonLogin () {
        driver.findElement(By.xpath("//button[@class='header2__auth js-open-modal']"))
                .click();
    }
    @Step("Переход на кнопку перехода в ЛК")
    public void openMyProfile () {
        WebElement element = driver.findElement(By.xpath("//div[starts-with(@class, 'header2-menu__item header2-menu__item_small header2-menu__item_dropdown header2-menu')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на кнопку перехода в ЛК")
    public void openLK() {
        driver.findElement(By.xpath("//a[@title='Личный кабинет']"))
                .click();
    }
}
