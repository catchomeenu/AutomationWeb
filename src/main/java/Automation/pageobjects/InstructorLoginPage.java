package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class InstructorLoginPage extends Base {
    public static By InstructoremailInput = By.xpath("//div/input[@type='email']");
    public static By InstructorpasswordInput = By.xpath("//div/input[@type='password']");
     // action click
    public static By InstructorLoginButton = By.xpath("//button[@type='submit']");
    public static By loginButton = By.xpath("//a[@href='/login']/span[text()='Log In']");
    //public static By BackToInfynihomeLink = By.xpath("//div[@class='flex flex-col items-center justify-center px-[0.75rem]']/a[@href='/']");
    //public static By instructorLoginText= By.xpath("//div[@class='instructorhomepage_title__JrzNA' and text()='Become an Instructor']");
    //public static By InfyniLogo = By.xpath("//img[@alt='logo']");
    public static By InfyniLogo = By.xpath("//a[@href='/']/img");
    public static By dashboardText=By.xpath("//span[@class='font-primary-font-bold tab-panel_title__oPS_k' and text()='Dashboard']");
    public static By ForInstructorclick = By.xpath("//a[@href='/instructor-homepage' and text()='For Instructors']");
    public static By homelink=By.xpath("//span[text()='Home']");

    //common methods---------Method -1
    public static void clickInfyniLogo() {
        try {
            driver.findElement(InfyniLogo).click();
            System.out.println("clicked on infyni logo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickLoginButton() {
        try {
            driver.findElement(loginButton).click();
            System.out.println("Clicked on Login Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void EnterInstructorEmailId(String email) {
        try {
            driver.findElement(InstructoremailInput).clear();
            driver.findElement(InstructoremailInput).sendKeys(email);
            System.out.println("Instructor Email Id entered");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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



    public static boolean dashboardTextPresence() {
        boolean result = false;
        try {
            driver.findElement(dashboardText).isDisplayed();
            System.out.println("Navigated to Instructor DashboardPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static void ClickForInstructor() {
        try {
            driver.findElement(ForInstructorclick).click();
            System.out.println("Click on For Instructor ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void click_home() {

        try {
            driver.findElement(homelink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
