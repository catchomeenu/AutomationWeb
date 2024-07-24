package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class InstructorLoginPage extends Base {

    //Login objects for instructor 	page

    public static By InstructoremailInput = By.xpath("//div/input[@type='email']");
    public static By InstructorpasswordInput = By.xpath("//div/input[@type='password']");
    public static By ForInstructorLink = By.xpath("//a[@href='/instructor-homepage' and text()='For Instructors']"); // action click
    public static By InstructorLoginButton = By.xpath("//button[@type='submit']");
    public static By clickloginButton = By.xpath("//a[@href='/login']/span[text()='Log In']");
    public static By BackToInfynihomeLink = By.xpath("//div[@class='flex flex-col items-center justify-center px-[0.75rem]']/a[@href='/']");
    public static By DashboardText = By.xpath("//div/span[text()='Dashboard']");


    //common methods---------Method -1

// Method to enter Instructor email address

    public static void EnterInstructorEmailId(String email) {
        try {
            driver.findElement(InstructoremailInput).clear();
            driver.findElement(InstructoremailInput).sendKeys(email);
            System.out.println("Instructor Email Id entered");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to enter Instructor  password
    public static void EnterInstructorPwd(String password) {
        try {

            driver.findElement(InstructorpasswordInput).clear();
            driver.findElement(InstructorpasswordInput).sendKeys(password);
            System.out.println("Instructor Password entered");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Method to click 'Sign In' button
    public static void ClickInstructorLogInButton() {
        try {
            driver.findElement(InstructorLoginButton).click();
            System.out.println("Instructor Sign In button is clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
//method to click on instructor link
public static void clickForInstructorLink() {
    try {
        driver.findElement(ForInstructorLink).click();
        System.out.println("Instructor Link  is clicked");
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    public static void clickLogin() {
        try {
            driver.findElement(clickloginButton).click();
            System.out.println("Clicked on Login Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void setClickInstructorLink() {
        try {
            driver.findElement(BackToInfynihomeLink).click();
            System.out.println("Infyni Link  is clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static boolean  dashboardTextPresence() {

        boolean result = false;
        try {
            driver.findElement(DashboardText).isDisplayed();
            System.out.println("Clicked on course link to enroll");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
}
