//package cases;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import pages.AutorizationPageHabr;
//import pages.HomePageHabr;
//import pages.PersonalPageHabr;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//
//public class OtusHabrTest extends OtusRunTest {
//
//    @Test
//    public void availableHabr () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.openPageHabr();
//        String getTitle = driver.findElement(By.xpath("//title[text='Лучшие публикации за сутки / Хабр']"))
//                .getAttribute("title");
//        assertThat(getTitle, is("Лучшие публикации за сутки / Хабр"));
//        logger.info("Тест кейс 1 выполнен");
//    }
//    @Test
//    public void loginHabr () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        AutorizationPageHabr oauth = new AutorizationPageHabr(driver);
//        homePage.buttonLogin();
//        oauth.inputEmail("random@mail.ru");
//        oauth.inputPassword("123123");
//        oauth.buttonEnter();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        String getTitle = driver.findElement(By.xpath("//title[text='Лучшие публикации за сутки / Хабр']"))
//                .getAttribute("title");
//        assertThat(getTitle, is("Лучшие публикации за сутки / Хабр"));
//        logger.info("Тест кейс 2 выполнен");
//    }
//    @Test
//    public void subsrcibeTest () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.feedPage();
//        homePage.feedSettingsButton();
//        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//div[href='https://habr.com/ru/hub/web_testing/']"))
//                .click();
//        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
//        homePage.buttonSubscribe();
//        String getAttribure = driver.findElement(By.xpath("//button[type='button']"))
//                .getAttribute("text");
//        assertThat(getAttribure, is("Подписан"));
//        logger.info("Тест кейс 3 выполнен");
//    }
//    @Test
//    public void checkFeedPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.feedPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Моя лента')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Моя лента"));
//        logger.info("Тест кейс 4 выполнен");
//    }
//    @Test
//    public void checkAllThreadPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.allThreadPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Все потоки')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Все потоки"));
//        logger.info("Тест кейс 5 выполнен");
//    }
//    @Test
//    public void checkDevelopmentPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.developmentPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Разработка')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Разработка"));
//        logger.info("Тест кейс 6 выполнен");
//    }
//    @Test
//    public void checkAdminPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.adminPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Администрирование')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Администрирование"));
//        logger.info("Тест кейс 7 выполнен");
//    }
//    @Test
//    public void checkDesignPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.designPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Дизайн')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Дизайн"));
//        logger.info("Тест кейс 8 выполнен");
//    }
//    @Test
//    public void checkManagementPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.managementPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Менеджмент')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Менеджмент"));
//        logger.info("Тест кейс 9 выполнен");
//    }
//    @Test
//    public void checkMarketingPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.marketingPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Маркетинг')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Маркетинг"));
//        logger.info("Тест кейс 10 выполнен");
//    }
//    @Test
//    public void checkPopsciPage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.popsciPage();
//        String getValue = driver.findElement(By.xpath("//div[contains(text(), 'Научпоп')]"))
//                .getAttribute("text");
//        assertThat(getValue, is("Научпоп"));
//        logger.info("Тест кейс 11 выполнен");
//    }
//    @Test
//    public void updateProfile () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        PersonalPageHabr personalPage = new PersonalPageHabr(driver);
//        homePage.profileDropdownButton();
//        homePage.profileButton();
//        personalPage.buttonSettings();
//        personalPage.inputName("TEST NAME");
//        personalPage.personalSaveSettings();
//        driver.findElement(By.xpath("//div[class='message message_successfull']"));
//        logger.info("Тест кейс 12 выполнен");
//    }
//    @Test
//    public void updateProfileUpload () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        PersonalPageHabr personalPage = new PersonalPageHabr(driver);
//        homePage.profileDropdownButton();
//        homePage.profileButton();
//        personalPage.buttonSettings();
//        personalPage.personalUploadButton();
//        driver.findElement(By.xpath("//div[class='message message_successfull']"));
//        logger.info("Тест кейс 13 выполнен");
//    }
//    @Test
//    public void searchCompany () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.buttonSearch();
//        homePage.searchInput("OTUS");
//        driver.findElement(By.xpath("//a[href='https://habr.com/ru/search/?target_type=hubs&order_by=relevance&q=OTUS']"))
//                .click();
//        driver.findElement(By.xpath("//a[href='https://habr.com/ru/company/otus/']"))
//                .click();
//        homePage.subscribeButtonCompany();
//        String getSubscribe = driver.findElement(By.xpath("//span[title='Подписаться на компанию']"))
//                .getAttribute("text");
//        assertThat(getSubscribe, is("Подписан"));
//        logger.info("Тест кейс 14 выполнен");
//    }
//    @Test
//    public void changeLanguage () {
//        HomePageHabr homePage = new HomePageHabr(driver);
//        homePage.changeLanguage();
//        homePage.setEngLanguage();
//        homePage.saveLanguageSettings();
//        String engValue = driver.findElement(By.xpath("//a[href='https://habr.com/ru/feed/']"))
//                .getAttribute("text");
//        assertThat(engValue, is("My feed"));
//        logger.info("Тест кейс 15 выполнен");
//    }
//}