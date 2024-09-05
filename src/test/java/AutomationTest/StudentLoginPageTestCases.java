package AutomationTest;

import Automation.pageobjects.StudentLoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentLoginPageTestCases extends StudentLoginPage {


    @Test(priority = 91)
    public static void loginAsStudent() {
        backToInfyniHomePage();
        clickLoginButton_Student();
        enterStudentEmailAddress("queen@gmail.com");
        enterStudentPassword("Mylife@123");
        clickStudentLogin();
    }

    @Test(priority=92)
        public static void verifyDashboardTextPresence() {
            boolean actualresult = dashboardTextPresence();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
            System.out.println("Dashboard Text Presence Validation Success");
            System.out.println("***********Student LoginPage Test Cases Ended****************");
        System.out.println("***********Student Dashboard Test Cases Started****************");

        }


    }


