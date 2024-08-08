package AutomationTest;

import Automation.pageobjects.FilterModulePage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Automation.pageobjects.ProfessionalCourses.ClickOnHome;

public class FilterModuleTestCase extends FilterModulePage {
    @BeforeTest
    public void setUpPreRequisites() {
        System.out.println("Before Test Set up");
        launchApp("https://devnj.infyni.com/");
        clickOnWebElement(driver, mostRecentLink);
    }

    @Test(testName = "Validate Test Cases For Filter Module Enrollment Open")

    public void testFilterModule() {
        System.out.println("Test Cases For Filter Module Enrollment Open");

        ValidateClickOnHome();
        ValidateClickOnWebElement();
        ValidatefilterCourse();
        ValidateEnrollOpen();
        ValidateCourseLink();
        ValidateCourseTitle();
        ValidateCourseInformation();
        ValidateAboutTheCourse();

    }

    @AfterTest
    public void tearDown(ITestContext context) throws InterruptedException {

        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        ClickOnHome(driver);
    }

}


