package cases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AutorizationPage;
import pages.HomePage;
import pages.PersonalPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OtusPOTest extends OtusRunTest {

    @Test
    public void poTest () {
        HomePage homePage = new HomePage(driver);
            homePage.openPage();
            homePage.buttonLogin();
        logger.info("Переход на страницу авторизации");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        AutorizationPage authPage = new AutorizationPage(driver);
            authPage.emailInput("test@mail.ru");
            authPage.passwordInput("test");
            authPage.buttonEnter();
        logger.info("Логин в УЗ");
            homePage.openMyProfile();
            homePage.openLK();
        logger.info("Переход в ЛК");
        PersonalPage personalPage = new PersonalPage(driver);
            personalPage.openAboutMe();
            personalPage.enterName("Имя");
            personalPage.enterNameLatin("Name");
            personalPage.enterLastName("Фамилия");
            personalPage.enterLastNameLatin("Family name");
            personalPage.enterNameinBlog("Example blog name");
            personalPage.enterDateBirth("01.11.1993");
            personalPage.setWayConnectionTelegram("telegram");
            personalPage.setWayConnectionVK("vk");
            personalPage.enterSaveButton();
        logger.info("Заполнили все персональные данные / Сохранили");
            driver.manage().deleteAllCookies();
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        logger.info("Очистка кук, открытие нового окна браузера");
            homePage.openPage();
            homePage.buttonLogin();
            authPage.emailInput("test@mail.ru");
            authPage.passwordInput("test");
            authPage.buttonEnter();
            homePage.openMyProfile();
            homePage.openLK();
            personalPage.openAboutMe();
        logger.info("Переход в ЛК раздел О себе");

        String value = personalPage.getNameValue();
        assertThat(value, is("testИмя"));
        logger.info("Имя == Имя");

        String value1 = personalPage.getNameLatinValue();
        assertThat(value1, is("Name"));
        logger.info("Name == Name");

        String value2 = personalPage.getLastNameValue();
        assertThat(value2, is("testФамилия"));
        logger.info("Фамилия == Фамилия");

        String value3 = personalPage.getLastNameLatinValue();
        assertThat(value3, is("Family name"));
        logger.info("Family == Family");

        String value4 = personalPage.getNameinBlogValue();
        assertThat(value4, is("Example blog name"));
        logger.info("Example blog name == Example blog name");

        String value5 = personalPage.getDateBirthValue();
        assertThat(value5, is("01.11.1993"));
        logger.info("01.11.1993 == 01.11.1993");

        String value6 = personalPage.getWayConnectionTelegram();
        assertThat(value6, is("telegram"));
        logger.info("telegram == telegram");

        String value7 = personalPage.getWayConnectionVK();
        assertThat(value7, is("vk"));
        logger.info("vk == vk");
    }
}