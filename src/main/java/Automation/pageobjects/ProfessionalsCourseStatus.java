package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class ProfessionalsCourseStatus extends Base {


    public static By Professionals=By.xpath("//span[text()='Professionals']");
    public static By CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By Click_OpenEnrolment=By.xpath("//label[text()='Enrollment Open']");
    public static By Clicking_Course=By.xpath("//p[text()='Kb test video course']");
    public static By ProfessionalSelectedCourse_Title=By.xpath("//p[contains(text(),'Technology')]");
    public static By ProfessionalSelectedCourse_Info=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By ProfessionalSelectedCourse_About=By.xpath("//h2[contains(text(),'About the Course')]");


    public static void ProfessionalsCourse(){
        try {
            driver.findElement(Professionals).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void CourseStatusSelection()
    {
        try {
            driver.findElement(CourseStatus).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void ClickOpenEnrolment()
    {
        try {
            driver.findElement(Click_OpenEnrolment).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ClickingCourse()
    {
        try {
            driver.findElement(Clicking_Course).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String ProfessionalSelectedCourseTitle()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_Title).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String ProfessionalSelectedCourseInfo()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_Info).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String ProfessionalSelectedCourseAbout()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_About).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }



}
