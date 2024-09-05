package Automation.pageobjects;

import Automation.base.Base;
import org.apache.poi.hslf.record.CString;
import org.openqa.selenium.By;

public class ProfessionalsCourseStatus extends Base {


    public static By Professionals=By.xpath("//span[text()='Professionals']");
    public static By CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By Click_OpenEnrolment=By.xpath("//label[text()='Enrollment Open']");
    public static By Clicking_Course=By.xpath("//p[text()='Kb test video course']");
    public static By ProfessionalSelectedCourse_Title=By.xpath("//p[contains(text(),'Technology')]");
    public static By ProfessionalSelectedCourse_Info=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By ProfessionalSelectedCourse_About=By.xpath("//h2[contains(text(),'About the Course')]");
    public static By ProfessionalSlickList_Technology=By.xpath("//p[@class='card_active !pl-[20px] font-primary-font-bold']");
    public static By ProfessionalTechnology_Validation=By.xpath("//h1[contains(text(),'Technology')]");

    public static By ProfessionalSlickList_FreeCourse=By.xpath("//div[@data-index= '1']//p[text()='Free Course']");
    public static By ProfessionalFreeCourse_Validation=By.xpath("//h1[contains(text(),'Free Course')]");


    public static By ProfessionalSlickList_Programming=By.xpath("//div[@data-index= '2']//p[text()='Programming']");
    public static By ProfessionalProgramming_Validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']");

    public static By ProfessionalSlickList_ITCertification=By.xpath("//div[@data-index= '3']//p[text()='IT Certification']");
    public static By ProfessionalITCertification_validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']\n");



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

    public static boolean ProfessionalSlickListTechnology()
    {
        try {
            driver.findElement(ProfessionalSlickList_Technology).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value=false;
        try {
            value =driver.findElement(ProfessionalTechnology_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    public static boolean ProfessionalSlickListFreeCourse()
    {
        try {
            driver.findElement(ProfessionalSlickList_FreeCourse).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=driver.findElement(ProfessionalFreeCourse_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;


    }
    public static boolean ProfessionalSlickListProgramming()
    {
        try {
            driver.findElement(ProfessionalSlickList_Programming).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=  driver.findElement(ProfessionalProgramming_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    public static boolean ProfessionalSlickListITCertification()
    {
        try {
            driver.findElement(ProfessionalSlickList_ITCertification).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=driver.findElement(ProfessionalITCertification_validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }



}
