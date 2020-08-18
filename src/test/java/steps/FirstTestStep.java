//package steps;
//
//import io.cucumber.java.PendingException;
//import io.cucumber.java.ru.Дано;
//import io.cucumber.java.ru.Когда;
//import io.cucumber.java.ru.Тогда;
//import io.qameta.allure.Description;
//import org.junit.Assert;
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
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
//    public void главнаяСтраница() {
//        mainPage.openSite();
//    }
//    @Когда("^пользователь вводит email и нажимает на кнопку подписатся")
//    public void пользовательВводитEmailИНажимаетНаКнопкуПодписатся() {
//        mainPage.getInputEmailSubscription("test@mail.ru");
//        mainPage.clickOnButtonSubscription();
//    }
//    @Тогда("^приходит уведомление об успешной подписке")
//    public void приходитУведомлениеОбУспешнойПодписке() {
//        mainPage.сheckSubscriptionTitle();
//    }
//}
