package Automation.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FilterModulePage extends MostRecentPage {

    public static By filterCourseStatus = By.xpath("//p[text()='Course Status']");

    public static By EnrollOpen = By.xpath("//label[text()='Enrollment Open']");

    public static By CourseLink = By.xpath("//p[text()='Kb test video course']//parent::a");

    public static By CourseTitle = By.xpath("//p[text()='Kb test video course']");

    public static By CourseInformation = By.xpath("//h2[text()='Course Information']");

    public static By AboutTheCourse = By.xpath("//h2[text()='About the Course']");


    public static void ValidateClickOnHome() {
        driver.findElement(homePageLink).click();
    }

    public static void ValidateClickOnWebElement() {
        driver.findElement(mostRecentLink).click();
    }

    public static void ValidatefilterCourse() {
        WebElement FilterCourse_tab = driver.findElement(filterCourseStatus);
        Assert.assertTrue(FilterCourse_tab.isDisplayed(), "Filter By Course Status tab Displayed");
        FilterCourse_tab.click();
    }

    public static void ValidateEnrollOpen() {
        WebElement EnrollOpen_Click = driver.findElement(EnrollOpen);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(EnrollOpen_Click.isDisplayed(), "Enrollment Open Link Navigated to Technology Course Link");
        EnrollOpen_Click.click();

    }

    public static void ValidateCourseLink() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement CourseLink_Click = driver.findElement(CourseLink);
        Assert.assertTrue(CourseLink_Click.isDisplayed(), " Course Link Navigated to Course Title");
        CourseLink_Click.click();

    }

    public static void ValidateCourseTitle() {
        WebElement CourseTitleText = driver.findElement(CourseTitle);
        Assert.assertTrue(CourseTitleText.isDisplayed(), " Course Title Displayed");
    }

    public static void ValidateCourseInformation() {
        WebElement CourseInfoText = driver.findElement(CourseInformation);
        Assert.assertTrue(CourseInfoText.isDisplayed(), " Course Information Displayed");

    }

    public static void ValidateAboutTheCourse() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> AboutTheCourseText = driver.findElements(AboutTheCourse);
        WebElement AboutTheCourseText_Displayed = null;
        for (WebElement element : AboutTheCourseText) {
            if (element.isDisplayed()) {
                AboutTheCourseText_Displayed = element;
            }
        }
        assert AboutTheCourseText_Displayed != null;
        Assert.assertTrue(AboutTheCourseText_Displayed.isDisplayed(), " About the Course Information Displayed");


    }
}