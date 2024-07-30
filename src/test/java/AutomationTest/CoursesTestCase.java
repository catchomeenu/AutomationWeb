package AutomationTest;

import Automation.pageobjects.Courses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class CoursesTestCase extends Courses {

    @Test(priority =19)
    public void dashBoard()
    {
        Home();
    }
    @Test(priority = 20)
    public  void Courses()
    {
        ProfessionalCourse();

        boolean actualresult = ProfessionalPage();

        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();

        Home();




    }
}
