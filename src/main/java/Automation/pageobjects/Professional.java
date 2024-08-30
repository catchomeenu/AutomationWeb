package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class Professional extends Base {

    public static By click_homelink = By.xpath("//span[text()='Home']");
    public static By  Professionalslink=By.xpath("//span[text()='Professionals']");
    public static By courseslink= By.xpath(" //div[@id='Course StatusHeader']");
  //  public static By enrollmentlink=By.xpath("div[@id='CheckBoxIcon']");
  public static By enrollmentlink = By.xpath("//label[text()='Enrollment Open']");
    public static By professionalsText= By.xpath("//h1[contains(text(),'Professionals')]");
    public static By clickEnrollmentlink = By.xpath("//a[@href='/course/kb-monthly-live-course-aug-5']");
    public static By verifyclickEnrollmentlink = By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");

        public static void click_home() {
        try {
            driver.findElement(click_homelink).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickProfessionals() {
        try {
            driver.findElement(Professionalslink).click();
            System.out.println("Clicked Professionals");
        } catch (Exception e) {
            e.printStackTrace();
            }
    }
        public static void selectProfessionalscourse () {
            try {
                driver.findElement(courseslink).click();
                System.out.println("Clicked Course Status");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void selectProfessionalsEnrollment() {
            try {
                driver.findElement(enrollmentlink).click();
               // System.out.println("Selecting Enrollment Open for Professionals");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    public static String validateprofessionalsText() {
        String actualText = null;
        try {
            actualText = driver.findElement(professionalsText).getAttribute("innerText");
            System.out.println("Validating Page Title Professionals");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }
    public static void clickEnrollmentOpenlink() {
        try {
            driver.findElement(clickEnrollmentlink).click();
            System.out.println("Clicked EnrollmrntOpen Course Link");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String verifyKbText() {
        String actualText = null;
        try {
            actualText = driver.findElement(verifyclickEnrollmentlink).getAttribute("innerText");

            System.out.println(actualText);
            System.out.println("Verifying KB Monthly Live Course - Aug 5 Text");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }

    }
