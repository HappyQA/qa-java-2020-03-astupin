package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePageHabr extends AbstractPage {

    public HomePageHabr(WebDriver driver) {
        super(driver);
    }
    public void openHabr() {
        driver.get("https://habr.com/ru/");
    }
    public void checkTitleName (String title) {
        driver.findElement(By.xpath("//title[contains(text(), '"+ title +"')]"));
    }
    public void checkTopicsAvailableText (String text) {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/post/479968/' and starts-with(text(), '"+ text +"')]"));
    }
    public void checkResultSearch (String result) {
        driver.findElement(By.xpath("//div[starts-with(@class, 'table-grid__item')]//em[contains(text(), '"+ result +"')]"));
    }
    public void checkThreadName (String thread) {
        driver.findElement(By.xpath("//div[contains(text(), '" + thread +"')]"));
    }
    public void clickOnTopPageButton () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/']"))
                .click();
    }
    public void clickOnDevelopmentPageButton () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/develop/']"))
                .click();
    }
    public void clickOnAdminPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/admin/']"))
                .click();
    }
    public void clickOnDesignPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/design/']"))
                .click();
    }
    public void clickOnManagementPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/management/']"))
                .click();
    }
    public void clickOnMarketingPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/marketing/']"))
                .click();
    }
    public void clickOnPopSciPageButton() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/popsci/']"))
                .click();
    }
    public void clickOnSearchButton() {
        driver.findElement(By.xpath("//button[@title='Поиск по сайту']"))
                .click();
    }
    public void sendDataToSearchInput(String search) {
        driver.findElement(By.xpath("//input[@placeholder='Поиск']"))
                .sendKeys(search, Keys.RETURN);
    }
    public void clickOnLanguageButton() {
        driver.findElement(By.xpath("//button[@type='button' and starts-with(@class, 'btn btn_medium')]"))
                .click();
    }
    public void clickOnButtonEngLanguage() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='hl_langs_en']"))
                .click();
    }
    public void clickOnSaveLanguageButton() {
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();
    }
    public void clickOnButtonChangeTopicsLanguageEng() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_en']"))
                .click();
    }
    public void clickOnButtonChangeTopicsLanguageRu() {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_ru']"))
                .click();
    }
    public void clickOnButtonBestTopics() {
        WebElement element = driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/' and contains(text(), 'Лучшие')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    public void clickOnButtonBestPerYearTopics() {
        driver.findElement(By.xpath("//a[@title='Лучшие публикации за год']"))
                .click();
    }
    public void clickOnButtonHubsAndComapny() {
        driver.findElement(By.xpath("//div[starts-with(@class, 'tabs__level')]//h3[contains(text(), 'Хабы и компании')]"))
                .click();
    }
    public void clickButtonAboutHabr() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/about/']"))
                .click();
    }
    public void clickButtonFeedBack() {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/feedback/']"))
                .click();
    }
    public void clickButtonMobileVersion() {
        driver.findElement(By.xpath("//a[@href='https://m.habr.com/ru?mobile=yes']"))
                .click();
    }
    public void clickButtonAboutCompanyHabr() {
        driver.findElement(By.xpath("//a[@href='https://company.habr.com/']"))
                .click();
    }
}