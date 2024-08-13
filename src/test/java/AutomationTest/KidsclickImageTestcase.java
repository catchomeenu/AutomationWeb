package AutomationTest;

import Automation.pageobjects.ClickimageMostPopular;
import Automation.pageobjects.KidsClickimage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class KidsclickImageTestcase extends KidsClickimage {

     @Test
    public static void clickImages() throws InterruptedException {
          boolean actualtext= clickImagefromkids("Games");
         Thread.sleep(5000);
         boolean expectedText=true;
         SoftAssert sa=new SoftAssert();
         sa.assertEquals(actualtext,expectedText);
         sa.assertAll();
         System.out.println("Games is displayed as expected");

         boolean actualtext1= clickImagefromkids("Junior Sub");
         Thread.sleep(5000);
         boolean expectedText1=true;
         sa.assertEquals(actualtext1,expectedText1);
         sa.assertAll();
         System.out.println("Junior Sub is displayed as expected");


         boolean actualtext2=clickImagefromkids("Kuchipudi and More");
         Thread.sleep(5000);
         boolean expectedtext2=true;
         sa.assertEquals(actualtext2,expectedtext2);
         sa.assertAll();
         System.out.println("Kuchipudi and More is displayed as expected");


         boolean actualtext3=clickImagefromkids("Drop-ins");
         Thread.sleep(5000);
         boolean expectedtext3=true;
         sa.assertEquals(actualtext3,expectedtext3);
         sa.assertAll();
         System.out.println("Drop-ins is displayed as expected");

         driver.quit();
    }

}
