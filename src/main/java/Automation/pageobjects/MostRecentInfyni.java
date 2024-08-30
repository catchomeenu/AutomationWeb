package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MostRecentInfyni extends Base {

    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By MostRecent = By.xpath("//span[text()='Most Recent']");
    public static By Course_Status = By.xpath("//p[text()='Course Status']");
    public static By SelectedEnrollmentOpen = By.xpath("//label[text()='Enrollment Open']");
    public static By MostRecentCourse_Header = By.xpath("//h1[text()='Most Recent']");
    public static By LiveCourse_Link = By.xpath("//p[text()='KB Monthly Live Course - Aug 5']");
    public static By ValidateCourse_Title = By.xpath("//p[text()='KB Monthly Live Course - Aug 5']//parent::p");
    public static By unSelectEnrollmentOpen = By.xpath("//label[text()='Enrollment Open']");

    public static void ClickOn_Home() {
        driver.findElement(homePageLink).click();
    }

    public static void ClickOn_MostRecent() {
        driver.findElement(MostRecent).click();
    }

    public static void Click_CourseStatus() {
        driver.findElement(Course_Status).click();
    }

    public static void SelectMostRecent_EnrollmentOpen() {
        WebElement Enrollopen_Click = driver.findElement(SelectedEnrollmentOpen);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(Enrollopen_Click.isDisplayed(), " Course Link Navigated to Most Recent Header");
        Enrollopen_Click.click();
    }

    public static void Validate_MostRecentCourse_Header() {
        WebElement Course_HeaderText = driver.findElement(MostRecentCourse_Header);
        Assert.assertTrue(Course_HeaderText.isDisplayed(), " Most Recent Header is Displayed");
    }

    public static void ClickOn_LiveCourse_Link() {
        WebElement LiveCourse_Click = driver.findElement(LiveCourse_Link);
        Assert.assertTrue(LiveCourse_Click.isDisplayed(), "KB Monthly Live Course - Aug 5 Navigated to course Title ");
        LiveCourse_Click.click();

    }

    public static void ValidateCourse_Title() {
        WebElement CourseTitle_Click = driver.findElement(ValidateCourse_Title);
        Assert.assertTrue(CourseTitle_Click.isDisplayed(), "KB Monthly Live Course - Aug 5 Navigated is Displayed");

    }

    public static void UnSelect_EnrollmentOpen() {
        driver.findElement(unSelectEnrollmentOpen).click();
    }
}
