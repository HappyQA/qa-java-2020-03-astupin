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
    @Feature("Главная траница сайта")
    @Test
    @DisplayName("Ввод email адреса на подписку новостей на главной странице")
    public void sendEmailForSubscribe () {
        mainPage.openSite();
        mainPage.getInputEmailSubscription("test@mail.ru");
        mainPage.clickOnButtonSubscription();
        mainPage.сheckSubscriptionTitle();
    }
}