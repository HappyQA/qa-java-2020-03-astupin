package cases;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import config.ConfigFile;
import utils.BrowserFactory;

public class OtusRunTest {

    WebDriver driver;
    Logger logger = LogManager.getLogger(OtusRunTest.class);
    ConfigFile cfg = ConfigFactory.create(ConfigFile.class);

    @Before
    public void setUp () {
        String BrowserType = System.getProperty("browser");
        driver = BrowserFactory.getDriver(BrowserType);
        logger.info("Драйвер up");
    }
    @After
    public void tearsDown () {
        if (driver != null) {
            driver.close();
            logger.info("Драйвер off");
        }
    }
}
