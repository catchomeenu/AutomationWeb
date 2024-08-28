package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class VideoCourses extends Base {

    public static By homelink=By.xpath("//span[text()='Home']");
    public static By Click_VideoCourses=By.xpath("//span[text()='Video Courses']");
    public static By click_CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By select_EnrollmentClosed=By.xpath("//label[text()='Enrollment Closed']");
    public static By Validate_VideoCourseTitle=By.xpath("//h1[contains(text(),'Videos Courses')]");
    public static By Select_VideoCoursesCourse=By.xpath("//p[text()='Java Video Course For Beginners']");
    public static By ValidateSelected_VideoCoursesCourseTitle=By.xpath("//p[text()='Java Video Course For Beginners']");

    public static void click_home() {

        try {
            driver.findElement(homelink).click();
            System.out.println("Navigating to Homepage");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickVideoCourse()
    {
        try {
            driver.findElement(Click_VideoCourses).click();
            System.out.println("VideoCourses is clicked");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickCourseStatus()
    {
        try {
            driver.findElement(click_CourseStatus).click();
            System.out.println("Course Status is clicked");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void select_EnrollmentClosedCourses()
    {
        try {
            driver.findElement(select_EnrollmentClosed).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateVideoCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_VideoCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectVideoCoursesCourse()
    {

        try {
            driver.findElement(Select_VideoCoursesCourse).click();
            System.out.println("Selecting Java Video Course For Beginners");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedVideoCoursesCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_VideoCoursesCourseTitle).isDisplayed();
            System.out.println("Validated Course title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }


}
