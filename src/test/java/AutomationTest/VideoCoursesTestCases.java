package AutomationTest;

import Automation.pageobjects.VideoCourses;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VideoCoursesTestCases extends VideoCourses {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void VideoCourseClosedEnrollment()  {

        clickVideoCourse();
        clickCourseStatus();
        select_EnrollmentClosedCourses();
        System.out.println("Selecting Closed Enrollment");
        String Actualval = ValidateVideoCourseTitle();
        String Expectedval = "Videos Courses";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actualval, Expectedval);// using soft assert
        sa.assertAll();
        SelectVideoCoursesCourse();
        boolean CourseTitle =  ValidateSelectedVideoCoursesCourseTitle();
        boolean ExpectedCourseTitle =true;
        sa.assertEquals(CourseTitle, ExpectedCourseTitle);// using soft assert
        sa.assertAll();
        click_home();
        select_EnrollmentClosedCourses();
        System.out.println("Deselecting Closed Enrollment");
        click_home();



    }
}
