package cases;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.Before;
import org.junit.Test;
import pages.TsumMainPage;


@Epic("Тест сайта ЦУМ.РУ")
public class MainTsumTest extends OtusRunTest {

    TsumMainPage mainPage;

    @Before
    public void setUpMethod () {
        mainPage = new TsumMainPage(driver);
    }
    @Feature("Главная траница сайта ЦУМа")
    @Test
    @DisplayName("Ввод email адреса на подписку новостей на главной странице")
    public void sendEmailForSubscribe () {
        mainPage.openSite();
        mainPage.getInputEmailSubscription("test@mail.ru");
        mainPage.clickOnButtonSubscription();
        mainPage.сheckSubscriptionTitle();
        logger.info("Тест 1 выполнен");
    }
    @Feature("Главная траница сайта ЦУМа")
    @Test
    @DisplayName("Открытие ссылки Контакты")
    public void openContactsPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnContacts();
        mainPage.checkPageName("Контакты");
        logger.info("Тест 2 выполнен");
    }
    @Feature("Главная траница сайта ЦУМа")
    @Test
    @DisplayName("Открытие ссылки Наша история")
    public void openOurHistoryPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnOurHistory();
        mainPage.checkPageName("Наша история");
        logger.info("Тест 3 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Карьера")
    public void openCareerPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnCareer();
        mainPage.checkPageName("Карьера");
        logger.info("Тест 4 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Бренды A-Z")
    public void openBrandsPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnBrands();
        mainPage.checkPageName("Бренды A-Z");
        logger.info("Тест 5 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Оплата")
    public void openPaymentPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnPayments();
        mainPage.checkPageName("Оплата");
        logger.info("Тест 6 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Доставка")
    public void openDeliveryPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnDelivery();
        mainPage.checkPageName("Доставка");
        logger.info("Тест 7 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Обмен и возврат")
    public void openReturnsPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnReturns();
        mainPage.checkPageName("Обмен и возврат");
        logger.info("Тест 8 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Условия продажи")
    public void openTermsPage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnTerms();
        mainPage.checkPageName("Условия продажи");
        logger.info("Тест 9 выполнен");
    }
    @Test
    @DisplayName("Открытие ссылки Шопинг-сервисы")
    public void openAboutServicePage () {
        mainPage.openSite();
        mainPage.clickOnBottomSlider();
        mainPage.clickOnAboutService();
        mainPage.checkPageName("Шопинг-сервисы");
        logger.info("Тест 10 выполнен");
    }
}