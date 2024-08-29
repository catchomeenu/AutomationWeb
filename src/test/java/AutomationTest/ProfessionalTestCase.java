package AutomationTest;

import Automation.pageobjects.Professional;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ProfessionalTestCase extends Professional {
    @BeforeSuite
    public static void launchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void verifyProfessionals() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickProfessionals();
        selectProfessionalscourse();
        selectProfessionalsEnrollment();
        validateprofessionalsText();
        clickEnrollmentOpenlink();
        verifyKbText();
        click_home();
        System.out.println("Navigating Back to Home Page");
        selectProfessionalsEnrollment();
        System.out.println("UnSelect EnrollmentOpen");
        click_home();
        System.out.println("Home Page");

    }
}