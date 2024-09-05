package AutomationTest;

import Automation.pageobjects.CoursesPooja;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CoursesPoojaTestCase extends CoursesPooja {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void TrendingCourseEnrollment() {

        clickTrending();
        clickCourseStatus();
        SelectTrendingEnrollment();
        System.out.println("Open Enrollment is selected");
        String Actualval = ValidateTrendingCourseTitle();
        String Expectedval = "Trending";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actualval, Expectedval);// using soft assert
        sa.assertAll();
        SelectTrendingCourse();
        boolean CourseTitle = ValidateSelectedTrendingCourseTitle();
        boolean ExpectedCourseTitle =true;
        sa.assertEquals(CourseTitle, ExpectedCourseTitle);// using soft assert
        sa.assertAll();
        click_home();
        SelectTrendingEnrollment();
        System.out.println("Deselecting Open Enrollment");

        click_home();

    }
    @Test(priority = 2)
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


