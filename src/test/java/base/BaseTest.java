package base;

import com.epam.kiieu.steps.GmailInboxSteps;
import com.epam.kiieu.steps.GmailLoginSteps;
import com.epam.kiieu.steps.GmailThemeSteps;
import com.epam.kiieu.utils.Constants;
import com.epam.kiieu.utils.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.DriverManager;


public class BaseTest {
    protected WebDriver driver;
    protected GmailInboxSteps gmailInboxSteps;
    protected GmailLoginSteps gmailLoginSteps;
    protected GmailThemeSteps gmailThemeSteps;


    @BeforeTest
    public void setUp() {
        WebDriverFactory webDriverFactory = new WebDriverFactory();
        driver = webDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        gmailLoginSteps = new GmailLoginSteps(driver);

        }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}
