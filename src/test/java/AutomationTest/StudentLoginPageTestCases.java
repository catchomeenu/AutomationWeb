package AutomationTest;

import Automation.pageobjects.StudentLoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentLoginPageTestCases extends StudentLoginPage {


    @Test(priority = 14)
    public static void loginAsStudent() {
        enterStudentEmailAddress("ghi@gmail.com");
        enterStudentPassword("Mylife@123");
        clickStudentLogin();
    }

    @Test(priority=15)
        public static void verifyDashboardTextPresence() {
            boolean actualresult = dashboardTextPresence();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
            System.out.println("Dashboard Text Presence Validation Success");
            System.out.println("***********Student LoginPage Test Cases Ended****************");

        }


    }


