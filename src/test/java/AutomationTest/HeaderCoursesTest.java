package AutomationTest;

import Automation.pageobjects.Programming_Module;
import org.testng.ITestContext;
import org.testng.annotations.*;

import static Automation.pageobjects.ProfessionalCourses.ClickOnHome;


public class HeaderCoursesTest extends Programming_Module {

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
        ClickOnHome(driver);
    }

    @AfterTest
    public void tearDown(ITestContext context) {
        System.out.println("After Test Set up");
        // Navigate back to home page - so that next test can start from there
        ClickOnHome(driver);
    }


    @Test(testName = "Validate Test Cases For Programming", priority = 1)
    public void ProgrammingTestCases() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Programming", driver);
        Validate_CourseResults_Header("Programming");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(testName = "Validate SatPreparation Test Cases", priority = 2)
    public static void validateSatPreparation() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("SAT Preparation", driver);
        Validate_CourseResults_Header("sat preparation");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(testName = "Personal Development Course Test Case", priority = 3)
    public void PersonalDevelopmentCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Personal Development", driver);
        Validate_CourseResults_Header("Personal Development");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(testName = "ComputerScience Course Test Cases", priority = 4)
    public void ComputerScienceCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("ComputerScience", driver);
        Validate_CourseResults_Header("computerscience");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(testName = "Natural Language Processing Test Cases", priority = 5)
    public void NaturalLanguageProcess() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Natural Language Processing", driver);
        Validate_CourseResults_Header("natural language processing");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(testName = "TestPrepe Test Cases", priority = 6)

    public void TestPrepeCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("TestPrepe", driver);
        Validate_CourseResults_Header("testprepe");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(testName = "Others Test Cases", priority = 7)

    public void TestOthersCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Others", driver);
        Validate_CourseResults_Header("others");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(testName = "Electrical Engineering Test Cases", priority = 8)

    public void ElectricalengineeringCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Electrical Engineering", driver);
        Validate_CourseResults_Header("electrical engineering");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(testName = "Java Course Test Cases", priority = 9)

    public void JavaCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("java", driver);
        Validate_CourseResults_Header("java");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(testName = "Fact-Checking and Verification Test Cases", priority = 10)

    public void FactCheckingVerificationCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Fact-Checking and Verification", driver);
        Validate_CourseResults_Header("fact-checking and verification");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

}