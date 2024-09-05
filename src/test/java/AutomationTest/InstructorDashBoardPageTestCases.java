package AutomationTest;

import Automation.pageobjects.InstructorDashBoardLive;
import org.testng.annotations.Test;

public class InstructorDashBoardPageTestCases extends InstructorDashBoardLive {

    @Test(priority = 83)
    public static void createNewLiveCourse_Details_Instructor() {
        clickLiveCoursesLink();
        clickNewCourseLink();
        verifyNewCourseRadioButton();
        enterNewCourseName("Clinical SAS");
        selectImage("C:\\Users\\ramya\\Desktop\\sasImage.png");
        enterNewCourseDescription("SAS stands for Statistical Analysis Software. It was created in the year 1960 by the SAS Institute.SAS was used for data management, business intelligence, Predictive Analysis, Descriptive and Prescriptive Analysis etc.With the introduction of JMP (Jump) for statistics SAS took advantage of the Graphical user Interface which was introduced by the Macintosh. Jump is basically used for the applications like Six Sigma, designs, quality control and engineering and scientific analysis.SAS is platform independent which means you can run SAS on any operating system either Linux or Window.");
        selectCategory("Technology");
        selectSubCategory("Technology Course");
        selectDegree("Intermediate");
        selectCourseType("Paid");
        selectCourseStructure("One-time");
        selectStartDate("September 2024", "20");
        selectEndDate("October 2024", "20");
        selectEnrollmentStartDate("September 2024", "10");
        selectEnrollmentEndDate("September 2024", "18");
        selectDemoCheckBox();
        enterDuration("30");
        selectCurrency("USD");
        enterPrice("150");
        clickSave_Next();
       // clickYesForDemo();
    }
        @Test(priority = 84)
        public static void createNewLiveCourse_Prerequisites_Instructor() {
            enterPrerequisites("Understand and use the fundamentals of the SAS programming language");
            clickAddButton();
            clickSaveButton();
        }

      @Test(priority = 85)
       public static void createNewLiveCourse_WhatYouWillLearn_Instructor() {
          enterWhatYouWillLearn("Access different types of data (SAS, Excel, or text) then explore and prepare the data ");
          clickAddButton();
          clickSaveButton();

      }
    @Test(priority = 86)
    public static void createNewLiveCourse_Topics_Instructor() {
        enterTopic("Analyze and report on data and export results to different Formats");
        enterSubTopic("Formats into (HTML, PDF, Excel)");
        addSubTopic();
        enterSubtopicDuration_Hours("01");
        enterSubtopicDuration_Minutes("15");
        addTopicDuration();
        clickSaveButton();

    }
    @Test(priority = 87)
    public static void createNewLiveCourse_Sessions_SelectAllDay() {
        enterSessionName("ClinicalSAS");
        selectSessionStartDate("September 2024", "20");
        selectAllDay();
        //enterSessionFromTimeHours("06");
        // enterSessionFromTimeMinutes("15");
        // selectSessionFromTimeClock("PM");
        // enterSessionToTimeHours("07");
        //  enterSessionToTimeMinutes("15");
        //selectSessionToTimeClock("PM");
        selectTimeZone("America/Chicago");
        selectRecurrence();
        selectUntilCourseEndDate();
        //selectSessionEndDate("October 2024", "19");
        clickSessionAddButton();
        clickApprovalButton();
    }


       // @Test(priority = 87)
        public static void createNewLiveCourse_Sessions_Instructor_SelectSpecificHours() {
            enterSessionName("ClinicalSAS");
            selectSessionStartDate("September 2024", "20");
            //selectAllDay();
            enterSessionFromTimeHours("06");
            enterSessionFromTimeMinutes("15");
           // selectSessionFromTimeClock("PM");
            enterSessionToTimeHours("07");
            enterSessionToTimeMinutes("15");
            //selectSessionToTimeClock("PM");
            selectTimeZone("America/Chicago");
            selectRecurrence();
            // selectUntilCourseEndDate();
            selectSessionEndDate("October 2024", "19");
            clickSessionAddButton();
            clickApprovalButton();
            System.out.println("****login as Instructor Dashboard Live Course TestCases Ended**** ");
            System.out.println("****login as Instructor Dashboard Video Course TestCases Started**** ");

        }

    }

