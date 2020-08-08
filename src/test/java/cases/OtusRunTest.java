package cases;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import config.ConfigFile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OtusRunTest {

    WebDriver driver;
    Logger logger = LogManager.getLogger(OtusRunTest.class);
    ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    @Before
    public void setUp () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("83.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        String PortNumber = System.getProperty("remote");
        driver = new RemoteWebDriver(
                new URL(PortNumber),
                capabilities
        );
        logger.info("Remote Дайвер up");
        //Локальный запуск тестов
//        String BrowserType = System.getProperty("browser");
//        driver = BrowserFactory.getDriver(BrowserType);
//        logger.info("Драйвер up");

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
