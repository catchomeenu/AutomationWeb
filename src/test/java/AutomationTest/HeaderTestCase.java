package AutomationTest;

import Automation.pageobjects.Header;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HeaderTestCase extends Header {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }


    @Test(priority = 1)
    public static void HealthBeauty() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Health and Beauty")) {
            HeaderLink("Health and Beauty");

            System.out.println("Navigating to Health and Beauty");

            boolean actualresult = HBValidation();
            boolean expectedresult = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(actualresult, expectedresult);// using soft assert
            sa.assertAll();
            System.out.println("Health and Beauty Title presence verified");
            SelectCourse("Yoga Everyday - UAT");
            boolean titleresult = CoursesTitle("Yoga Everyday - UAT");
            boolean expectedtitle = true;
            sa.assertEquals(titleresult, expectedtitle);// using soft assert
            sa.assertAll();
            System.out.println("Navigating to HB course and Title presence verified");

            String actual1result_info = CourseInfo();
            String expectedresult_info = "Course Information";

            sa.assertEquals(actual1result_info, expectedresult_info);// using soft assert
            sa.assertAll();
            System.out.println("HB course Info verified");

            String actualresult_about = CourseAbout("About the Course");
            String expectedresult_about = "About the Course";

            sa.assertEquals(actualresult_about, expectedresult_about);// using soft assert
            sa.assertAll();
            System.out.println("HB course About verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }
    @Test(priority = 2)
    public static void MusicTheory() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Music Theory")) {
            HeaderLink("Music Theory");
            System.out.println("Navigating to  Music and Theory");

            boolean pageRes = MusictheoryPage();
            boolean expectedpage_result = true;
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(pageRes, expectedpage_result);// using soft assert
            sa.assertAll();
            System.out.println("MusicTheory  Title presence verified");
            SelectCourse("KB video Course - July 31");
            boolean MTtitleresult = CoursesTitle("KB video Course - July 31");
            boolean MTexpectedtitle = true;
            sa.assertEquals(MTtitleresult, MTexpectedtitle);// using soft assert
            sa.assertAll();
            System.out.println("Navigating to MusicTheory course and Title presence verified");


            String infoRes = CourseInfo();
            String expectedinfo_result = "Course Information";
            sa.assertEquals(infoRes, expectedinfo_result);// using soft assert
            sa.assertAll();
            System.out.println("MusicTheory course Info verified");

            String aboutRes = CourseAbout("About the Course");
            String expectedabout_result = "About the Course";
            sa.assertEquals(aboutRes, expectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("MusicTheory About the Course verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }
    @Test(priority = 3)
    public static void TestPrepe() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Test Prepe")) {
            HeaderLink("Test Prepe");
            System.out.println("Navigating to Test Prepe");
            String PageVal = pageValidatoin("test prepe");
            String ExpecPageVal = "test prepe";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(PageVal, ExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("Test Prepe title verified");
            SelectCourse("advertising");
            System.out.println("Navigating to Test Prepecourse");
            boolean TPtitleresult = CoursesTitle("Self Paced");
            boolean TPexpectedtitle = true;
            sa.assertEquals(TPtitleresult, TPexpectedtitle);// using soft assert
            sa.assertAll();
            System.out.println("Test Prepecourse Title verified");
            String TPinfoRes = CourseInfo();
            String TPexpRes = "Course Information";
            sa.assertEquals(TPinfoRes, TPexpRes);// using soft assert
            sa.assertAll();
            System.out.println("Test Prepecourse Info verified");

            String TPaboutRes = CourseAbout("About the Course");
            String TPexpectedabout_result = "About the Course";
            sa.assertEquals(TPaboutRes, TPexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("Test Prepe About the Course verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }

    @Test(priority = 4)
    public static void Games() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Test Prepe")) {
            HeaderLink("Games");
            System.out.println("Navigating to  Games");
            String GamePageVal = pageValidatoin("games");
            String GameExpecPageVal = "games";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(GamePageVal, GameExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("Games title verified");
            SelectCourse("Python");
            System.out.println("Navigating to Gamescourse");
            boolean Gamestitleresult = CoursesTitle("Python");
            boolean Gamesexpectedtitle = true;
            sa.assertEquals(Gamestitleresult, Gamesexpectedtitle);// using soft assert
            sa.assertAll();
            System.out.println("Games course Title verified");
            String GamesinfoRes = CourseInfo();
            String GamesexpRes = "Course Information";
            sa.assertEquals(GamesinfoRes, GamesexpRes);// using soft assert
            sa.assertAll();
            System.out.println("Games course Info verified");

            String GamesaboutRes = CourseAbout("About the Course");
            String Gamesexpectedabout_result = "About the Course";
            sa.assertEquals(GamesaboutRes, Gamesexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("Games About the Course verified");
            System.out.println("==========================");
        }
        else{
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");

    }
    @Test(priority = 5)
    public static void Hobbies() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Hobbies")) {
            HeaderLink("Hobbies");
            System.out.println("Navigating to  Hobbies");
            String HobbyPageVal = pageValidatoin("hobbies");
            String HobbyExpecPageVal = "hobbies";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(HobbyPageVal, HobbyExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("Hobbies Title verified");
            SelectCourse("Sample Video Course");
            System.out.println("Navigating to Hobbiescourse");
            boolean Hobbytitleresult = CoursesTitle("Sample Video Course");
            boolean Hobbyexpectedtitle = true;
            sa.assertEquals(Hobbytitleresult, Hobbyexpectedtitle);// using soft assert
            sa.assertAll();
            System.out.println("Sample Video Course course Title verified");
            String HobbyinfoRes = CourseInfo();
            String HobbyexpRes = "Course Information";
            sa.assertEquals(HobbyinfoRes, HobbyexpRes);// using soft assert
            sa.assertAll();
            System.out.println("Sample Video Course course Info verified");

            String HobbyaboutRes = CourseAbout("About the Course");
            String Hobbyexpectedabout_result = "About the Course";
            sa.assertEquals(HobbyaboutRes, Hobbyexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("Sample Video Course About  verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not avilable");
        }
        Home();
        System.out.println("Back to homepage");

    }
    @Test(priority = 6)
    public static void FactChecking() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Fact-Checking and Verification")) {
            HeaderLink("Fact-Checking and Verification");
            System.out.println("Navigating to    Fact-Checking and Verification");
            String FactPageVal = pageValidatoin("fact-checking and verification");
            String FactExpecPageVal = "fact-checking and verification";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(FactPageVal, FactExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("Fact-Checking and Verification page  Title verified");
            SelectCourse("New Thoughts - free");
            System.out.println("Navigating to New Thoughts - free");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            boolean Facttitleresult = CoursesTitle("New Thoughts - free");
            boolean Factexpectedtitle = true;
            sa.assertEquals(Facttitleresult, Factexpectedtitle);// using soft assert
            sa.assertAll();
            implicitWait(40);
            System.out.println("New Thoughts - free Title verified");
            String FactinfoRes = CourseInfo();
            String FactexpRes = "Course Information";
            sa.assertEquals(FactinfoRes, FactexpRes);// using soft assert
            sa.assertAll();
            System.out.println("New Thoughts course Info verified");

            String FactaboutRes = CourseAbout("About the Course");
            String Factexpectedabout_result = "About the Course";
            sa.assertEquals(FactaboutRes, Factexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("New Thoughts About the Course verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }
    @Test(priority = 7)
    public static void Coding() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Coding")) {
            HeaderLink("Coding");
            System.out.println("Navigating to Coding");
            String FactPageVal = pageValidatoin("coding");
            String FactExpecPageVal = "coding";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(FactPageVal, FactExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("codingpage  Title verified");
            SelectCourse("Java for beginners");
            System.out.println("Navigating to Java for beginners");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            boolean Facttitleresult = CoursesTitle("Java for beginners");
            boolean Factexpectedtitle = true;
            sa.assertEquals(Facttitleresult, Factexpectedtitle);// using soft assert
            sa.assertAll();
            implicitWait(40);
            System.out.println("Java for beginners Title verified");
            String FactinfoRes = CourseInfo();
            String FactexpRes = "Course Information";
            sa.assertEquals(FactinfoRes, FactexpRes);// using soft assert
            sa.assertAll();
            System.out.println("Java for beginners course Info verified");

            String FactaboutRes = CourseAbout("About the Course");
            String Factexpectedabout_result = "About the Course";
            sa.assertEquals(FactaboutRes, Factexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("Java for beginners About the Course verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }
    @Test(priority =8)
    public static void DanceStyles() {
        String ListVal= String.valueOf(list());

        if(ListVal.contains("Dance Styles")) {
            HeaderLink("Dance Styles");
            System.out.println("Navigating to Dance Styles");
            String FactPageVal = pageValidatoin("dance styles");
            String FactExpecPageVal = "dance styles";
            SoftAssert sa = new SoftAssert();
            sa.assertEquals(FactPageVal, FactExpecPageVal);// using soft assert
            sa.assertAll();
            System.out.println("Dance styles  Title verified");
            SelectCourse("zumba 11");
            System.out.println("Navigating to zumba 11");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            boolean Facttitleresult = CoursesTitle("zumba 11");
            boolean Factexpectedtitle = true;
            sa.assertEquals(Facttitleresult, Factexpectedtitle);// using soft assert
            sa.assertAll();
            implicitWait(40);
            System.out.println("Zumba 11 Title verified");
            String FactinfoRes = CourseInfo();
            String FactexpRes = "Course Information";
            sa.assertEquals(FactinfoRes, FactexpRes);// using soft assert
            sa.assertAll();
            System.out.println("Zumba 11 course Info verified");

            String FactaboutRes = CourseAbout("About the Course");
            String Factexpectedabout_result = "About the Course";
            sa.assertEquals(FactaboutRes, Factexpectedabout_result);// using soft assert
            sa.assertAll();
            System.out.println("Zumba 11 About the Course verified");
            System.out.println("==========================");
        }
        else {
            System.out.println("Link is not available");
        }
        Home();
        System.out.println("Back to homepage");
    }



}

