package AutomationTest;

import Automation.pageobjects.InstructorLoginPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InstructorLoginTestCases extends InstructorLoginPage {

    @Test(priority = 82)
    public static void loginAsInstructor() throws Exception {

        clickLoginButton();
        // Enter Email address
        EnterInstructorEmailId("def123@gmail.com");
        // Enter password
        EnterInstructorPwd("Mylife@123");
        // Click 'Sign In' button
        ClickInstructorLogInButton();
        System.out.println("  login as Instructor test case ");
        dashboardTextPresence();
        System.out.println("****login as Instructor Dashboard Live Course TestCases started**** ");

    }

}

