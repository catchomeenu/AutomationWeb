package AutomationTest;

import Automation.base.Base;
import Automation.pageobjects.Kids;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KidsTestCase extends Kids
{
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority=1)
    public static void kidsPage() {
        click_home();
        System.out.println("Navigated to Home Page");
        click_Kids();
        System.out.println("Navigated to Kids Page");
        implicitWait(10);
        boolean actualText = verify_KidsPage();
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualText, expectedText);
        System.out.println("Kids Text presence as expected");
    }


    @Test(priority=2,enabled = false)
    public static void clickhome(){
        click_home();
        System.out.println("Navigated back to Home Page");
    }



}
