package AutomationTest;

import Automation.pageobjects.Professionals;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ProfessionalsTestCase extends Professionals {


    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public void Courses() {
        Home();
        System.out.println("Navigated to 'Home' link");
        ProfessionalCourse();
        System.out.println("Navigated to 'Professional' link");
        boolean actualresult = ProfessionalPage();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("Professional text presence verified");
        Home();
        System.out.println("Navigated back to homepage from Professional page");

    }
}
