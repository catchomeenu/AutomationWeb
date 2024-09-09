package AutomationTest;

import Automation.pageobjects.HomePage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePageIconTestcases extends HomePage {

    @BeforeSuite
    public static void launchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(500);
    }

    @Test(priority = 1)
    public static void VerfifyBurgerICon(){
        BurgerMenuPresence();
    }
    @Test(priority = 2)
    public static void verifyInfyniLogo(){
        verifyLogo();
        System.out.println("InfyniLogo is Presence");
    }
    @Test(priority = 3)
    public static void VerifyContactUS(){
        ContactInfoPresence();
        System.out.println("CONTACTUS Header element Display ");

    }
    @Test(priority = 4)
    public static void VerifyForInstructor(){
        ForInstructorpresence();
        System.out.println("FOR INSTRUCTOR Header elements Display ");
    }
    @Test(priority = 5)
    public static void Verifycart(){
        cartImagepresence();
        System.out.println("Cartimage Display ");

    }
    @Test(priority = 6)
    public static void VerifyLoginButton(){
        Loginbuttonpresence();
        System.out.println("LOGIN Button Display ");
    }
    @Test(priority = 7)
    public static void VerifySigninButton(){
        SignInbuttonpresence();
        System.out.println("Signin BUtton  Display ");
    }




}
