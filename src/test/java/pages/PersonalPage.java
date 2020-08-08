package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPage extends AbstractPage {

    public PersonalPage (WebDriver driver) {
        super(driver);
    }
    @Step("Нажатие на кнопку 'О себе'")
    public void openAboutMe () {
        driver.findElement(By.xpath("//a[@title='О себе']"))
                .click();
    }
    @Step("Ввод значений в инпут 'Имя'")
    public void enterName (String name) {
        driver.findElement(By.xpath("//input[@name='fname']"))
                .sendKeys(name);
    }
    //assert
    @Step("Проверка значений в инпуте 'Имя'")
    public String getNameValue () {
        return driver.findElement(By.xpath("//input[@name='fname']"))
                .getAttribute("value");
    }
    @Step("Ввод значений в инпут 'Name'")
    public void enterNameLatin (String nameLatin) {
        driver.findElement(By.xpath("//input[@name='fname_latin']"))
                .sendKeys(nameLatin);
    }
    //assert
    @Step("Проверка значений в инпуте 'Name'")
    public String getNameLatinValue () {
        return driver.findElement(By.xpath("//input[@name='fname_latin']"))
                .getAttribute("value");
    }
    @Step("Ввод значений в инпут 'Фамилия'")
    public void enterLastName (String Lastname) {
        driver.findElement(By.xpath("//input[@name='lname']"))
                .sendKeys(Lastname);
    }
    //assert
    @Step("Проверка значений в инпуте 'Фамилия'")
    public String getLastNameValue () {
        return driver.findElement(By.xpath("//input[@name='lname']"))
                .getAttribute("value");
    }
    @Step("Ввод значений в инпут 'Last Name'")
    public void enterLastNameLatin (String LastnameLatin) {
        driver.findElement(By.xpath("//input[@name='lname_latin']"))
                .sendKeys(LastnameLatin);
    }
    //assert
    @Step("Проверка значений в инпуте 'Last Name'")
    public String getLastNameLatinValue () {
        return driver.findElement(By.xpath("//input[@name='lname_latin']"))
                .getAttribute("value");
    }
    @Step("Ввод значений в инпут 'Имя блога'")
    public void enterNameinBlog (String blogName) {
        driver.findElement(By.xpath("//input[@name='blog_name']"))
                .sendKeys(blogName);
    }
    //assert
    @Step("Проверка значений в инпуте 'Имя блога'")
    public String getNameinBlogValue () {
        return driver.findElement(By.xpath("//input[@name='blog_name']"))
                .getAttribute("value");
    }
    @Step("Ввод значений в инпут 'Дата рождения'")
    public void enterDateBirth (String dateBirth) {
        driver.findElement(By.xpath("//input[@name='date_of_birth']"))
                .sendKeys(dateBirth);
    }
    //assert
    @Step("Проверка значений в инпуте 'Дата рождения'")
    public String getDateBirthValue () {
        return driver.findElement(By.xpath("//input[@name='date_of_birth']"))
                .getAttribute("value");
    }
    @Step("Установка дополнительной связи через Telegram")
    public void setWayConnectionTelegram (String telegram) {
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full')]//span/.."))
                .click();
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full')]//span/../../../div//div//button[contains(text(), 'Тelegram')]"))
                .click();
        driver.findElement(By.xpath("//input[@id='id_contact-0-value']"))
                .sendKeys(telegram);
    }
    //assert
    @Step("Проверка установленой связи через Telegram")
    public String getWayConnectionTelegram () {
        return driver.findElement(By.xpath("//input[@name='contact-0-value']"))
                .getAttribute("value");
    }
    @Step("Установка дополнительной связи через VK")
    public void setWayConnectionVK (String vk) {
        driver.findElement(By.xpath("//button[contains(text(), 'Добавить')]"))
                .click();
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full lk-cv-block')]//span/.."))
                .click();
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full lk-cv-block')]//span/../../../div//div//button[contains(text(), 'VK')]"))
                .click();
        driver.findElement(By.xpath("//input[@id='id_contact-1-value']"))
                .sendKeys(vk);
    }
    //assert
    @Step("Проверка установленой связи через VK")
    public String getWayConnectionVK () {
        return driver.findElement(By.xpath("//input[@name='contact-1-value']"))
                .getAttribute("value");
    }
    @Step("Нажатие на кнопку 'Сохранить и продолжить'")
    public void enterSaveButton() {
        driver.findElement(By.xpath("//button[@title='Сохранить и продолжить']"))
                .click();
    }
}