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
    public void openPageHabr () {
        driver.get("https://habr.com/ru/");
    }
    public void topPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/']"))
                .click();
    }
    public void developmentPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/develop/']"))
                .click();
    }
    public void adminPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/admin/']"))
                .click();
    }
    public void designPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/design/']"))
                .click();
    }
    public void managementPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/management/']"))
                .click();
    }
    public void marketingPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/marketing/']"))
                .click();
    }
    public void popsciPage () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/flows/popsci/']"))
                .click();
    }
    public void buttonSearch () {
        driver.findElement(By.xpath("//button[@title='Поиск по сайту']"))
                .click();
    }
    public void searchInput (String search) {
        driver.findElement(By.xpath("//input[@placeholder='Поиск']"))
                .sendKeys(search, Keys.RETURN);
    }
    public void changeLanguage () {
        driver.findElement(By.xpath("//button[@type='button' and starts-with(@class, 'btn btn_medium')]"))
                .click();
    }
    public void setEngLanguage () {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='hl_langs_en']"))
                .click();
    }
    public void saveLanguageSettings () {
        driver.findElement(By.xpath("//button[@type='submit']"))
                .click();
    }
    public void changeTopicsEng () {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_en']"))
                .click();
    }
    public void changeTopicsRu () {
        driver.findElement(By.xpath("//div[@class='form-field form-field_lang-settings']//label[@for='fl_langs_ru']"))
                .click();
    }
    public void bestTopics () {
        WebElement element = driver.findElement(By.xpath("//a[@href='https://habr.com/ru/top/' and contains(text(), 'Лучшие')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }
    public void bestPerYear () {
        driver.findElement(By.xpath("//a[@title='Лучшие публикации за год']"))
                .click();
    }
    public void hubsAndComapny () {
        driver.findElement(By.xpath("//div[starts-with(@class, 'tabs__level')]//h3[contains(text(), 'Хабы и компании')]"))
                .click();
    }
    public void aboutHabr () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/about/']"))
                .click();
    }
    public void feedBack () {
        driver.findElement(By.xpath("//a[@href='https://habr.com/ru/feedback/']"))
                .click();
    }
    public void mobileVersion () {
        driver.findElement(By.xpath("//a[@href='https://m.habr.com/ru?mobile=yes']"))
                .click();
    }
    public void aboutCompanyHabr () {
        driver.findElement(By.xpath("//a[@href='https://company.habr.com/']"))
                .click();
    }
}