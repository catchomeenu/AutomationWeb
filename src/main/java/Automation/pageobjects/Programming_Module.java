package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Programming_Module extends Base {

    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By nextSwipeButton = By.xpath("//div[contains(@class,'swiper-button-next')]");
    public static By Course_Information = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='Course Information']");
    public static By AboutTheCourse = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='About the Course']");
    public static By PreviousLinkButton = By.xpath("//div[contains(@class,'swiper-button-prev')]");
    public static By courseTypeHeader = By.xpath("//div[contains(@class,'courseDetails_abCourse__aT_MD')]//p[not(contains(@class,'lg:text'))]");
    public static By courseTitleHeader = By.xpath("//div[contains(@class,'courseDetails_abCourse__aT_MD')]//p[contains(@class,'lg:text')]");

    public static By getResults_Headers(String courseName) {
        return By.xpath("//h1[contains(text(),'results for \"" + courseName + "\"')]");
    }

    public static void ValidateClickOnHome(WebDriver driver) {
        driver.findElement(homePageLink).click();
    }

    public static void ClickOn_CourseLinkOnTop(String courseName, WebDriver driver) {
        // move to left most link in header
        WebElement previousLinkButton = driver.findElement(PreviousLinkButton);
        do {
            if (previousLinkButton.getAttribute("class").toLowerCase().contains("swiper-button-disabled")) {
                break;
            } else {
                previousLinkButton.click();
            }
        } while (!previousLinkButton.getAttribute("class").toLowerCase().contains("swiper-button-disabled"));
        // Wait for 2 seconds
        waitMethod(2000);
        // Move to Right And Click on Expected Link
        By parentLink = By.xpath("//p[text()='" + courseName + "']/ancestor::a[contains(@href,'/course')]//ancestor::div[contains(@class,'swiper-slide')]");
        By CourseLink = By.xpath("//p[text()='" + courseName + "']/ancestor::a[contains(@href,'/course')]");
        ClickOnTabLink(driver, parentLink, CourseLink);

    }

    public static void ClickOnTabLink(WebDriver driver, By parentLink, By CourseLink) {
        int counter = 100;
        while (counter > 0) {
            // Parent Check for Class to have Slide Next Property to get it visible
            WebElement parent = driver.findElement(parentLink);
            String class_info = parent.getAttribute("class").toLowerCase();
            if (class_info.contains("swiper-slide-next")) {
                // Click on the Link for Course
                driver.findElement(CourseLink).click();
                waitMethod(500);
                break;
            }
            // If Slide Next is not in property click on next button
            WebElement nextButton = driver.findElement(nextSwipeButton);

            if (nextButton.getAttribute("class").contains("swiper-button-disabled")) {
                // Reached At end of list
                // Click on the Link for Course
                driver.findElement(CourseLink).click();
                waitMethod(500);
                break;
            } else {
                nextButton.click();
            }
            waitMethod(500);
            counter--;
        }
    }

    // Validate Searched for Course
    public static void Validate_CourseResults_Header(String courseName) {
        By results_headers = getResults_Headers(courseName);
        WebElement headerElement = driver.findElement(results_headers);
        Assert.assertTrue(headerElement.isDisplayed(), "Course Results Header is Displayed.");
        System.out.println(headerElement.getText());
    }


    public static void ClickOnFirstCourseLinkAndValidate() {
        By firstLink = By.xpath("//div[contains(@class,'CourseData_four__qc_On') and contains(@class,'most-recent-card')]//a[contains(@href,'/course')]/p");
        WebElement CourseLink = driver.findElement(firstLink);
        Assert.assertTrue(CourseLink.isDisplayed(), "Course Link is Displayed.");
        String text = CourseLink.getText();
        CourseLink.click();
        System.out.println(text);
    }

    public static void Validate_CourseTitleDisplayed() {
        waitForElementToDisplayed(courseTitleHeader);
        WebElement CourseTitle = driver.findElement(courseTitleHeader);
        Assert.assertTrue(CourseTitle.isDisplayed(), "Course Title is Displayed.");
        WebElement CourseHeaderName = driver.findElement(courseTypeHeader);
        Assert.assertTrue(CourseHeaderName.isDisplayed(), "Course Header Name is Displayed.");
        WebElement CourseInformation = driver.findElement(Course_Information);
        Assert.assertTrue(CourseInformation.isDisplayed(), "Course Information is Displayed.");
        WebElement About_The_Course = driver.findElement(AboutTheCourse);
        Assert.assertTrue(About_The_Course.isDisplayed(), "About The Course Information is Displayed.");
        // Print All Messages
        System.out.println(CourseHeaderName.getText());
        System.out.println(CourseTitle.getText());
        System.out.println(CourseInformation.getText());
        System.out.println(About_The_Course.getText());
    }

    private static void waitForElementToDisplayed(By by) {
        WebElement element;
        for (int i = 0; i < 10; i++) {
            waitMethod(3000);
            try {
                element = driver.findElement(by);
                if (element.isDisplayed()) {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Waiting For Course Title");
            }
        }
    }

    public static void waitMethod(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


