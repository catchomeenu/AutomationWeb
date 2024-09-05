package AutomationTest;

import Automation.pageobjects.MostPopular;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MostPopularTestCases extends MostPopular {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
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
        select_MostPopularEnrollment();
        System.out.println("Deselecting the Enrollment open");
        click_home();
    }
}
