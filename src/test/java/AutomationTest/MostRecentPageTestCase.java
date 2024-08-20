package AutomationTest;

import Automation.pageobjects.MostRecentPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MostRecentPageTestCase extends MostRecentPage {
    @BeforeTest
    public void setUpPreRequisites(ITestContext context) throws InterruptedException {
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
    public void tearDown(ITestContext context) throws InterruptedException {
        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        clickOnWebElement(driver, homePageLink);
    }

}
