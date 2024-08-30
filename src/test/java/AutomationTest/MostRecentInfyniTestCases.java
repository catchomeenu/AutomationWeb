package AutomationTest;

import Automation.pageobjects.MostRecentInfyni;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MostRecentInfyniTestCases extends MostRecentInfyni {

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(testName = "Validate Most Recent Test Cases")
    public void validateMostRecentTestCases() {

        ClickOn_MostRecent();
        System.out.println("Click On Most Recent Course");

        Click_CourseStatus();
        System.out.println("Click On Course Status");

        SelectMostRecent_EnrollmentOpen();
        System.out.println("Click on Enrollment Open");

        Validate_MostRecentCourse_Header();
        System.out.println("Validate Most Recent Title");

        ClickOn_LiveCourse_Link();
        System.out.println("Click on KB Monthly Live Course - Aug 5");

        ValidateCourse_Title();
        System.out.println("Validate KB Monthly Live Course - Aug 5 Course Title");

        ClickOn_Home();
        System.out.println("Navigating to home page link");

        UnSelect_EnrollmentOpen();
        System.out.println("Deselect Enrollment Open");

        ClickOn_Home();
        System.out.println("Navigating to home page link");
    }


}
