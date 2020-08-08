package cases;

;
import com.sun.org.glassfish.gmbal.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.Test;

@Epic("Самый первый тест")
@Description("Домашнее задание №1")
public class BaseTest extends OtusRunTest {

    @Feature("Открытие сайта OTUS.RU")
    @Test
    public void openOtusPage () {
        driver.navigate().to(cfg.URL());
   }
}
