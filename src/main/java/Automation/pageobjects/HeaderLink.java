package Automation.pageobjects;
import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HeaderLink extends Base {

    public static By click_homelink=By.linkText("Home");
    public static By click_animationimg=By.xpath("//a[@href='/course/arts-divya']");
    public static By verify_CourseInfm=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By verify_Aboutthecourse=By.xpath("//div[contains(@class,'flex hidden items-start h-[auto]')]//h2[contains(text(),'About the Course')]");
    public static By click_Modificationimg=By.xpath("//p[contains(text(),'Python')]/ancestor::a");


    public static void click_home() {
        try{
            driver.findElement(click_homelink).click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void click_LinkValues(String value) {
            try{
                List<WebElement> val=driver.findElements(By.xpath("//div[@class='swiper-wrapper']/div[@class='swiper-slide']//p"));
                List<String> actualval=new ArrayList<>();
                for(WebElement e : val){
                    actualval.add(e.getText());
                }
                if(actualval.contains(value)) {
                    WebElement click_link = driver.findElement(By.xpath("//p[contains(text(),'" + value + "')]/ancestor::a"));
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", click_link);
                    System.out.println(value + "is clicked as expected ");
                }else{
                    System.out.println("The given value is not present in the swiperslide");
                }
            }catch(Exception e){
                e.printStackTrace();
            }


    }

    public static boolean verify_LinkValues(String value) {
        boolean result=false;
        try{
            WebElement verify_link = driver.findElement(By.xpath("//h1[contains(text(),'" + value + "')]"));
            result = verify_link.isDisplayed();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }

    public static void click_linkImage(String value){
        try{
            WebElement verify_value = driver.findElement(By.xpath("//p[contains(text(),'" + value + "')]/ancestor::a"));
             verify_value.click();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static boolean verify_linkimage(String value) {
       boolean result=false;
        try{
            WebElement verify_value = driver.findElement(By.xpath("//p[contains(text(),'" + value + "')]/ancestor::a"));
            result= verify_value.isDisplayed();

        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static String verify_Courseinfm() {
        String actualval="";
        try{
            WebElement verify_textvalue = driver.findElement(verify_CourseInfm);
            actualval = verify_textvalue.getText();
        }catch(Exception e){
            e.printStackTrace();
        }

        return actualval;
    }

    public static String verify_abttheCourse() {

        String actualval="";
        try{
            WebElement verify_textvalue = driver.findElement(verify_Aboutthecourse);
            actualval = verify_textvalue.getText();
        }catch(Exception e){
            e.printStackTrace();
        }

        return actualval;
    }

}