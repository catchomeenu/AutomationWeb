package AutomationTest;

import Automation.pageobjects.CourseHomePageObjects;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Automation.base.Base.*;

public class CourseHomePageTestCases extends CourseHomePageObjects {
    @BeforeSuite
    public static void launchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com");
        implicitWait(30);

    }
    @Test(priority = 1)
    public static void VerifyLiveCoursePage() {
        ClickLiveCourses();
        System.out.println("Navigated to 'Live Course' link");
        String actualResult = CaptureLiveCourseText();
        String expectedResult = "Live Courses";

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualResult, expectedResult);
        System.out.println("'LiveCourse' text presence verified");
        // using soft assert
        sa.assertAll();

    }
    @Test(priority = 2)
    public static void verifyCourseStatus() {
        ClickCourseStatus();
        System.out.println("Navigated to 'Course Status' link");
        CheckEnrollmentClose();
        System.out.println("Checked Enrollment Close");
        ClickTestMonthlyCourse();
        System.out.println("Navigated to 'TestMonthlyCourseLink");
        String actualResult = CaptureTestMonthlyCourse();
        String expectedResult = "Test Monthly Course";

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualResult, expectedResult);
        System.out.println("'Test Monthly Course' text presence verified");
        // using soft assert
        sa.assertAll();
    }
  @AfterSuite
    public static void closeApplication () {

        closeApp();
  }

}


