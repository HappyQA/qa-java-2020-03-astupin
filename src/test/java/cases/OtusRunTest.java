package cases;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import config.ConfigFile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import utils.BrowserFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@Epic("Инициализация base test")

public class OtusRunTest  {

    @Autowired
    protected BrowserFactory browserFactory;
    public WebDriver driver;
    Logger logger = LogManager.getLogger(OtusRunTest.class);
    ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    @Description("Домашнее задание №2")
    @Before
    public void setUp () throws MalformedURLException {
        /**
         * Запуск тестов в Selenoid
         */
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setBrowserName("chrome");
//        capabilities.setVersion("83.0");
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", false);
//
//        String PortNumber = System.getProperty("remote");
//        driver = new RemoteWebDriver(
//                new URL(PortNumber),
//                capabilities
//        );
//        logger.info("Remote Дайвер up");
        /**
         * Локальный запуск тестов
         */
        String browserType = System.getProperty("browser");
        ApplicationContext javaConfigContext =
                new AnnotationConfigApplicationContext(BrowserFactory.class);
        browserFactory = javaConfigContext.getBean(BrowserFactory.class);
        if (browserType == null) driver = browserFactory.getDriver("chrome");
        else driver = browserFactory.getDriver(browserType);

//        driver = BrowserFactory.getDriver(BrowserType);
        logger.info("Local Драйвер up");
        driver.get("https://www.tsum.ru/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearsDown () {
        if (driver != null) {
            driver.close();
            logger.info("Драйвер off");
        }
    }
}
