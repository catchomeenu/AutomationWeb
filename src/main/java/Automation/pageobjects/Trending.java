package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class Trending extends Base {

    public static By homelink=By.xpath("//span[text()='Home']");
    public static By Click_Trending=By.xpath("//span[text()='Trending']");
    public static By click_CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By select_OpenEnrolment=By.xpath("//label[text()='Enrollment Open']");
    public static By Validate_TrendingCourseTitle=By.xpath("//p[contains(text(),'Trending')]");
    public static By Select_TrendingCourse=By.xpath("//p[text()='One time Discount Course 1']");
    public static By ValidateSelected_TrendingCourseTitle=By.xpath("//p[text()='One time Discount Course 1']");




    public static void click_home() {

        try {
            driver.findElement(homelink).click();
            System.out.println("Navigating to Homepage");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickTrending()
    {
        try {
            driver.findElement(Click_Trending).click();
            System.out.println("Trending course is clicked");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickCourseStatus()
    {
        try {
            driver.findElement(click_CourseStatus).click();
            System.out.println("Course Status is clicked ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void SelectTrendingEnrollment()
    {
        try {
            driver.findElement(select_OpenEnrolment).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateTrendingCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_TrendingCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectTrendingCourse()
    {

        try {
          driver.findElement(Select_TrendingCourse).click();
            System.out.println("Selecting One time Discount Course 1");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedTrendingCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_TrendingCourseTitle).isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }



}
