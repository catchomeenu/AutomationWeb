package AutomationTest;

import Automation.pageobjects.HomePage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTestCases extends HomePage {

  //  @Test(priority = 13)
    public static void redirectToInstructorLoginPage() {
        clickForInstructorsLink();

        //Validating If Login text is displayed or not
        boolean actualresult = instructorloginTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("Instructor Login Text Presence Validation Success");
        System.out.println("***********HomePage Login Test Cases Ended****************");
    }

    @Test(priority = 13)
        public static void redirectToStudentLoginPage() {
            clickLoginButton_Student();
        //Validating If Login text is displayed or not
        boolean actualresult = loginTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("Login Text Presence Validation Success");
        System.out.println("***********HomePage Login Test Cases Ended****************");
    }

      // @AfterSuite
        public static void closeApplication () {
            closeApp();
        }

}

