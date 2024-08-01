package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class MostPopularLinkPage extends Base {

        public static By click_homelink=By.linkText("Home");
        public static By click_Popular=By.xpath("//span[contains(text(),'Most Popular')]");
        public static By click_MostPopular=By.xpath("//h1[contains(text(),'Most Popular')]");


        public static void click_home() {
            driver.findElement(click_homelink).click();
        }

        public static void click_MostPopular(){
            driver.findElement(click_Popular).click();
        }

        public static boolean verify_MostPopularPage(){
            boolean result=false;
            try {
                result= driver.findElement(click_MostPopular).isDisplayed();
                System.out.println("Most Popular Text verified");
            }catch (Exception e){
                e.printStackTrace();
            }
            return result;

        }

    }


