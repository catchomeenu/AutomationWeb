package AutomationTest;

import Automation.pageobjects.InstructorDashBoardPage;
import org.testng.annotations.Test;

public class InstructorDashBoardPageTestCases extends InstructorDashBoardPage
{

    @Test(priority = 15)
    public static void createNewCourse_Instructor()  {
        clickLiveCoursesLink();
        clickNewCourseLink();
        verifyNewCourseRadioButton();
        enterNewCourseName("Devops");
        //selectImage("C:\\Users\\ramya\\Desktop\\devops_pic.png");
        enterNewCourseDescription("DevOps is a methodology in the software development and IT industry. Used as a set of practices and tools, DevOps integrates and automates the work of software development (Dev) and IT operations (Ops) as a means for improving and shortening the systems development life cycle. DevOps is complementary to agile software development; several DevOps aspects came from the agile way of working. Automation is an important part of DevOps. Software programmers and architects should use \"fitness functions\" to keep their software in check.");
        selectCategory();
        selectSubCategory();
        selectDegree();
        selectCourseType();
        selectCourseStructure();
        selectStartDate("July 2024","20");
        selectEndDate("August 2024","20");
        selectEnrollmentStartDate("July 2024","5");
        selectEnrollmentEndDate("July 2024","15");
        enterDuration("1");
        selectCurrency();
        //enterPrice("150");
        clickSave_Next();

    }
}
