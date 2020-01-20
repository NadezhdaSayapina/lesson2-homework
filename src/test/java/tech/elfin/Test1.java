package tech.elfin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    private static final Logger logger = LogManager.getLogger(Test1.class);

    public void driver (String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver driverChrome = new ChromeDriver();
            driverChrome.get("https://otus.ru/");
            driverChrome.quit();
            logger.info("Chrome Успех");
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            WebDriver driverFox = new FirefoxDriver();
            driverFox.get("https://otus.ru/");
            driverFox.quit();
            logger.info("Fox Успех");
        }
    }

    @Test
    public void test() {
        driver("chrome");
        driver("firefox");
        logger.info("Успех теста");
    }

}
