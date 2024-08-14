
package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class KidsCourses extends Base {

    public static By clickdropdown_Coursestatus = By.xpath("//p[contains(text(),'Course Status')]");
    public static By select_Enrollmentopen=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By verify_EnrollmentopenText=By.xpath("//h1[contains(text(),'Games')]");



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

    public static boolean verify_Enrollmentopentext(){
        boolean result=false;
        try{
            result= driver.findElement(verify_EnrollmentopenText).isDisplayed();
            System.out.println("Games Text is displayed");
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }


}



