package AutomationTest;
import Automation.pageobjects.Logout;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InstructorLogoutTestCases extends Logout {
    @Test(priority = 95)
    public static void logoutAsInstructor() {
        // Instructor Logout profile select
        verifyprofileimg();
        profileimageclick(); // Drop down select
        verifyLogoutDD();
        LogoutDDSelect();
        LogoutDDclick();
        System.out.println(" Logout from Instructor ID");
        logoutTextPresence();
        System.out.println("***********instructor Logout  Test Cases Ended*******");
    }
}
