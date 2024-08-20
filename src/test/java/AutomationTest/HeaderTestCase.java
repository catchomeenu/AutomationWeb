package AutomationTest;

import Automation.pageobjects.Header;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HeaderTestCase extends Header {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    @Test(priority = 1)
    public static void HeaderValidation()
    {

        HeaderLink("Health and Beauty");
        System.out.println("Navigating to Health and Beauty");

        boolean actualresult =HBValidation();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("Health and Beauty Title presence verified");
        SelectCourse("Yoga Everyday - UAT");
        String titleresult=CoursesTitle("Yoga Everyday - UAT");
        String expectedtitle = "Yoga Everyday - UAT";
        sa.assertEquals(titleresult, expectedtitle);// using soft assert
        sa.assertAll();
        System.out.println("Navigating to HB course and Title presence verified");

        String actual1result_info=CourseInfo("Course Information");
        String expectedresult_info = "Course Information";

        sa.assertEquals(actual1result_info, expectedresult_info);// using soft assert
        sa.assertAll();
        System.out.println("HB course Info verified");

        String actualresult_about=CourseAbout("About the Course");
        String expectedresult_about= "About the Course";

        sa.assertEquals(actualresult_about, expectedresult_about);// using soft assert
        sa.assertAll();
        System.out.println("HB course About verified");
        System.out.println("==========================");
        Home();
        System.out.println("Back to homepage");

        HeaderLink("Music Theory");
        System.out.println("Navigating to  Music and Theory");

        boolean pageRes=MusictheoryPage();
        boolean expectedpage_result=true;
        sa.assertEquals(pageRes, expectedpage_result);// using soft assert
        sa.assertAll();
        System.out.println("MusicTheory  Title presence verified");
        SelectCourse("KB video Course - July 31");
        String MTtitleresult=CoursesTitle("KB video Course - July 31");
        String MTexpectedtitle = "KB Video Course - July 31";
        sa.assertEquals(MTtitleresult, MTexpectedtitle);// using soft assert
        sa.assertAll();
        System.out.println("Navigating to MusicTheory course and Title presence verified");


        String infoRes=CourseInfo("Course Information");
        String expectedinfo_result = "Course Information";
        sa.assertEquals(infoRes, expectedinfo_result);// using soft assert
        sa.assertAll();
        System.out.println("MusicTheory course Info verified");

        String aboutRes = CourseAbout("About the Course");
        String expectedabout_result="About the Course";
        sa.assertEquals(aboutRes, expectedabout_result);// using soft assert
        sa.assertAll();
        System.out.println("MusicTheory About the Course verified");
        System.out.println("==========================");
        Home();
        System.out.println("Back to homepage");

        HeaderLink("Test Prepe");
        System.out.println("Navigating to Test Prepe");
        String PageVal = pageValidatoin("test prepe");
        String ExpecPageVal="test prepe";
        sa.assertEquals(PageVal, ExpecPageVal);// using soft assert
        sa.assertAll();
        System.out.println("Test Prepe title verified");
        SelectCourse("advertising");
        System.out.println("Navigating to Test Prepecourse");
        String TPtitleresult=CoursesTitle("Self Paced");
        String TPexpectedtitle = "Self Paced";
        sa.assertEquals(TPtitleresult, TPexpectedtitle);// using soft assert
        sa.assertAll();
        System.out.println("Test Prepecourse Title verified");
        String TPinfoRes=CourseInfo("Course Information");
        String TPexpRes = "Course Information";
        sa.assertEquals(TPinfoRes, TPexpRes);// using soft assert
        sa.assertAll();
        System.out.println("Test Prepecourse Info verified");

        String TPaboutRes = CourseAbout("About the Course");
        String TPexpectedabout_result="About the Course";
        sa.assertEquals(TPaboutRes, TPexpectedabout_result);// using soft assert
        sa.assertAll();
        System.out.println("Test Prepe About the Course verified");
        System.out.println("==========================");
        Home();
        System.out.println("Back to homepage");



        HeaderLink("Games");
        System.out.println("Navigating to  Games");
        String GamePageVal = pageValidatoin("games");
        String GameExpecPageVal="games";
        sa.assertEquals(GamePageVal, GameExpecPageVal);// using soft assert
        sa.assertAll();
        System.out.println("Games title verified");
        SelectCourse("Python");
        System.out.println("Navigating to Gamescourse");
        String Gamestitleresult=CoursesTitle("Python");
        String Gamesexpectedtitle = "Python";
        sa.assertEquals(Gamestitleresult, Gamesexpectedtitle);// using soft assert
        sa.assertAll();
        System.out.println("Games course Title verified");
        String GamesinfoRes=CourseInfo("Course Information");
        String GamesexpRes = "Course Information";
        sa.assertEquals(GamesinfoRes, GamesexpRes);// using soft assert
        sa.assertAll();
        System.out.println("Games course Info verified");

        String GamesaboutRes = CourseAbout("About the Course");
        String Gamesexpectedabout_result="About the Course";
        sa.assertEquals(GamesaboutRes, Gamesexpectedabout_result);// using soft assert
        sa.assertAll();
        System.out.println("Games About the Course verified");
        System.out.println("==========================");

        Home();
        System.out.println("Back to homepage");



        HeaderLink("Hobbies");
        System.out.println("Navigating to  Hobbies");
        String HobbyPageVal = pageValidatoin("hobbies");
        String HobbyExpecPageVal="hobbies";
        sa.assertEquals(HobbyPageVal, HobbyExpecPageVal);// using soft assert
        sa.assertAll();
        System.out.println("Hobbies Title verified");
        SelectCourse("Sample Video Course");
        System.out.println("Navigating to Hobbiescourse");
        String Hobbytitleresult=CoursesTitle("Sample Video Course");
        String Hobbyexpectedtitle = "Sample Video Course";
        sa.assertEquals(Hobbytitleresult, Hobbyexpectedtitle);// using soft assert
        sa.assertAll();
        System.out.println("Hobbies course Title verified");
        String HobbyinfoRes=CourseInfo("Course Information");
        String HobbyexpRes = "Course Information";
        sa.assertEquals(HobbyinfoRes, HobbyexpRes);// using soft assert
        sa.assertAll();
        System.out.println("Hobbies course Info verified");

        String HobbyaboutRes = CourseAbout("About the Course");
        String Hobbyexpectedabout_result="About the Course";
        sa.assertEquals(HobbyaboutRes, Hobbyexpectedabout_result);// using soft assert
        sa.assertAll();
        System.out.println("Hobbies About the Course verified");
        System.out.println("==========================");

        Home();
        System.out.println("Back to homepage");







    }
}
