package basetest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BaseTest {

    public String userName = "mngr668080";
    public String passWord = "YzUtuzE";

    public WebDriver wdriver;
    public LoginPage loginPage;
    public static Logger logger;

    @BeforeMethod
    public void launchBrowser(){

        System.setProperty("webdriver.chrome.driver","/Drivers/chromedriver.exe");
        wdriver = new ChromeDriver();

        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();

        loginPage = new LoginPage(wdriver);


        logger = Logger.getLogger(BaseTest.class);
        PropertyConfigurator.configure("Configurationfiles/Log4j.properties");

        Path logPath = Paths.get("automation-test.log");
        try {
            // Truncates the file to 0 size if it exists, or creates a new empty one
            Files.write(logPath, new byte[0],
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Could not clear log file: " + e.getMessage());
        }

        logger.info("Log4j initialized successfully.");
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        logger.info("Log4j terminated successfully.");
        wdriver.quit();
        Thread.sleep(2000);
    }
}
