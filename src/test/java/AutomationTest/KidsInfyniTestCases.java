package AutomationTest;

import Automation.pageobjects.KidsInfyni;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KidsInfyniTestCases extends KidsInfyni {

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }
    @Test(priority = 1)
    public static void KidsCourseEnrollment() {

        clickKids();
        clickCourseStatus();
        selectCompletedEnrolment();
        System.out.println("Completed Enrollment is selected");
        String Actualval = ValidateKidsCourseTitle();
        String Expectedval = "Kids";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actualval, Expectedval);// using soft assert
        sa.assertAll();
        SelectKidsCourse();
        boolean CourseTitle = ValidateSelectedKidsCourseTitle();
        boolean ExpectedCourseTitle =true;
        sa.assertEquals(CourseTitle, ExpectedCourseTitle);// using soft assert
        sa.assertAll();
        click_home();
        selectCompletedEnrolment();
        System.out.println("Deselecting Completed Enrollment");

        click_home();

    }



}
