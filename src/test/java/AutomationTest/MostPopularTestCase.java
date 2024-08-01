package AutomationTest;

import Automation.pageobjects.MostPopularLinkPage;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Automation.pageobjects.StudentDashBoardPage.clickHomeLink;

public class MostPopularTestCase extends MostPopularLinkPage
{

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority=1)
    public static void mostPopularPage() {
        click_home();
        System.out.println("Navigated to Home Page");
        click_MostPopular();
        System.out.println("Navigated to Most Popular Page");
        implicitWait(10);
        boolean actualText = verify_MostPopularPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Most Popular Text presence as expected");
    }

    @Test(priority=2,enabled = false)
    public static void clickhome(){
        click_home();
        System.out.println("Navigated back to Home Page");

    }

}



