package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Programming_Module extends Base {

    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By SatPreparation_ResultsHeader = By.xpath("//h1[text()='7 results for \"sat preparation\"']");
    public static By SatPreparation_CourseLink = By.xpath("//a[@href='/courses/sat-preparation']");
    public static By NextSwipe_button = By.xpath("//div[contains(@class,'swiper-button-next')]");
    public static By SatPreparation_Title = By.xpath("//p[text()='Self Paced']//following-sibling::p[text()='SAT Preparation']");
    public static By SatPreparation_Link = By.xpath("//p[text()='SAT Preparation']");

    public static By SatPreparation_CourseLinkParent = By.xpath("//a[@href='/courses/sat-preparation']/parent::div");

    public static By nextSwipeButton = By.xpath("//div[contains(@class,'swiper-button-next')]");

    public static By Programme_CourseLink = By.xpath("//a[@href='/courses/programmingprogramming']");

    public static By Programme_CourseLink_Parent = By.xpath("//a[@href='/courses/programmingprogramming']/parent::div");

    public static By Programme_Results_Header = By.xpath("//h1[text()='122 results for \"Programming\"']");

    public static By VirtualSessions_CourseLink = By.xpath("//p[text()='Virtual Sessions Course']//parent::a");

    public static By VirtualSessionsCourse_Title = By.xpath("//p[text()='Technology 1']//following-sibling::p[text()='Virtual Sessions Course']");

    public static By Course_Information = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='Course Information']");

    public static By AboutTheCourse = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='About the Course']");


    public static void ValidateClickOnHome(WebDriver driver) {
        driver.findElement(homePageLink).click();
    }

    public static void ValidateClickOnProgrammeCourse() {
        WebElement Pgmcourselink = driver.findElement(Programme_CourseLink);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(Pgmcourselink.isDisplayed(), "Programming CourseLink Navigated to Results Header.");

        ClickOnTabLink(driver, Programme_CourseLink_Parent, nextSwipeButton);
        Pgmcourselink.click();
    }

    public static void ValidateProgrammeResult_Header() {
        WebElement Pgmresult1 = driver.findElement(Programme_Results_Header);
        Assert.assertTrue(Pgmresult1.isDisplayed(), "117 results for Programming Header is Display.");
    }

    public static void ValidateVirtualSessions_Course(WebDriver driver) {
        driver.findElement(VirtualSessions_CourseLink).click();
    }

    public static void ValidateVirtualSessionsCourse_Title() {
        WebElement Virtualsession_title = driver.findElement(VirtualSessionsCourse_Title);
        Assert.assertTrue((Virtualsession_title.isDisplayed()), "Virtual Sessions Course Title is Display.");

    }

    public static void ValidateCourse_Information() {
        WebElement CourseInformation_Header = driver.findElement(Course_Information);
        Assert.assertTrue(CourseInformation_Header.isDisplayed(), "Course Information Header is Display.");
    }

    public static void ValidateAboutTheCourse() {
        WebElement AboutCourse_title = driver.findElement(AboutTheCourse);
        Assert.assertTrue(AboutCourse_title.isDisplayed(), "About the Course is Display.");
    }

    public static void Validate_SatPreparationResultsHeader() {
        WebElement SatPrepHeader = driver.findElement(SatPreparation_ResultsHeader);
        Assert.assertTrue(SatPrepHeader.isDisplayed(), "7 Results For Sat preparation is Displayed.");
    }

    public static void ClickOn_SatPreparationLink(WebDriver driver) {
        WebElement SatPrepLink = driver.findElement(SatPreparation_Link);
        Assert.assertTrue(SatPrepLink.isDisplayed(), "Sat Preparation Link Navigated to Sat Preparation Title.");
        SatPrepLink.click();
    }

    public static void Validate_SatPreparationTitle() {
        WebElement SatPrep_Title = driver.findElement(SatPreparation_Title);
        Assert.assertTrue(SatPrep_Title.isDisplayed(), "7 Results For Sat preparation is Displayed.");
    }

    public static void Validate_Course_Information() {
        WebElement CourseInfoHeader = driver.findElement(Course_Information);
        Assert.assertTrue(CourseInfoHeader.isDisplayed(), "Course Information is Displayed.");
    }

    public static void Validate_AboutTheCourse() {
        WebElement AboutTheCourseHeader = driver.findElement(AboutTheCourse);
        Assert.assertTrue(AboutTheCourseHeader.isDisplayed(), "About The Course Information is Displayed.");
    }

    public static void ClickOn_SatPreparationCourselink(WebDriver driver) {
        WebElement SatCourseLink = driver.findElement(SatPreparation_CourseLink);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(SatCourseLink.isDisplayed(), "Sat Preparation Navigated to Sat Preparation Results.");
        ClickOnTabLink(driver, SatPreparation_CourseLinkParent, NextSwipe_button);
        SatCourseLink.click();
    }

    public static void ClickOnTabLink(WebDriver driver, By satPreparationCourseLinkParent, By nextSwipeButton) {
        int counter = 100;
        while (counter > 0) {

            WebElement parent = driver.findElement(satPreparationCourseLinkParent);
            String class_info = parent.getAttribute("class").toLowerCase();
            if (class_info.contains("swiper-slide-next")) {
                break;
            }
            WebElement nextButton = driver.findElement(nextSwipeButton);

            if (nextButton.getAttribute("class").contains("swiper-button-disabled")) {
                // Reached At end of list
                break;
            } else {
                nextButton.click();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter--;
        }
    }

}


