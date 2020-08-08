package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageHabr extends AbstractPage {

    public HomePageHabr(WebDriver driver) {
        super(driver);
    }
    @Step("Открытие сайта habr.com")
    public void openHabr() {
        driver.get("https://habr.com/ru/");
    }
    @Step("Проверка наименования тайтла")
    public void checkTitleName (String title) {
        driver.findElement(By.xpath("//title[contains(text(), '"+ title +"')]"));
    }
    @Step("Проверка доступности текста в наименовании топика")
    public void checkTopicsAvailableText (String text) {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/post/479968/' and starts-with(text(), '"+ text +"')]"));
    }
    @Step("Проверка результата поиска")
    public void checkResultSearch (String result) {
        driver.findElement(By.xpath("//div[starts-with(@class, 'table-grid__item')]//em[contains(text(), '"+ result +"')]"));
    }
    @Step("Проверка наименования треда")
    public void checkThreadName (String thread) {
        driver.findElement(By.xpath("//div[contains(text(), '" + thread +"')]"));
    }
    @Step("Нажатие на кнопку 'Все потоки'")
    public void clickOnTopPageButton () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Разработка'")
    public void clickOnDevelopmentPageButton () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/develop/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Администрирование'")
    public void clickOnAdminPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/admin/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Дизайн'")
    public void clickOnDesignPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/design/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Менеджмент'")
    public void clickOnManagementPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/management/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Маркетинг'")
    public void clickOnMarketingPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/marketing/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Научпоп'")
    public void clickOnPopSciPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/popsci/']"))
                .click();
    }
    @Step("Нажатие на кнопку поиска")
    public void clickOnSearchButton() {
        driver.findElement(By.xpath("//button[@title='Поиск по сайту']"))
                .click();
    }
    @Step("Отправка данных в инпут поиска")
    public void sendDataToSearchInput(String search) {
        driver.findElement(By.xpath("//input[@placeholder='Поиск']"))
                .sendKeys(search, Keys.RETURN);
    }
    @Step("Нажатие на кнопку смены языка")
    public void clickOnLanguageButton() {
        driver.findElement(By.xpath("//button[@type='button' and starts-with(@class, 'btn btn_medium')]"))
                .click();
    }
    @Step("Нажатие на радио-кнопку установки английского языка")
    public void clickOnButtonEngLanguage() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='hl_langs_en']"))
                .click();
    }
    @Step("Нажатие на кнопку сохранения редактирования языка")
    public void clickOnSaveLanguageButton() {
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();
    }
    @Step("Нажатие на чекбокс установки английского языка тредов")
    public void clickOnButtonChangeTopicsLanguageEng() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_en']"))
                .click();
    }
    @Step("Нажатие на чекбокс установки русского языка тредов")
    public void clickOnButtonChangeTopicsLanguageRu() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_ru']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Лучшие топики'")
    public void clickOnButtonBestTopics() {
        WebElement element = driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/' and contains(text(), 'Лучшие')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    @Step("Нажатие на кнопку 'Лучшие за год топики'")
    public void clickOnButtonBestPerYearTopics() {
        driver.findElement(By.xpath("//a[@title='Лучшие публикации за год']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Хабы и компании'")
    public void clickOnButtonHubsAndComapny() {
        driver.findElement(By.xpath("//div[starts-with(@class, 'tabs__level')]//h3[contains(text(), 'Хабы и компании')]"))
                .click();
    }
    @Step("Нажатие на кнопку 'О сайте'")
    public void clickButtonAboutHabr() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/about/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Служба поддержки'")
    public void clickButtonFeedBack() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/feedback/']"))
                .click();
    }
    @Step("Нажатие на кнопку 'Мобильная версия'")
    public void clickButtonMobileVersion() {
        driver.findElement(By.xpath("//a[@href='https://m.habr.com/ru?mobile=yes']"))
                .click();
    }
    @Step("Нажатие на кнопку '<Habr>'")
    public void clickButtonAboutCompanyHabr() {
        driver.findElement(By.xpath("//a[@href='https://company.habr.com/']"))
                .click();
    }
}