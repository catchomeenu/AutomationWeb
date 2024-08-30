package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class KidsInfyni extends Base {
    public static By homelink=By.xpath("//span[text()='Home']");
    public static By Click_Kids=By.xpath("//span[text()='Kids']");
    public static By click_CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By select_CompletedEnrolment=By.xpath("//label[text()='Completed']");
    public static By Validate_KidsCourseTitle=By.xpath("//h1[contains(text(),'Kids')]");
    public static By Select_KidsCourse=By.xpath("//p[text()='Robotic Car Games']");
    public static By ValidateSelected_KidsCourseTitle=By.xpath("//p[text()='Robotic Car Games']");




    public static void click_home() {

        try {
            driver.findElement(homelink).click();
            System.out.println("Navigating to Homepage");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickKids()
    {
        try {
            driver.findElement(Click_Kids).click();
            System.out.println("Kids course is clicked");
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
    public static void selectCompletedEnrolment()
    {
        try {
            driver.findElement(select_CompletedEnrolment).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateKidsCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_KidsCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectKidsCourse()
    {

        try {
            driver.findElement(Select_KidsCourse).click();
            System.out.println("Selecting Robotic Car Games course");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedKidsCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_KidsCourseTitle).isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }





}
