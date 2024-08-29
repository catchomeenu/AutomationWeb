package AutomationTest;

import Automation.pageobjects.LiveCourses;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LiveCoursesTestCases extends LiveCourses {


    @Test(priority = 2)
    public static void liveCourses() {
        click_LiveCourses();
        select_CourseStatusDropdown();
        select_LiveCoursesEnrollment();
        System.out.println("Selecting the Enrollment open");
        boolean actualText = validate_LiveCoursesPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Live Courses Text presence as expected");
        click_LiveCoursesCourse();
        boolean actual_Text = validate_LiveCoursesCourseTitle();
        boolean expected_Text = true;
        sa.assertEquals(actual_Text, expected_Text);
        System.out.println("KB Monthly Live Course - Aug 5 presence as expected");
        click_home();
        select_LiveCoursesEnrollment();
        System.out.println("Deselecting the Enrollment open");
        click_home();
    }
}
