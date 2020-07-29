package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalPage extends AbstractPage {

    public PersonalPage (WebDriver driver) {
        super(driver);
    }
    public void openAboutMe () {
        driver.findElement(By.xpath("//a[@title='О себе']"))
                .click();
    }
    public void enterName (String name) {
        driver.findElement(By.xpath("//input[@name='fname']"))
                .sendKeys(name);
    }
    //assert
    public String getNameValue () {
        return driver.findElement(By.xpath("//input[@name='fname']"))
                .getAttribute("value");
    }
    public void enterNameLatin (String nameLatin) {
        driver.findElement(By.xpath("//input[@name='fname_latin']"))
                .sendKeys(nameLatin);
    }
    //assert
    public String getNameLatinValue () {
        return driver.findElement(By.xpath("//input[@name='fname_latin']"))
                .getAttribute("value");
    }
    public void enterLastName (String Lastname) {
        driver.findElement(By.xpath("//input[@name='lname']"))
                .sendKeys(Lastname);
    }
    //assert
    public String getLastNameValue () {
        return driver.findElement(By.xpath("//input[@name='lname']"))
                .getAttribute("value");
    }
    public void enterLastNameLatin (String LastnameLatin) {
        driver.findElement(By.xpath("//input[@name='lname_latin']"))
                .sendKeys(LastnameLatin);
    }
    //assert
    public String getLastNameLatinValue () {
        return driver.findElement(By.xpath("//input[@name='lname_latin']"))
                .getAttribute("value");
    }
    public void enterNameinBlog (String blogName) {
        driver.findElement(By.xpath("//input[@name='blog_name']"))
                .sendKeys(blogName);
    }
    //assert
    public String getNameinBlogValue () {
        return driver.findElement(By.xpath("//input[@name='blog_name']"))
                .getAttribute("value");
    }
    public void enterDateBirth (String dateBirth) {
        driver.findElement(By.xpath("//input[@name='date_of_birth']"))
                .sendKeys(dateBirth);
    }
    //assert
    public String getDateBirthValue () {
        return driver.findElement(By.xpath("//input[@name='date_of_birth']"))
                .getAttribute("value");
    }
    public void setWayConnectionTelegram (String telegram) {
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full')]//span/.."))
                .click();
        driver.findElement(By.xpath("//div[starts-with(@class, 'input input_full')]//span/../../../div//div//button[contains(text(), 'Тelegram')]"))
                .click();
        driver.findElement(By.xpath("//input[@id='id_contact-0-value']"))
                .sendKeys(telegram);
    }
    public String getWayConnectionTelegram () {
        return driver.findElement(By.xpath("//input[@name='contact-0-value']"))
                .getAttribute("value");
    }
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
    public String getWayConnectionVK () {
        return driver.findElement(By.xpath("//input[@name='contact-1-value']"))
                .getAttribute("value");
    }
    public void enterSaveButton() {
        driver.findElement(By.xpath("//button[@title='Сохранить и продолжить']"))
                .click();
    }
}