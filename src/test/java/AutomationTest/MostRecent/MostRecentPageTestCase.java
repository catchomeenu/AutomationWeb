package AutomationTest.MostRecent;

import Automation.pageobjects.MostRecentPage;
import org.testng.annotations.Test;

public class MostRecentPageTestCase extends MostRecentPage {

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

}
