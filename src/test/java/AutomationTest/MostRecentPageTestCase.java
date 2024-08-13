package AutomationTest;

import Automation.pageobjects.MostRecentPage;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class MostRecentPageTestCase extends MostRecentPage {
    @BeforeSuite(alwaysRun = true)
    @Parameters({"Browser"})
    public void beforeSuite(@Optional("Chrome") String browser) {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "/src/main/resources/chromedriver");
        launchBrowser(browser);
        implicitWait(30);
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownPreRequisites(ITestContext context) {
        System.out.println("Test Suite Execution Complete");
        quitDriver();
    }

    @BeforeTest
    public void setUpPreRequisites(ITestContext context) {
        System.out.println("Before Test Set up");
        launchApp("https://devnj.infyni.com/");
        clickOnWebElement(driver, mostRecentLink);
    }

    @Test(testName = "Validate Most Recent Page is accessible")
    public void validatePageIsLaunching() throws InterruptedException {
        System.out.println("Test Page");
        validatePageIsOpen(driver);
    }

    @Test(testName = "Validate Professional & Kids Tab Items")
    public void validateProfessionalTabItems() {
        // Validate 2 tabs are available on Page
        validateCoursesTabs("Professionals");
        validateCoursesTabs("Kids");
    }


    @AfterTest
    public void tearDown(ITestContext context) {
        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        clickOnWebElement(driver, homePageLink);

    }

}
