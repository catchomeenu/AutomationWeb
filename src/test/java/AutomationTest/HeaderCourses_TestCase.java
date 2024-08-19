package AutomationTest;

import Automation.pageobjects.Programming_Module;
import org.testng.ITestContext;
import org.testng.annotations.*;

import static Automation.pageobjects.ProfessionalCourses.ClickOnHome;
import static Automation.pageobjects.ProfessionalCourses.ClickOnWebElement;


public class HeaderCourses_TestCase extends Programming_Module {

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
        ClickOnWebElement(driver);
    }

    @Test(testName = "Validate Test Cases For Programming")
    public void ProgrammingTestCases() {

        System.out.println("Test cases for Programming");
        ValidateClickOnHome(driver);
        ValidateClickOnProgrammeCourse();
        ValidateProgrammeResult_Header();
        ValidateVirtualSessions_Course(driver);
        ValidateVirtualSessionsCourse_Title();
        ValidateCourse_Information();
        ValidateAboutTheCourse();
    }

    @Test(testName = "Validate SatPreparation Test Cases")
    public static void validateSatPreparation() {
        ValidateClickOnHome(driver);
        System.out.println("Navigated To Home Page");
        ClickOn_SatPreparationCourselink(driver);
        Validate_SatPreparationResultsHeader();
        ClickOn_SatPreparationLink(driver);
        Validate_SatPreparationTitle();
        Validate_Course_Information();
        Validate_AboutTheCourse();
    }

    @AfterTest
    public void tearDown(ITestContext context) {

        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        ClickOnHome(driver);
    }

}
