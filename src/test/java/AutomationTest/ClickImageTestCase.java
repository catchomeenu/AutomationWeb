package AutomationTest;

import Automation.pageobjects.ClickimageMostPopular;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ClickImageTestCase extends ClickimageMostPopular {

    @Test
    public static void clickImages() throws InterruptedException {
        boolean actualtext = clickImagefromMp("Technology");
        Thread.sleep(5000);
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualtext, expectedText);
        sa.assertAll();
        System.out.println("Technology is displayed as expected");

        boolean actualtext1 = clickImagefromMp("Free Course");
        Thread.sleep(5000);
        boolean expectedText1 = true;
        sa.assertEquals(actualtext1, expectedText1);
        sa.assertAll();
        System.out.println("Free Course is displayed as expected");


        boolean actualtext2 = clickImagefromMp("Programming");
        Thread.sleep(5000);
        boolean expectedtext2 = true;
        sa.assertEquals(actualtext2, expectedtext2);
        sa.assertAll();
        System.out.println("Programming is displayed as expected");


        boolean actualtext3 = clickImagefromMp("IT Certification");
        Thread.sleep(5000);
        boolean expectedtext3 = true;
        sa.assertEquals(actualtext3, expectedtext3);
        sa.assertAll();
        System.out.println("IT Certification is displayed as expected");
        
        // Changed direct access to driver.quit() -> getting compilation error as can not access the driver object
        quitDriver();
    }

}
