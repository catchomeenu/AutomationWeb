package AutomationTest;

import Automation.pageobjects.CourseHomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Automation.pageobjects.HomePage.backToHomePage;
import static java.lang.Thread.sleep;

public class CourseHomePageTestCases extends CourseHomePage {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void VerfiyTrendingPage() throws InterruptedException {
        // TODO Auto-generated method stub

        ClickTrendingLink();
        System.out.println("Navigated to 'TRENDING' link");
        String actualresult = CaptureTrendingText();
        String expectedresult ="Trending";

        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);
        System.out.println("'Trending' text presence verified");
        // using soft assert
        sa.assertAll();
        backToHomePage();
        System.out.println("Navigated back to homepage from Trending page");
        System.out.println(" TC-01 Trending link - test case ");


    }

    @Test(priority = 2)
    public static void VerfiyCourseStatus() throws InterruptedException {
        ClickCourseStatus();
        System.out.println("Navigated to 'Course Status' link");
        CheckEnrollemntOpen();
        System.out.println("Checked Enrollement Open");
        ClickBADesignLink();
        System.out.println("Clicked BA Design");
        sleep(5000);

        String actualresult1 = CaptureBADesignText();
        String expectedresult1 ="BA Design";
        //String actualresult2 = CaptureAboutTheCourseText();
        //String expectedresult2 ="About the Course";
        String actualresult3 = CaptureCourseInformationText();
        String expectedresult3 ="Course Information";

        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualresult1, expectedresult1);
        System.out.println("'BA Design' text presence verified");
        //sa.assertEquals(actualresult2, expectedresult2);
        //System.out.println("'About the Course' text presence verified");
        sa.assertEquals(actualresult3, expectedresult3);
        System.out.println("'Course Information' text presence verified");
        // using soft assert
        sa.assertAll();
        backToHomePage();
        System.out.println("Navigated back to homepage from Trending page");
        System.out.println(" TC-02 Enrollement Open BA Design - test case ");

    }
    @AfterSuite
    public static void closeApplication () {

        closeApp();
    }

}
