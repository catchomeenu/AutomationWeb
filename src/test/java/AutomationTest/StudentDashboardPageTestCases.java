package AutomationTest;

import Automation.pageobjects.StudentDashBoardPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class StudentDashboardPageTestCases extends StudentDashBoardPage
{

    @Test(priority = 93)
    public static void searchCourseToEnroll()  {
        clickHomeLink();
       // selectCourseStatusByOpenEnrollment();
        enterCourseName("bulb");
        viewDisplayedList("A Journey Through the History and Science of the Light Bulb");
        selectCourse();
    }

    @Test(priority = 94)
    public static void enrollCourse()
    {
        clickEnrollNow();
        /*enterfirstName("Abhiram");
        enterLastName("Penu");
        enterAddressLine1("134 SaddleCreek");
        enterAddressLine2("Gateway Rd");
        enterCity("Austin");
        selectCountry("United States");

        enterState("Texas");
        enterAddressZipcode("76423");
        clickSaveAddressButton();*/
        verifyPaymentMethod();
        clickPayNowButton();
        verifyCardTabSelection();
        enterCardNumber("4242 4242 4242 4242");
        enterExpiration("1225");
        enterCvc("345");
        enterZipcode("76423");
        clickContinueButton();
    }

    @Test(priority =95)
    public static void studentLogout()
            {
                clickAccountName();
                clickLogout();
               // clickHomeLink();
                System.out.println("***********Student Dashboard Test Cases Ended****************");
            }

}
