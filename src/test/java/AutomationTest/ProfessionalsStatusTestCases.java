package AutomationTest;

import Automation.pageobjects.ProfessionalsCourseStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProfessionalsStatusTestCases extends ProfessionalsCourseStatus {

    @Test(priority = 2)
    public  void Courses()
    {

        ProfessionalsCourse();
        System.out.println("Navigated to 'Professional' link");
        CourseStatusSelection();
        System.out.println("Clicking course status");
        ClickOpenEnrolment();
        System.out.println("Selecting open enrolment");
        ClickingCourse();
        System.out.println("Selecting course");


        String actualresult = ProfessionalSelectedCourseTitle();

        String expectedresult = "Technology";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("Course Title presence verified");

        String actual1result_info = ProfessionalSelectedCourseInfo();

        String expectedresult_info = "Course Information";

        sa.assertEquals(actual1result_info, expectedresult_info);// using soft assert
        sa.assertAll();
        System.out.println("Course Information  verified");

        String actualresult_about = ProfessionalSelectedCourseAbout();

        String expectedresult_about= "About the Course";

        sa.assertEquals(actualresult_about, expectedresult_about);// using soft assert
        sa.assertAll();
        System.out.println("About the course verified");


    }
}
