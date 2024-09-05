package AutomationTest;

import Automation.pageobjects.HomepageHeaderLinks;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HomepageHeaderLinksTestCases extends HomepageHeaderLinks {

    @Test(priority = 8)
    public static void click_businessanalytics() {

        click_home();
        click_LinkValues("Business Analytics");
        boolean actualtext= verify_LinkValues("business analytics");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Business Analytics is displayed as expected");
    }


    @Test(priority = 9)
    public static void click_businessAnalyticsimage() {

        click_linkImage("Business Analytics - Data Driven Decision Making");
        System.out.println("Business Analytics - Data Driven Decision Making is clicked as expected");
    }

    @Test(priority = 10)
    public static void verify_businessAnalyticsimagename()  {
        boolean actualtext= verify_linkimage("Business Analytics - Data Driven Decision Making");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Business Analytics - Data Driven Decision Making is displayed as expected");
    }


    @Test(priority = 11)
    public static void verify_businessAnalyticscourseinformation()  {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 12)
    public static void verify_businessAnalyticsabtthecourse() {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }

    @Test(priority = 13)
    public static void click_modification()  {

        click_home();
        click_LinkValues("Modification");
        boolean actualtext= verify_LinkValues("modification");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Modification is displayed as expected");
    }

    @Test(priority = 14)
    public static void click_modificationimage()  {

        click_linkImage("Python");
        System.out.println("Python is clicked as expected");
    }

    @Test(priority = 15)
    public static void verify_modificationimagename()  {
        boolean actualtext= verify_linkimage("Python");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Python is displayed as expected");
    }


    @Test(priority = 16)
    public static void verify_modificationcourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 17)
    public static void verify_modificationabtthecourse() {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }

    @Test(priority = 18)
    public static void click_indianclassicalmusic()  {

        click_home();
        click_LinkValues("Indian Classical Music");
        boolean actualtext= verify_LinkValues("indian classical music");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Indian Classical Music is displayed as expected");
    }


    @Test(priority = 19)
    public static void click_indianclassicalmusicimage()  {

        click_linkImage("Piano course for Kids - I");
        System.out.println("Piano course for Kids - I is clicked as expected");
    }

    @Test(priority = 20)
    public static void verify_indianclassicalmusicimagename()  {
        boolean actualtext= verify_linkimage("Piano course for Kids - I");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Piano course for Kids - I is displayed as expected");
    }


    @Test(priority = 21)
    public static void verify_indianclassicalmusiccourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 22)
    public static void verify_indianclassicalmusicabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }
    @Test(priority = 23)
    public static void click_machineLearning()  {

        click_home();
        click_LinkValues("Machine Learning");
        boolean actualtext= verify_LinkValues("machine learning");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Machine Learning is displayed as expected");
    }


    @Test(priority = 24)
    public static void click_machineLearningimage()  {

        click_linkImage("Price Lakhs Course");
        System.out.println("Price Lakhs Course  is clicked as expected");
    }

    @Test(priority = 25)
    public static void verify_machineLearningimagename()  {
        boolean actualtext= verify_linkimage("Price Lakhs Course");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Price Lakhs Course is displayed as expected");
    }


    @Test(priority = 26)
    public static void verify_machineLearningcourseinformation()  {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 27)
    public static void verify_machineLearningabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }
    @Test(priority = 28)
    public static void click_technologyawareness()  {

        click_home();
        click_LinkValues("Technology Awareness");
        boolean actualtext= verify_LinkValues("technology awareness");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Technology Awareness is displayed as expected");
    }


    @Test(priority = 29)
    public static void click_technologyawarenesimage()  {

        click_linkImage("Data Science & Introduction to Machine Learning test");
        System.out.println("Data Science & Introduction to Machine Learning test is clicked as expected");
    }

    @Test(priority = 30)
    public static void verify_technologyawarenesimagename()  {
        boolean actualtext= verify_linkimage("Data Science & Introduction to Machine Learning test");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Data Science & Introduction to Machine Learning test is displayed as expected");
    }


    @Test(priority = 31)
    public static void verify_technologyawarenescourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 32)
    public static void verify_technologyawarenesabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }

    @Test(priority = 33)
    public static void click_divyasc()  {

        click_home();
        click_LinkValues("Divya SC");
        boolean actualtext= verify_LinkValues("Divya SC");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Divya SC is displayed as expected");
    }


    @Test(priority = 34)
    public static void click_divyascimage()  {

        click_linkImage("Divya-Video Course");
        System.out.println("Divya-Video Course is clicked as expected");
    }

    @Test(priority = 35)
    public static void verify_divyascimagename()  {
        boolean actualtext= verify_linkimage("Divya-Video Course");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Divya-Video Course test is displayed as expected");
    }


    @Test(priority = 36)
    public static void verify_divyasccourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 37)
    public static void verify_divyascabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }

    @Test(priority = 38)
    public static void click_guitarpaino()  {

        click_home();
        click_LinkValues("Guitar Paino");
        boolean actualtext= verify_LinkValues("Guitar Paino");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Guitar Paino is displayed as expected");
    }


    @Test(priority = 39)
    public static void click_guitarpainoimage()  {

        click_linkImage("KB accounting Video course");
        System.out.println("KB accounting Video course is clicked as expected");
    }

    @Test(priority = 40)
    public static void verify_guitarpainoimagename()  {
        boolean actualtext= verify_linkimage("KB accounting Video course");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("KB accounting Video course is displayed as expected");
    }


    @Test(priority = 41)
    public static void verify_guitarpainocourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 42)
    public static void verify_guitarpainoabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }

     @Test(priority = 43)
    public static void click_itcertification()  {

        click_home();
        click_LinkValues("IT Certification");
        boolean actualtext= verify_LinkValues("IT Certification");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("IT Certification is displayed as expected");
    }


    @Test(priority = 44)
    public static void click_itcertificationimage()  {

        click_linkImage("Email Notification - For Testing on Dev");
        System.out.println("Email Notification - For Testing on Dev is clicked as expected");
    }

     @Test(priority = 45)
    public static void verify_itcertificationname()  {
        boolean actualtext= verify_linkimage("Email Notification - For Testing on Dev");
        boolean expectedText=true;
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Email Notification - For Testing on Dev is displayed as expected");
    }


    @Test(priority = 46)
    public static void verify_itcertificationcourseinformation() {
        String actualtext= verify_Courseinfm();
        String expectedText="Course Information";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("Course Information is displayed as expected");
    }

    @Test(priority = 47)
    public static void verify_itcertificationabtthecourse()  {
        String actualtext= verify_abttheCourse();
        String expectedText="About the Course";
        SoftAssert sa=new SoftAssert();
        sa.assertEquals(actualtext,expectedText);
        sa.assertAll();
        System.out.println("About the course is displayed as expected");
    }
    //Swathini Testcases

    @Test(priority = 48)
    public static void HealthBeauty() {
        click_home();
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
    @Test(priority = 49)
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
    @Test(priority = 50)
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

    //@Test(priority = 44)
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
    @Test(priority = 51)
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
    @Test(priority = 52)
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
    @Test(priority = 53)
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
    @Test(priority = 54)
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

    //priya Testcases
    @Test( priority = 55)
    public void ProgrammingTestCases() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Programming", driver);
        //Validate_CourseResults_Header("Programming");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

   /* @Test(priority = 50)
    public static void validateSatPreparation() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("SAT Preparation", driver);
        Validate_CourseResults_Header("sat preparation");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }*/

    @Test( priority = 56)
    public void PersonalDevelopmentCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Personal Development", driver);
        //Validate_CourseResults_Header("Personal Development");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test( priority = 57)
    public void ComputerScienceCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("ComputerScience", driver);
       // Validate_CourseResults_Header("computerscience");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test(priority = 58)
    public void NaturalLanguageProcess() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Natural Language Processing", driver);
        //Validate_CourseResults_Header("natural language processing");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test( priority = 59)
    public void TestPrepeCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("TestPrepe", driver);
       // Validate_CourseResults_Header("testprepe");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test( priority = 60)
    public void TestOthersCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Others", driver);
       // Validate_CourseResults_Header("others");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
    }

    @Test( priority = 61)
    public void ElectricalengineeringCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Electrical Engineering", driver);
       // Validate_CourseResults_Header("electrical engineering");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(priority = 62)
    public void JavaCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("java", driver);
        //Validate_CourseResults_Header("java");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();

    }

    @Test(priority = 63)
    public void FactCheckingVerificationCourseCheck() {
        ValidateClickOnHome(driver);
        ClickOn_CourseLinkOnTop("Fact-Checking and Verification", driver);
        //Validate_CourseResults_Header("fact-checking and verification");
        ClickOnFirstCourseLinkAndValidate();
        Validate_CourseTitleDisplayed();
        click_home();
        driver.navigate().refresh();
        System.out.println("***HomePage Header Links TestCases Completed***");
        System.out.println("***HomePage Footer Links TestCases Started***");
    }


}

