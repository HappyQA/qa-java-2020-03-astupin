package cases;

import com.sun.org.glassfish.gmbal.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import pages.HomePageHabr;

@Epic("Тестирование HABR.RU")
@Description("Домашнее задание №6")
public class OtusHabrTest extends OtusRunTest {

    HomePageHabr homePage;

    @Before
    public void setUpMethod () {
        homePage = new HomePageHabr(driver);
    }

    @Feature("Главная страница")
    @Test
    @DisplayName("Отрытие сайта habr.com с проверкой тайтла")
    public void availableHabr () {
        homePage.openHabr();
        homePage.checkTitleName("Лучшие публикации за сутки / Хабр");
        logger.info("Тест кейс 1 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Все потоки' с проверкой отображения наименования треда")
    public void checkTopPage () {
        homePage.openHabr();
        homePage.clickOnTopPageButton();
        homePage.checkThreadName("Все потоки");
        logger.info("Тест кейс 2 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Разработка' с проверкой отображения наименования треда")
    public void checkDevelopmentPage () {
        homePage.openHabr();
        homePage.clickOnDevelopmentPageButton();
        homePage.checkThreadName("Разработка");
        logger.info("Тест кейс 3 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Администрирование' с проверкой отображения наименования треда")
    public void checkAdminPage () {
        homePage.openHabr();
        homePage.clickOnAdminPageButton();
        homePage.checkThreadName("Администрирование");
        logger.info("Тест кейс 4 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Дизайн' с проверкой отображения наименования треда")
    public void checkDesignPage () {
        homePage.openHabr();
        homePage.clickOnDesignPageButton();
        homePage.checkThreadName("Дизайн");
        logger.info("Тест кейс 5 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Менеджмент' с проверкой отображения наименования треда")
    public void checkManagementPage () {
        homePage.openHabr();
        homePage.clickOnManagementPageButton();
        homePage.checkThreadName("Менеджмент");
        logger.info("Тест кейс 6 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Маркетинг' с проверкой отображения наименования треда")
    public void checkMarketingPage () {
        homePage.openHabr();
        homePage.clickOnMarketingPageButton();
        homePage.checkThreadName("Маркетинг");
        logger.info("Тест кейс 7 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Научпоп' с проверкой отображения наименования треда")
    public void checkPopsciPage () {
        homePage.openHabr();
        homePage.clickOnPopSciPageButton();
        homePage.checkThreadName("Научпоп");
        logger.info("Тест кейс 8 выполнен");
    }
    @Feature("Изменения языка")
    @Test
    @DisplayName("Изменение языка на Английский с проверкой отображения наименования треда")
    public void changeLanguage () {
        homePage.openHabr();
        homePage.clickOnLanguageButton();
        homePage.clickOnButtonEngLanguage();
        homePage.clickOnSaveLanguageButton();
        homePage.checkThreadName("All streams");
        logger.info("Тест кейс 9 выполнен");
    }
    @Feature("Изменения языка")
    @Test
    @DisplayName("Изменение языка отображения постов на Английский с проверкой топ-1 топика")
    public void changeTopicsLanguage () {
        homePage.openHabr();
        homePage.clickOnLanguageButton();
        homePage.clickOnButtonChangeTopicsLanguageRu();
        homePage.clickOnButtonChangeTopicsLanguageEng();
        homePage.clickOnSaveLanguageButton();
        homePage.clickOnButtonBestTopics();
        homePage.clickOnButtonBestPerYearTopics();
        homePage.checkTopicsAvailableText("Nginx");
        logger.info("Тест кейс 10 выполнен");
    }
    @Feature("Поиск")
    @Test
    @DisplayName("Поиск компании с проверкой результата поиска")
    public void searchCompany () {
        homePage.openHabr();
        homePage.clickOnSearchButton();
        homePage.sendDataToSearchInput("OTUS");
        homePage.clickOnButtonHubsAndComapny();
        homePage.checkResultSearch("OTUS");
        logger.info("Тест кейс 11 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'О нас' с проверкой наименования тайтла ")
    public void openAboutUs () {
        homePage.openHabr();
        homePage.clickButtonAboutHabr();
        homePage.checkTitleName("Хабр");
        logger.info("Тест кейс 12 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Обратная связь' с проверкой наименования тайтла")
    public void openFeedbackPage () {
        homePage.openHabr();
        homePage.clickButtonFeedBack();
        homePage.checkTitleName("Обратная связь");
        logger.info("Тест кейс 13 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Мобильня версия' с проверкой наименования тайтла")
    public void openMobileVersion () {
        homePage.openHabr();
        homePage.clickButtonMobileVersion();
        homePage.checkTitleName("Все публикации подряд");
        logger.info("Тест кейс 14 выполнен");
    }
    @Feature("Главная страница")
    @Test
    @DisplayName("Нажатие на кнопку 'Главной страницы habr' с проверкой наименования тайтла")
    public void openAboutHabr () {
        homePage.openHabr();
        homePage.clickButtonAboutCompanyHabr();
        homePage.checkTitleName("Хабр — о компании");
        logger.info("Тест кейс 15 выполнен");
    }
}