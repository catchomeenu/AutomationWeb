package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class Kids extends Base {
    public static By click_homelink=By.linkText("Home");
    public static By click_Kids=By.xpath("//span[contains(text(),'Kids')]");
    public static By click_Kidspage=By.xpath("//h1[contains(text(),'Kids')]");


    public static void click_home() {
        driver.findElement(click_homelink).click();
    }

    public static void click_Kids(){
        driver.findElement(click_Kids).click();
    }

    public static boolean verify_KidsPage(){
        boolean result=false;
        try {
            result= driver.findElement(click_Kidspage).isDisplayed();
            System.out.println("Kids Text verified");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }

}
