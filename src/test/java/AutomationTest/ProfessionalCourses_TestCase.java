package AutomationTest;

import Automation.pageobjects.ProfessionalCourses;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfessionalCourses_TestCase extends ProfessionalCourses {

    @BeforeTest
    public void setUpPreRequisites(ITestContext context) {
        System.out.println("Before Test Set up");
        launchApp("https://devnj.infyni.com/");
        ClickOnWebElement(driver);
    }

    @Test(testName = "Validate Test Cases")
    public void MostRecentLinkDisplayed() throws InterruptedException {
        System.out.println("Validate Most Recent link Displayed");
        ValidatePageOpens(driver);
        ValidateTechnology_Tab("Technology");
        ValidateTechnology_Header("Technology");
        ValidateFree_Course_Tab("Free Course");
        ValidateFree_Course_Header("Free Course");
        ValidateProgramming_Tab("Programming");
        ValidateProgramming_Header("Programming");
        ValidateITCertification_Tab("IT Certification");
        ValidateITCertification_Header("IT Certification");
    }

    @AfterTest
    public void tearDown(ITestContext context) throws InterruptedException {

        System.out.println("After Test Set up");
        ClickOnHome(driver);
    }
}

