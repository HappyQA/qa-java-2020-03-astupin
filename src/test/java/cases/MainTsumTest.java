package cases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.Before;
import org.junit.Test;
import steps.MainPageStep;

@Epic("Тест сайта ЦУМ.РУ")
public class MainTsumTest extends OtusRunTest {
    
    private MainPageStep mainPageStep;

    @Before
    public void setUp () {
        mainPageStep = new MainPageStep(driver);
    }
    @Feature("Главная траница сайта")
    @Description("Ввод email адреса на подписку новостей на главной странице")
    @Test
    public void sendEmailForSubscribe () {
        mainPageStep
                .sendEmailInsideInputSubscription("test@mail.ru")
                .clickOnButtonSubscrie()
                .getMessageTextForSubscribe()
        ;
    }
}