package AutomationTest;

import Automation.pageobjects.HeaderLink;
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


        @Test(priority = 2)
        public static void click_businessAnalyticsimage() {

            click_linkImage("Business Analytics - Data Driven Decision Making");
            System.out.println("Business Analytics - Data Driven Decision Making is clicked as expected");
        }

        @Test(priority = 3)
        public static void verify_businessAnalyticsimagename()  {
            boolean actualtext= verify_linkimage("Business Analytics - Data Driven Decision Making");
            boolean expectedText=true;
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Business Analytics - Data Driven Decision Making is displayed as expected");
        }


        @Test(priority = 4)
        public static void verify_businessAnalyticscourseinformation()  {
            String actualtext= verify_Courseinfm();
            String expectedText="Course Information";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Course Information is displayed as expected");
        }

        @Test(priority = 5)
        public static void verify_businessAnalyticsabtthecourse() {
            String actualtext= verify_abttheCourse();
            String expectedText="About the Course";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("About the course is displayed as expected");
        }

        @Test(priority = 6)
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

        @Test(priority = 7)
        public static void click_modificationimage()  {

            click_linkImage("Python");
            System.out.println("Python is clicked as expected");
        }

        @Test(priority = 8)
        public static void verify_modificationimagename()  {
            boolean actualtext= verify_linkimage("Python");
            boolean expectedText=true;
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Python is displayed as expected");
        }


        @Test(priority = 9)
        public static void verify_modificationcourseinformation() {
            String actualtext= verify_Courseinfm();
            String expectedText="Course Information";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Course Information is displayed as expected");
        }

        @Test(priority = 10)
        public static void verify_modificationabtthecourse() {
            String actualtext= verify_abttheCourse();
            String expectedText="About the Course";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("About the course is displayed as expected");
        }

        @Test(priority = 11)
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


        @Test(priority = 12)
        public static void click_indianclassicalmusicimage()  {

            click_linkImage("Piano course for Kids - I");
            System.out.println("Piano course for Kids - I is clicked as expected");
        }

        @Test(priority = 13)
        public static void verify_indianclassicalmusicimagename()  {
            boolean actualtext= verify_linkimage("Piano course for Kids - I");
            boolean expectedText=true;
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Piano course for Kids - I is displayed as expected");
        }


        @Test(priority = 14)
        public static void verify_indianclassicalmusiccourseinformation() {
            String actualtext= verify_Courseinfm();
            String expectedText="Course Information";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Course Information is displayed as expected");
        }

        @Test(priority = 15)
        public static void verify_indianclassicalmusicabtthecourse()  {
            String actualtext= verify_abttheCourse();
            String expectedText="About the Course";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("About the course is displayed as expected");
        }
        @Test(priority = 16)
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


        @Test(priority = 17)
        public static void click_machineLearningimage()  {

            click_linkImage("Price Lakhs Course");
            System.out.println("Price Lakhs Course  is clicked as expected");
        }

        @Test(priority = 18)
        public static void verify_machineLearningimagename()  {
            boolean actualtext= verify_linkimage("Price Lakhs Course");
            boolean expectedText=true;
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Price Lakhs Course is displayed as expected");
        }


        @Test(priority = 19)
        public static void verify_machineLearningcourseinformation()  {
            String actualtext= verify_Courseinfm();
            String expectedText="Course Information";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Course Information is displayed as expected");
        }

        @Test(priority = 20)
        public static void verify_machineLearningabtthecourse()  {
            String actualtext= verify_abttheCourse();
            String expectedText="About the Course";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("About the course is displayed as expected");
        }
        @Test(priority = 21)
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


        @Test(priority = 22)
        public static void click_technologyawarenesimage()  {

            click_linkImage("Data Science & Introduction to Machine Learning test");
            System.out.println("Data Science & Introduction to Machine Learning test is clicked as expected");
        }

        @Test(priority = 23)
        public static void verify_technologyawarenesimagename()  {
            boolean actualtext= verify_linkimage("Data Science & Introduction to Machine Learning test");
            boolean expectedText=true;
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Data Science & Introduction to Machine Learning test is displayed as expected");
        }


        @Test(priority = 24)
        public static void verify_technologyawarenescourseinformation() {
            String actualtext= verify_Courseinfm();
            String expectedText="Course Information";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("Course Information is displayed as expected");
        }

        @Test(priority = 25)
        public static void verify_technologyawarenesabtthecourse()  {
            String actualtext= verify_abttheCourse();
            String expectedText="About the Course";
            SoftAssert sa=new SoftAssert();
            sa.assertEquals(actualtext,expectedText);
            sa.assertAll();
            System.out.println("About the course is displayed as expected");
        }
    }

