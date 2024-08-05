package AutomationTest;

import Automation.pageobjects.Courses;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CoursesTestCase extends Courses {
    @Test(priority = 1)
    public static void Courses_EnrollmentOpen() {
        click_CourseStatus();
        select_Enrollopen();
        verifyEnrollmentopen();

    }

    @Test(priority = 2)
    public static void verify_CourseInformation()
    {

        boolean actualText= verify_Enrollmentopentext();
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("Technology text presence as expected");
    }

    @Test(priority = 3)
    public static void click_imgEnrollmentOpen()
    {
        click_imageEnrollmentOpen();
        boolean actualText= verify_Enrollmentopentext();
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("Technology text presence as expected");
    }

    @Test(priority = 4)
    public static void verify_CourseInfmtext()
    {

        String actual_Text= verify_CourseInfm();
        String expected_Text="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actual_Text,expected_Text);
        sa.assertAll();
        System.out.println("Course Information text presence as expected");
    }

    @Test(priority = 5)
    public static void verify_AbouttheCoursetext()
    {

        String actual_Text= verify_abtthecourse();
        String expected_Text="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actual_Text,expected_Text);
        sa.assertAll();
        System.out.println("About the course text presence as expected");
    }



}

