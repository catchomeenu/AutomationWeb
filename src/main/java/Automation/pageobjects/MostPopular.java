package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class MostPopular extends Base
{
    public static By homelink=By.xpath("//span[text()='Home']");
    public static By clickMostPopular=By.xpath("//span[contains(text(),'Most Popular')]");
    public static By validateMostPopular=By.xpath("//h1[contains(text(),'Most Popular')]");
    public static By selectCourseStatusDropdown=By.xpath("//div[@class='MuiAccordionSummary-expandIconWrapper css-1fx8m19']");
    public static By selectMostPopularEnrollment=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By clickMostPopularCourse=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By validateMostPopularCourseTitle=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");


    public static void click_home() {

        try {
            driver.findElement(homelink).click();
            System.out.println("Navigated to home page");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void click_MostPopular(){
        try{
            driver.findElement(clickMostPopular).click();
            System.out.println("Most Popular is clicked");
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


    public static void select_MostPopularEnrollment()
    {
        try{
            driver.findElement(selectMostPopularEnrollment).click();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validate_MostPopularPage(){
        boolean result=false;
        try {
            result= driver.findElement(validateMostPopular).isDisplayed();
            System.out.println("Most Popular Text verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
    public static void click_MostPopularCourse(){
        try {
            driver.findElement(clickMostPopularCourse).click();
            System.out.println("Most Popular Courses selected after clicking on Enrollment Open");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validate_MostPopularCourseTitle(){
        boolean result=false;
        try {
            result= driver.findElement(validateMostPopularCourseTitle).isDisplayed();
            System.out.println("KB Monthly Live Course - Aug 5 is verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
}

