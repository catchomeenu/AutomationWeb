package AutomationTest;

import Automation.pageobjects.Logout;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class StudentLogoutTestCases extends Logout {
   // @Test(priority = 95)
    public static void logoutAsStudent() {
        // Instructor Logout profile select
        verifyprofileimg();
        profileimageclick(); // Drop down select
        verifyLogoutDD();
        LogoutDDSelect();
        LogoutDDclick();
        System.out.println(" Logout from Student ID");
        logoutTextPresence();
        System.out.println("***********Student Logout  Test Cases Ended****************");
    }
}
