package cases;

import org.junit.Test;
import org.openqa.selenium.By;
import pages.HomePageHabr;

import java.util.concurrent.TimeUnit;

public class OtusHabrTest extends OtusRunTest {

    @Test
    public void availableHabr () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        driver.findElement(By.xpath("//title[contains(text(), 'Лучшие публикации за сутки / Хабр')]"));
        logger.info("Тест кейс 1 выполнен");
    }
    @Test
    public void checkTopPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.topPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Все потоки')]"));
        logger.info("Тест кейс 2 выполнен");
    }
    @Test
    public void checkDevelopmentPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.developmentPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Разработка')]"));
        logger.info("Тест кейс 3 выполнен");
    }
    @Test
    public void checkAdminPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.adminPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Администрирование')]"));
        logger.info("Тест кейс 4 выполнен");
    }
    @Test
    public void checkDesignPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.designPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Дизайн')]"));
        logger.info("Тест кейс 5 выполнен");
    }
    @Test
    public void checkManagementPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.managementPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Менеджмент')]"));
        logger.info("Тест кейс 6 выполнен");
    }
    @Test
    public void checkMarketingPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.marketingPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Маркетинг')]"));
        logger.info("Тест кейс 7 выполнен");
    }
    @Test
    public void checkPopsciPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.popsciPage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[contains(text(), 'Научпоп')]"));
        logger.info("Тест кейс 8 выполнен");
    }
    @Test
    public void changeLanguage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.changeLanguage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.setEngLanguage();
        homePage.saveLanguageSettings();
        driver.findElement(By.xpath("//a[contains(text(), 'All streams')]"));
        logger.info("Тест кейс 9 выполнен");
    }
    @Test
    public void changeTopicsLanguage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.changeLanguage();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.changeTopicsRu();
        homePage.changeTopicsEng();
        homePage.saveLanguageSettings();
        homePage.bestTopics();
        homePage.bestPerYear();
        driver.findElement(By.xpath("//a[@class='post__title_link' and starts-with(text(), 'Nginx')]"));
        logger.info("Тест кейс 10 выполнен");
    }
    @Test
    public void searchCompany () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.buttonSearch();
        homePage.searchInput("OTUS");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.hubsAndComapny();
        driver.findElement(By.xpath("//div[starts-with(@class, 'table-grid__item')]//em[contains(text(), 'OTUS')]"));
        logger.info("Тест кейс 11 выполнен");
    }
    @Test
    public void openAboutUs () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.aboutHabr();
        driver.findElement(By.xpath("//title[contains(text(), 'Хабр')]"));
        logger.info("Тест кейс 12 выполнен");
    }
    @Test
    public void openFeedbackPage () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.feedBack();
        driver.findElement(By.xpath("//title[contains(text(), 'Обратная связь')]"));
        logger.info("Тест кейс 13 выполнен");
    }
    @Test
    public void openMobileVersion () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.mobileVersion();
        driver.findElement(By.xpath("//title[contains(text(), 'Все публикации подряд')]"));
        logger.info("Тест кейс 14 выполнен");
    }
    @Test
    public void openAboutHabr () {
        HomePageHabr homePage = new HomePageHabr(driver);
        homePage.openPageHabr();
        homePage.aboutCompanyHabr();
        driver.findElement(By.xpath("//title[contains(text(), 'Хабр — о компании')]"));
        logger.info("Тест кейс 15 выполнен");
    }
}