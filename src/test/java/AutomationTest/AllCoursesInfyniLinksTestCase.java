package AutomationTest;

import Automation.pageobjects.AllCoursesInfyniLinks;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AllCoursesInfyniLinksTestCase extends AllCoursesInfyniLinks {

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(50);
    }

    @Test(priority = 1)
    public static void TrendingCourseEnrollment() {

        clickTrending();
        clickCourseStatus();
        SelectTrendingEnrollment();
        System.out.println("Open Enrollment is selected");
        String Actualval = ValidateTrendingCourseTitle();
        String Expectedval = "Trending";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actualval, Expectedval);// using soft assert
        sa.assertAll();
        SelectTrendingCourse();
        boolean CourseTitle = ValidateSelectedTrendingCourseTitle();
        boolean ExpectedCourseTitle =true;
        sa.assertEquals(CourseTitle, ExpectedCourseTitle);// using soft assert
        sa.assertAll();
        click_home();
        driver.navigate().refresh();
        System.out.println("===========================");
    }
    @Test(priority = 2)
    public static void mostPopular() {
        click_MostPopular();
        select_CourseStatusDropdown();
        select_MostPopularEnrollment();
        System.out.println("Selecting the Enrollment open");
        boolean actualText = validate_MostPopularPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Most Popular Text presence as expected");
        click_MostPopularCourse();
        boolean actual_Text = validate_MostPopularCourseTitle();
        boolean expected_Text = true;
        sa.assertEquals(actual_Text, expected_Text);
        System.out.println("KB Monthly Live Course - Aug 5 presence as expected");
        click_home();
        driver.navigate().refresh();
        System.out.println("===========================");

    }
    @Test(priority = 3)
    public void MostRecentTestCases() {

        ClickOn_MostRecent();
        System.out.println("Click On Most Recent Course");

        Click_CourseStatus();
        System.out.println("Click On Course Status");

        SelectMostRecent_EnrollmentOpen();
        System.out.println("Click on Enrollment Open");

        boolean actualtext1=Validate_MostRecentCourse_Header();
        boolean expectedText1 = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualtext1, expectedText1);
        System.out.println("Validate Most Recent Title");

        ClickOn_LiveCourse_Link();
        System.out.println("Click on KB Monthly Live Course - Aug 5");

        boolean actuvalText=ValidateCourse_Title();
        boolean expectedText = true;
        sa.assertEquals(actuvalText, expectedText);


        System.out.println("Validate KB Monthly Live Course - Aug 5 Course Title");

        click_home();
        driver.navigate().refresh();
        System.out.println("Navigating to home page link");
        System.out.println("===========================");
    }
    @Test(priority = 4)
    public static void Professionals() {

        clickProfessionals();
        selectProfessionalscourse();
        selectProfessionalsEnrollment();
        validateprofessionalsText();
        clickEnrollmentOpenlink();
        verifyKbText();
        click_home();
        System.out.println("Navigating Back to Home Page");
        driver.navigate().refresh();
        System.out.println("Home Page");
        System.out.println("===========================");

    }

    @Test(priority = 5)
    public static void KidsCourse() {

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
        driver.navigate().refresh();
        System.out.println("===========================");


    }

    @Test(priority = 6)
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
        driver.navigate().refresh();
        System.out.println("===========================");

    }
    @Test(priority = 7)
    public static void VideoCourseClosedEnrollment()  {

        clickVideoCourse();
        clickCourseStatus();
        select_EnrollmentClosedCourses();
        System.out.println("Selecting Closed Enrollment");
        String Actualval = ValidateVideoCourseTitle();
        String Expectedval = "Videos Courses";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actualval, Expectedval);// using soft assert
        sa.assertAll();
        SelectVideoCoursesCourse();
        boolean CourseTitle =  ValidateSelectedVideoCoursesCourseTitle();
        boolean ExpectedCourseTitle =true;
        sa.assertEquals(CourseTitle, ExpectedCourseTitle);// using soft assert
        sa.assertAll();
        click_home();
        driver.navigate().refresh();
        System.out.println("===========================");

    }


}
