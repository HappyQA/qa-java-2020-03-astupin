//package steps;
//
//import io.cucumber.java.PendingException;
//import io.cucumber.java.ru.Дано;
//import io.cucumber.java.ru.Когда;
//import io.cucumber.java.ru.Тогда;
//import io.qameta.allure.Description;
//import org.junit.Assert;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import pages.AbstractPage;
//import pages.ElementUse;
//import pages.TsumMainPage;
//
//public class FirstTestStep extends cases.OtusRunTest {
//
//    TsumMainPage mainPage;
//
//    @Before
//    public void setUpMethod () {
//        mainPage = new TsumMainPage(driver);
//    }
//    @Дано("^главная страница")
//    public void главнаяCтраница() throws Throwable {
//        mainPage.openSite();
//        throw new PendingException();
//    }
//    @Когда("^пользователь вводит email и нажимает на кнопку подписатся")
//    public void пользовательВводитEmailИНажимаетНаКнопкуПодписатся() throws Throwable {
//        mainPage.getInputEmailSubscription("test@mail.ru");
//        mainPage.clickOnButtonSubscription();
//        throw new PendingException();
//    }
//    @Тогда("^приходит уведомление об успешной подписке")
//    public void приходитУведомлениеОбУспешнойПодписке() throws Throwable {
//        mainPage.сheckSubscriptionTitle();
//        throw new PendingException();
//    }
//}
