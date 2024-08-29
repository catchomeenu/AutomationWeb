package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Header extends Base {

    public static By home=By.xpath("//span[text()='Home']");
    // public static By health_beauty = By.xpath("//p[text()='Health and Beauty']");
    public static By hb_page= By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");
    public static By hb_courses = By.xpath("//p[text()='Yoga Everyday - UAT']");
    public static By hbcourse_page = By.xpath("//p[text()='Yoga Everyday - UAT']");
    /* *//*public static By hbcourse_Info=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By hbcourse_About=By.xpath("//h2[contains(text(),'About the Course')]");
*//*
    public static By music_theory = By.xpath("//p[text()='Music Theory']");
*/
    public static By musictheory_page= By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");

    public static By musictheory_courses = By.xpath("//p[text()='KB video Course - July 31']");
    public static By musictheorycourse_page = By.xpath("//p[text()='KB video Course - July 31']");
   /* public static By musictheory_Info=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By musictheory_About=By.xpath("//h2[contains(text(),'About the Course')]");*/


    public static void Home()
    {
        try {
            driver.findElement(home).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String HeaderLink(String text) {
        WebElement values = driver.findElement(By.xpath("//p[text()='"+text+"']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", values);
        return text;

    }
    public static boolean HBValidation()
    {
        boolean value= false;
        try {
            value=driver.findElement(hb_page).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;

    }
    public static String CoursesTitle(String text)
    {
        String value= "";
        try {
            value=  driver.findElement( By.xpath("//p[text()='"+text+"']")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    public static String CourseInfo(String text)
    {
        String value ;
        try {
            value = driver.findElement(By.xpath("//h2[contains(text(),'"+text+"')]")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String CourseAbout(String text)
    {
        String value="" ;
        try {
            value = driver.findElement(By.xpath("//h2[contains(text(),'"+text+"')]")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }

    /* public static void MusicTheory() {
         WebElement values =  driver.findElement(music_theory);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click()", values);

     }*/
    public static boolean MusictheoryPage()
    {
        boolean value= false;
        try {
            value=driver.findElement(musictheory_page).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;

    }
    public static boolean MusictheoryCourses()
    {

        try {
            driver.findElement(musictheory_courses).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=  driver.findElement(musictheorycourse_page).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    /*public static String MusictheoryInfo()
    {
        String value ;
        try {
            value = driver.findElement(musictheory_Info).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String MusictheoryAbout()
    {
        String value ;
        try {
            value = driver.findElement(musictheory_About).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }*/

    public static String pageValidatoin(String text)
    {
        String value= "" ;
        try {
            value = driver.findElement(By.xpath("//h1[contains(text(),'"+text+"')]")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return text;

    }
    public static void SelectCourse(String text)
    {

        try {
            driver.findElement(By.xpath("//p[contains(text(),'"+text+"')]")).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
