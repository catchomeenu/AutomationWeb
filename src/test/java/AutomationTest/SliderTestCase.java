package AutomationTest;

import Automation.pageobjects.Slider;
import Automation.pageobjects.Slider;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SliderTestCase extends Slider {
    @BeforeSuite
    public static void launchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(40);
    }
    @Test(priority = 1)
    public static void verifyChess() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Chess");
        System.out.println("Navigated to 'Chess' link");
        clickChessCourseLink();
        System.out.println("Navigated to 'Chesspage' link");
    }
  /*  @Test(priority = 2)
    public static void verifyMarketing() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Marketing");
        System.out.println("Navigated to 'Marketing' link");
        clickmarketingpageobj();
        System.out.println("Navigated to 'marketingpage' link");
    }*/
    @Test(priority = 3)
    public static void verifyChoreography() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Choreography");
        System.out.println("Navigated to 'choreography' link");
        clickchoreographypageobj();
        System.out.println("Navigated to 'choreographypage' link");
    }

    @Test(priority = 4)
    public static void verifyIndustrialStudy() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Instrumental Studies");
        System.out.println("Navigated to 'Industrial Study' link");
        clickinstustdplink();
        System.out.println("Navigated to 'Industrial Study' link");
    }
    @Test(priority = 5)
    public static void verifySelfPaced() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Self Paced");
        System.out.println("Navigated to 'Self Paced' link");
        clickSelfpacedObj();
        System.out.println("Navigated to 'Self Paced' link");
    }
    @Test(priority = 6)
    public static void verifySkills() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Skills");
        System.out.println("Navigated to 'Skills' link");
        clickSkillspageobj();
        System.out.println("Navigated to 'Skills' link");
    }
    @Test(priority = 7)
    public static void verifyBusiness() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Business");
        System.out.println("Navigated to 'Business' link");
        clickBusinesspageobj();
        System.out.println("Navigated to 'Business' link");
    }
    @Test(priority = 8)
    public static void verifyTechnologyCourse() {
        click_home();
        System.out.println("Navigated to 'Home' link");
        implicitWait(40);
        clickSlider("Technology Course");
        System.out.println("Navigated to 'Technology Course' link");
        clickTechnologyCoursepageobj();
        System.out.println("Navigated to 'Technology Course' link");
    }
        @AfterSuite
     public static void pageInformation(){
        verifyCourseInformation();
        System.out.println("CourseInformation text presence verified");
        verifyAbouttheCouse();
        System.out.println("About the course text presence as expected");
        click_home();
        System.out.println("Navigated to 'Home' link");
    }
}