package pages;

import io.qameta.allure.Description;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TsumMainPage extends AbstractPage {

    //Email подписка в футере
    @FindBy(xpath = "//footer-subscribe")
    private WebElement emailSubscribe;

    public TsumMainPage( WebDriver driver ) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //Получение инпута для ввода Email для подсписки
    public WebElement getInputEmailSubscription () {
        return emailSubscribe.
                findElement(By.xpath("//input[@name='email']"));
    }
    //Получение кнопки "Отправить"
    public WebElement getButtonSubscription ()  {
        return emailSubscribe
                .findElement(By.xpath("//button[@type='submit']"));
    }
    //Сверяем результат подписки
    public WebElement getCheckSubscriptionTitle () {
        return emailSubscribe
                .findElement(By.xpath("//p[@class='message__text' and contains[text(), 'Вы успешно подписаны!']"));
    }
}



