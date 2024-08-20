package AutomationTest;

import Automation.pageobjects.MostRecentPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MostRecentPageTestCase extends MostRecentPage {

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @AfterSuite
    public static void AfterSuite() {
        quitDriver();
    }

    @Test(testName = "Validate Home,Most Recent Link & Most Recent Header")
    public static void MostRecentPage() {
        Clickon_Homepage();
        System.out.println("Navigated To Home Page");
        Clickon_MostRecentTab();
        System.out.println("Navigated To Most Recent Header page");
        validatePageIsOpen();
    }


    @Test(testName = "Validate Professional & Kids Tab Items")
    public void validateProfessionalTabItems() {
        // Validate 2 tabs are available on Page
        validateCoursesTabs("Professionals");
        validateCoursesTabs("Kids");
    }


}


