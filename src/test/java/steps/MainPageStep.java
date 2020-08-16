package steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;
import pages.ElementUse;
import pages.TsumMainPage;

public class MainPageStep {

    private WebDriver driver;
    private TsumMainPage page;

    public MainPageStep (WebDriver driver) {
        this.driver = driver;
        this.page = new TsumMainPage(driver);
    }
    //@Дано("^на счете пользователя имеется (\\d+) рублей$")
    @Description("Получение инпута ввода Email с вводоном данных для подписки")
    public MainPageStep sendEmailInsideInputSubscription (String textEmail) {
        ElementUse.sendDataInElement(driver, page.getInputEmailSubscription(), (textEmail));
        return this;
    }
    //@Когда("^пользователь снимает со счета (\\d+) рублей$")
    @Description("Получение кнопки отправить / нажатие на кнопку")
    public MainPageStep clickOnButtonSubscrie () {
        ElementUse.useElement(driver, page.getButtonSubscription());
        return this;
    }
    @Description("Проверяем результат отправки")
    public MainPageStep getMessageTextForSubscribe () {
        Assert.assertEquals(driver, page.getCheckSubscriptionTitle());
        return this;
    }
//    //@Тогда("^появляется предупреждение \"([^\"]*)\"$")
//    public void появляетсяПредупреждение(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
}
