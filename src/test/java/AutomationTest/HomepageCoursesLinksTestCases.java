package AutomationTest;

import Automation.pageobjects.HomepageCoursesLinks;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomepageCoursesLinksTestCases extends HomepageCoursesLinks {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }
//Most Popular TC
    @Test(priority=1)
    public static void mostPopularPage() {
        click_home();
        System.out.println("Navigated to Home Page");
        click_MostPopular();
        System.out.println("Navigated to Most Popular Page");
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
    @Test(priority=2)
public static void MostRecentPage() {
        Clickon_MostRecentTab();
        System.out.println("Navigated To Most Recent Header page");
        validatePageIsOpen();
        Home();
        System.out.println("Navigated to 'Home' link");

}

    //Professionals TC
    @Test(priority = 3)
    public void professionalPage() {
        //validateCoursesTabs("Professionals");
        ProfessionalCourse();
        System.out.println("Navigated to 'Professional' link");
        boolean actualresult = ProfessionalPage();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("Professional text presence verified");
        Home();
        System.out.println("Navigated back to homepage from Professional page");

    }
    //Kids TC
    @Test(priority=4)
    public static void kidsPage() {
        //validateCoursesTabs("Kids");
        click_Kids();
        System.out.println("Navigated to Kids Page");
        implicitWait(10);
        boolean actualText = verify_KidsPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Kids Text presence as expected");
        click_home();
        System.out.println("Navigated to Home Page");
    }



}
