package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Courses extends Base {

    public static By clickdropdown_Coursestatus = By.xpath("//p[contains(text(),'Course Status')]");
    public static By select_Enrollmentopen=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By clickimg_Enrollmentopen=By.xpath("//a[@href='/course/kb-test-video-course']");
    public static By verify_EnrollmentopenText=By.xpath("//p[contains(text(),'Technology')]");
    public static By verify_CourseInformation=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By verify_aboutthecourseText=By.xpath("//h2[contains(text(),'About the Course')]");




    public static void click_CourseStatus() {
        try {
            driver.findElement(clickdropdown_Coursestatus).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void select_Enrollopen() {
        try {
            driver.findElement(select_Enrollmentopen).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean verifyEnrollmentopen() {
        boolean result = false;
        try {

            driver.findElement(select_Enrollmentopen).isSelected();
            System.out.println("Enrollment open is selected ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void click_imageEnrollmentOpen(){
        try{
            driver.findElement(clickimg_Enrollmentopen).click();
            System.out.println("The particular course is opened ");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean verify_Enrollmentopentext(){
        boolean result=false;
        try{
            result= driver.findElement(verify_EnrollmentopenText).isDisplayed();
            System.out.println("Technology Text is displayed");
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }


    public static String verify_CourseInfm(){
        String actualText=null;
        try{
            actualText = driver.findElement(verify_CourseInformation).getAttribute("innerText");
            System.out.println(actualText);
            System.out.println("Course Information Text is storing ");

        }catch(Exception e){
            e.printStackTrace();
        }
        return actualText;
    }

    public static String verify_abtthecourse(){
        String actualText=null;
        try{
            actualText  =driver.findElement(verify_aboutthecourseText).getAttribute("innerText");

            System.out.println("About the course:"+actualText);
            System.out.println("About the Course Text is storing ");

        }catch(Exception e){
            e.printStackTrace();
        }
        return actualText;
    }

}



