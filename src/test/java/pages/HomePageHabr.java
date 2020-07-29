package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePageHabr extends AbstractPage {

    public HomePageHabr(WebDriver driver) {
        super(driver);
    }
    public void openPageHabr () {
        driver.get("https://habr.com/ru/");
    }
    public void buttonLogin () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/auth/login/']"))
                .click();
    }
    public void feedPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/feed/']"))
                .click();
    }
    public void feedSettingsButton () {
        driver.findElement(By.xpath("//a[gref='https://habr.com/ru/feed/settings/']"))
                .click();
    }
    public void buttonSubscribe () {
        driver.findElement(By.xpath("//button[type='button']"))
                .click();
    }
    public void developmentPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/develop/']"))
                .click();
    }
    public void adminPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/admin/']"))
                .click();
    }
    public void designPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/design/']"))
                .click();
    }
    public void managementPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/management/']"))
                .click();
    }
    public void marketingPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/marketing/']"))
                .click();
    }
    public void popsciPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/flows/popsci/']"))
                .click();
    }
    public void allThreadPage () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/top/']"))
                .click();
    }
    public void profileDropdownButton () {
        driver.findElement(By.xpath("//button[role='button']"))
                .click();
    }
    public void profileButton () {
        driver.findElement(By.xpath("//a[href='https://habr.com/ru/users/happyqa/']"))
                .click();
    }
    public void buttonSearch () {
        driver.findElement(By.xpath("//button[title='Поиск по сайту']"))
                .click();
    }
    public void searchInput (String search) {
        driver.findElement(By.xpath("//input[placeholder='Поиск']"))
                .sendKeys(search, Keys.RETURN);
    }
    public  void subscribeButtonCompany () {
        driver.findElement(By.xpath("//span[titile='Подписаться на компанию']"))
                .click();
    }
    public void changeLanguage () {
        driver.findElement(By.xpath("//a[href='#']"))
                .click();
    }
    public void setEngLanguage () {
        driver.findElement(By.xpath("//input[id='hl_langs_en']"))
                .click();
    }
    public void saveLanguageSettings () {
        driver.findElement(By.xpath("//button[type='submit']"))
                .click();
    }
}