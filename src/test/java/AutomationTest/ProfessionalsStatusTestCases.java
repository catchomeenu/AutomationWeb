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

        ProfessionalsCourse();
        System.out.println("Navigated back to homepage from Selected course page");


        ProfessionalSlickListTechnology();
        System.out.println("Clicking Technology");
        boolean actualresult_Technology =ProfessionalSlickListTechnology();

        boolean expectedresult_Technology = true;
        sa.assertEquals(actualresult_Technology, expectedresult_Technology);// using soft assert
        sa.assertAll();
        System.out.println("Technology Title presence verified");

        ProfessionalSlickListFreeCourse();
        System.out.println("Clicking FreeCourse");
        boolean actualresult_Freecourse =ProfessionalSlickListFreeCourse();

        boolean expectedresult_Freecourse = true;
        sa.assertEquals(actualresult_Freecourse, expectedresult_Freecourse);// using soft assert
        sa.assertAll();
        System.out.println("FreeCourse Title presence verified");


        ProfessionalSlickListProgramming();
        System.out.println("Clicking Programming");
        boolean actualresult_Programming =ProfessionalSlickListProgramming();

        boolean expectedresult_Programming = true;
        sa.assertEquals(actualresult_Programming, expectedresult_Programming);// using soft assert
        sa.assertAll();
        System.out.println("Programming Title presence verified");

        ProfessionalSlickListITCertification();
        System.out.println("Clicking ITcertification");
        boolean actualresult_IT = ProfessionalSlickListITCertification();

        boolean expectedresult_IT = true;
        sa.assertEquals(actualresult_IT, actualresult_IT);// using soft assert
        sa.assertAll();
        System.out.println("ITCertification Title presence verified");






    }
}
