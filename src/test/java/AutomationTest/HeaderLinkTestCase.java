package AutomationTest;

import Automation.pageobjects.HeaderLink;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HeaderLinkTestCase extends HeaderLink {

    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void click_animation() throws InterruptedException {

        click_home();
        click_LinkValues("Animation");
        boolean actualtext= verify_LinkValues("animation");
        Thread.sleep(5000);
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Animation is displayed as expected");

    }
    @Test(priority = 2)
    public static void click_animationimage()  {
        click_Animationimage();

    }
    @Test(priority = 3)
    public static void verify_ImageInfm() throws InterruptedException {
      boolean actualText=  verify_Imageclick("Arts - Divya");
        Thread.sleep(5000);
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("Arts - Divya is displayed as expected");

    }
    @Test(priority = 4)
    public static void verify_CourseInfm() throws InterruptedException {
        String actualText=  verify_Courseinfm();
        Thread.sleep(5000);
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");

    }

    @Test(priority = 5)
    public static void verify_abouttheCourse() throws InterruptedException {
        String actualText= verify_abttheCourse();
        Thread.sleep(5000);
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("About the Course is displayed as expected");

    }

    @Test(priority = 6)
    public static void click_modification() throws InterruptedException {

        click_home();
        click_LinkValues("Modification");
        boolean actualtext = verify_LinkValues("modification");
        Thread.sleep(5000);
        boolean expectedText = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualtext, expectedText);
        sa.assertAll();
        System.out.println("Modification is displayed as expected");

    }
    @Test(priority = 7)
    public static void click_modificationimage()  {
        click_Modificationimage();

    }
    @Test(priority = 8)
    public static void verify_modificationImageInfm() throws InterruptedException {
        boolean actualText=  verify_Imageclick("Python");
        Thread.sleep(5000);
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("Python is displayed as expected");

    }
    @Test(priority = 9)
    public static void verify_modificationCourseInfm() throws InterruptedException {
        String actualText=  verify_Courseinfm();
        Thread.sleep(5000);
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println(" Course Information is displayed as expected");

    }

    @Test(priority = 10)
    public static void verify_modificationabouttheCourse() throws InterruptedException {
        String actualText= verify_abttheCourse();
        Thread.sleep(5000);
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualText,expectedText);
        sa.assertAll();
        System.out.println("About the Course is displayed as expected");

    }


}
