package AutomationTest;

import Automation.pageobjects.HomepageCoursesLinks;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomepageCoursesLinksTestCases extends HomepageCoursesLinks {

//Most Popular TC
@Test(priority=64)
public static void TrendingCourse() {
    //validateCoursesTabs("Kids");
    click_home();
    System.out.println("Navigated to Home Page");
    clickTrending();
    System.out.println("Navigated to Trending Course");
    implicitWait(10);
    boolean actualText = ValidateTrendingCourseTitle();
    boolean expectedText = true;
    SoftAssert sa = new SoftAssert();
    sa.assertEquals(actualText, expectedText);
    System.out.println("Trending Course presence as expected");
    click_home();
    System.out.println("Navigated to Home Page");
}
    @Test(priority=65)
    public static void mostPopularCourse() {
        click_home();
        System.out.println("Navigated to Home Page");
        click_MostPopular();
        System.out.println("Navigated to Most Popular Course");
        implicitWait(10);
        boolean actualText = verify_MostPopularPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Most Popular Text presence as expected");
        click_home();
        System.out.println("Navigated back to Home Page");
    }

    //Most Recent TC
    @Test(priority=66)
public static void MostRecentCourse() {
        Clickon_MostRecentTab();
        System.out.println("Navigated To Most Recent Header Course");
        validatePageIsOpen();
        Home();
        System.out.println("Navigated to 'Home' link");

}

    //Professionals TC
    @Test(priority = 67)
    public void professionalCourse() {
        //validateCoursesTabs("Professionals");
        ProfessionalCourse();
        System.out.println("Navigated to 'Professional' link");
        boolean actualresult = ProfessionalPage();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("Professional text presence verified");
        click_home();
        System.out.println("Navigated to Home Page");

    }
    //Kids TC
    @Test(priority=68)
    public static void kidsCourse() {
        //validateCoursesTabs("Kids");
        click_Kids();
        System.out.println("Navigated to Kids Course");
        implicitWait(10);
        boolean actualText = verify_KidsPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Kids Text presence as expected");
        click_home();
        System.out.println("Navigated to Home Page");
    }
    @Test(priority=69)
    public static void liveCourses() {

        click_LiveCourses();
        System.out.println("Navigated to Live Course");
        implicitWait(10);
        boolean actualText = validate_LiveCoursesCourseTitle();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Kids Text presence as expected");
        click_home();
        System.out.println("Navigated to Home Page");
    }
    @Test(priority=70)
    public static void VideoCourses() {
        //validateCoursesTabs("Kids");
        clickVideoCourse();
        System.out.println("Navigated to VideoCourse");
        implicitWait(10);
        boolean actualText = ValidateVideoCourseTitle();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Kids Text presence as expected");
        click_home();
        System.out.println("Navigated to Home Page");
    }


}
