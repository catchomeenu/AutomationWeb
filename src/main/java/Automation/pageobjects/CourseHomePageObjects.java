package Automation.pageobjects;


import Automation.base.Base;
import org.openqa.selenium.By;

import static Automation.base.Base.driver;

public class CourseHomePageObjects extends Base {

    public static By liveCoursesLink = By.xpath("//span[text()='Live Courses']");
    public static By liveCoursesText = By.xpath("//h1[text()='Live Courses']");
    public static By homeButton = By.xpath("//span[text()='Home']");
    public static By courseStatusLink = By.xpath("//p[text()='Course Status']");
    public static By enrollmentClosedCheckBox = By.xpath("//label[text()='Enrollment Closed']");
    public static By testMonthlyCourseLink = By.xpath("//p[text()='Test Monthly Course']");
    public static By testMonthlyCourseText = By.xpath("//p[text()='Test Monthly Course']");


    public static void ClickLiveCourses() {

        try {
            driver.findElement(liveCoursesLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public static String CaptureLiveCourseText() {
        String actualText = driver.findElement(liveCoursesText).getText();
        return actualText;

    }

    public static void ClickCourseStatus() {

        try {
            driver.findElement(courseStatusLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public static void CheckEnrollmentClose() {

        try {
            driver.findElement(enrollmentClosedCheckBox).click();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }

    public static void ClickTestMonthlyCourse() {

        try {
            driver.findElement(testMonthlyCourseLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
    public static String CaptureTestMonthlyCourse() {
        String actualText = driver.findElement(testMonthlyCourseText).getText();
        return actualText;
    }
}
