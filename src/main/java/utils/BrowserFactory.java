package utils;

import enums.BrowserName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.stereotype.Component;

import static enums.BrowserName.CHROME;
import static enums.BrowserName.FIREFOX;

@Component
public class BrowserFactory {

    public static WebDriver getDriver(String browserName) {
        return getDriver(browserName, new MutableCapabilities());
    }

    public static WebDriver getDriver(String browserName, MutableCapabilities options) {
        browserName = browserName.toUpperCase();
        switch (BrowserName.valueOf(browserName)) {
            case CHROME: return getChromeDriver(new ChromeOptions().merge(options));
            case FIREFOX: return getFirefoxDriver(new FirefoxOptions().merge(options));
            default: return getFirefoxDriver(new FirefoxOptions());
        }
    }

     private static ChromeDriver getChromeDriver (ChromeOptions options) {
         WebDriverManager.chromedriver().setup();
         return new ChromeDriver(options);
    }

    private static FirefoxDriver getFirefoxDriver (FirefoxOptions options) {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(options);
    }
}

