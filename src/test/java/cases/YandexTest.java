//package cases;
//
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import java.util.concurrent.TimeUnit;
//
//@Epic("Тестирование Яндекса")
//public class YandexTest extends OtusRunTest {
//
//    @Feature("Сравнение двух позиций в списке желаемого")
//    //@Test
//    @Description("Домашнее задание №3")
//    public void openYandexTest () {
//
//        driver.navigate().to(cfg.URLL());
//        logger.info("Сайт YA открыт");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[starts-with(@href,'/catalog--elektronika/')]"))
//                .click();
//        logger.info("Открыт раздел Электроника");
//
//        driver.findElement(By.xpath("//a[starts-with(@href, '/catalog--mobilnye-telefony/')]"))
//                .click();
//        logger.info("Открыт раздел Мобильные телефоны");
//
//        driver.findElement(By.xpath("//button[@class='_1YeOF5Jcfi _2Wg9rE1HzR']"))
//                .click();
//        logger.info("Раскрыть список 'Показать все'");
//
//        driver.findElement(By.xpath("//input[@name='Поле поиска']"))
//                .sendKeys("Xiaomi");
//        logger.info("Ввод первого производителя");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element = driver.findElement(By.xpath("//input[@name='Производитель Xiaomi']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//        logger.info("Выбран производитель Xiaomi");
//
//        driver.findElement(By.xpath("//input[@name='Поле поиска']")).clear();
//        logger.info("Очищение инпута");
//
//        driver.findElement(By.xpath("//input[@name='Поле поиска']"))
//                .sendKeys("realme");
//        logger.info("Ввод второго производителя");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement element2 = driver.findElement(By.xpath("//input[@name='Производитель realme']"));
//        actions = new Actions(driver);
//        actions.moveToElement(element2).click().perform();
//        logger.info("Выбран производитель realme");
//
//        driver.findElement(By.xpath("//button[@data-autotest-id='dprice']")).click();
//        logger.info("Выполнение сортировки по цене");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//img[starts-with(@alt, 'Смартфон realme')]/../../div[2]//div"))
//                .click();
//        logger.info("Первый смартфон realme найден и добавлен в избранное");
//
//        By locator = By.xpath("//div[@class='_1_ABPFjOJQ']");
//        WebElement element3 = driver.findElement(locator);
//        ExpectedConditions.visibilityOf(element3);
//        logger.info("Первый смартфон realme добавлен к сравнению");
//
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//img[starts-with(@alt, 'Смартфон Xiaomi')]/../../div[2]//div"))
//                .click();
//        logger.info("Первый смартфон Xiaomi найден и добавлен в избранное");
//
//        By locator1 = By.xpath("//div[@class='_1_ABPFjOJQ']");
//        WebElement element4 = driver.findElement(locator1);
//        ExpectedConditions.visibilityOf(element4);
//        logger.info("Товар Xiaomi добавлен к сравнению");
//
//        driver.findElement(By.xpath("//a[@href='/compare?track=head']")).click();
//        logger.info("Открыта вкладка со сравнением");
//
//        WebElement element5 = driver.findElement(By.xpath("//img[starts-with(@alt, 'Смартфон Xiaomi')]"))
//                .findElement(By.xpath("//img[starts-with(@alt, 'Смартфон realme')]"));
//        ExpectedConditions.visibilityOf(element5);
//        logger.info("Количество позицицй равно 2");
//
//        driver.findElement(By.xpath("//button[@class='MOYcCv2eIJ _1_bHOFDacR']"))
//                .click();
//        logger.info("Кнопка Все характеристики CLICK");
//
//        WebElement element6 = driver.findElement(By.xpath("//div[@class='_1NmQsVfbWn']"));
//        ExpectedConditions.visibilityOf(element6);
//        logger.info("Поле с ОС найденно");
//
//        driver.findElement(By.xpath("//button[@class='MOYcCv2eIJ _1_bHOFDacR']"))
//                .click();
//        logger.info("Кнопка Различающиеся характеристики CLICK");
//
//        WebElement element7 = driver.findElement(By.xpath("//div[@class='_1NmQsVfbWn']"));
//        ExpectedConditions.invisibilityOf(element7);
//        logger.info("Поле с ОС НЕ найденно");
//    }
//}