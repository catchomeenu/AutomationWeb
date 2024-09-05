package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;


public class LiveCourses extends Base {

    public static By homeLivecourseslink=By.xpath("//a[@href='/']");
    public static By clickLiveCourses=By.xpath("//span[contains(text(),'Live Courses')]");
    public static By validateLiveCourses=By.xpath("//h1[contains(text(),'Live Courses')]");
    public static By selectCourseStatusDropdown=By.xpath("//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']");public static By selectLiveCoursesEnrollment=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By clickLiveCoursesCourse=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By validateLiveCourseTitle=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");


    public static void click_home() {

        try {
            driver.findElement(homeLivecourseslink).click();
            System.out.println("Navigated to home page");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void click_LiveCourses(){
        try{
            driver.findElement(clickLiveCourses).click();
            System.out.println("Live Courses is clicked");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void select_CourseStatusDropdown(){
        try{
            driver.findElement(selectCourseStatusDropdown).click();
            System.out.println("Course status dropdown is clicked");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void select_LiveCoursesEnrollment()
    {
        try{
            driver.findElement(selectLiveCoursesEnrollment).click();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validate_LiveCoursesPage(){
        boolean result=false;
        try {
            result= driver.findElement(validateLiveCourses).isDisplayed();
            System.out.println("Live Courses Text verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
    public static void click_LiveCoursesCourse(){
        try {
            driver.findElement(clickLiveCoursesCourse).click();
            System.out.println("Live Courses selected after clicking on Enrollment Open");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validate_LiveCoursesCourseTitle(){
        boolean result=false;
        try {
            result= driver.findElement(validateLiveCourseTitle).isDisplayed();
            System.out.println("KB Monthly Live Course - Aug 5 is verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
}


