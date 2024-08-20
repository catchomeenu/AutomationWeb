package AutomationTest;

import Automation.pageobjects.FilterModulePage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterModuleTestCase extends FilterModulePage {
    @BeforeTest
    public void setUpPreRequisites() {
        System.out.println("Before Test Set up");
        launchApp("https://devnj.infyni.com/");
//        clickOnWebElement(driver, mostRecentLink);
    }

    @Test(testName = "Filter By Scenarios")

    public void filterByScenarios() {
        // Check Filter By is Displayed
        validateFilterOptionsIsDisplayed();
        List<String> options = new ArrayList<>();
        options.add("Course Status");
        options.add("Course Duration");
        options.add("Price");
        options.add("Ratings");
        validateFilterOptions(options);
        clickOnFilterCourseStatus("Enrollment Open");
        clickOnCourse();
    }


    @AfterTest
    public void tearDown(ITestContext context) {
        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        clickOnWebElement(driver, homePageLink);
    }
}
