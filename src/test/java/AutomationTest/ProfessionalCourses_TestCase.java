/*package AutomationTest;

import Automation.pageobjects.ProfessionalCourses;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ProfessionalCourses_TestCase extends ProfessionalCourses {

    @BeforeSuite
    public static void launchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @AfterSuite
    public static void closeBrowser() {
        quitDriver();
    }

    @Test(testName = "Validate Test Cases For Professionals")
    public void MostRecentLinkDisplayed() {
        System.out.println("Validate Most Recent link Displayed");
        ClickOnWebElement(driver);
        ValidatePageOpens();
        ValidateTechnology_Tab("Technology");
        ValidateTechnology_Header("Technology");
        ValidateFree_Course_Tab("Free Course");
        ValidateFree_Course_Header("Free Course");
        ValidateProgramming_Tab("Programming");
        ValidateProgramming_Header("Programming");
        ValidateITCertification_Tab("IT Certification");
        ValidateITCertification_Header("IT Certification");
    }
}*/

