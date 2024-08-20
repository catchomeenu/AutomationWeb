package AutomationTest;

import Automation.pageobjects.Courses;
import Automation.pageobjects.KidsCourses;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KidsCoursesTestCase extends KidsCourses {
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
        System.out.println("Games text presence as expected");
    }


}

