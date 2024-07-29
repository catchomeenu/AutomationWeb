package Automation.base;

import Automation.pageobjects.MostRecentPage;
import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class TestBase extends Base implements ITest {
    ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    @BeforeSuite
    @Parameters({"Browser"})
    public void beforeSuite(@Optional("Chrome") String browser) {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/chromedriver");
        launchBrowser(browser);
        implicitWait(30);
    }

    @BeforeTest
    public void setUpPreRequisites(ITestContext context) throws InterruptedException {
        System.out.println("Before Test Set up");
        launchApp("https://devnj.infyni.com/");
        MostRecentPage.clickOnWebElement(driver, MostRecentPage.mostRecentLink);
    }

    @AfterTest
    public void tearDown(ITestContext context) throws InterruptedException {
        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        MostRecentPage.clickOnWebElement(driver, MostRecentPage.homePageLink);
    }

    @AfterSuite
    public void tearDownPreRequisites(ITestContext context) {
        System.out.println("Test Suite Execution Complete");
        driver.quit();
    }

    @Override
    public String getTestName() {
        return this.getClass().getSimpleName();
    }
}
