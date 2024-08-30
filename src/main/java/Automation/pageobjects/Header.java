package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Header extends Base {

    public static By home = By.xpath("//span[text()='Home']");
    public static By hb_page = By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");
    public static By course_Info = By.xpath("//h2[contains(text(),'Course Information')]");
    public static By musictheory_page = By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");

    public static List<String> list() {
        List<WebElement> myList = driver.findElements(By.xpath("//div[@class='swiper-wrapper']//p"));

  /*  for(int i=0;i<myList.size();i++)
    {
        System.out.println(myList.get(i).getAttribute("innerText"));
    }*/
        List<String> actualValues = new ArrayList<String>();

        for (WebElement e : myList) {
            String optionText = e.getText();

            actualValues.add(optionText);

        }
        //System.out.println(myList.size());
        return actualValues;
    }

    public static void Home() {
        try {
            driver.findElement(home).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String HeaderLink(String text) {


        WebElement values = driver.findElement(By.xpath("//p[text()='" + text + "']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", values);
        return text;

    }

    public static boolean HBValidation() {
        boolean value = false;
        try {
            value = driver.findElement(hb_page).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;

    }

    public static String pageValidatoin(String text) {
        String value = "";
        try {
            value = driver.findElement(By.xpath("//h1[contains(text(),'" + text + "')]")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return text;

    }

    public static void SelectCourse(String text) {

        try {
            driver.findElement(By.xpath("//p[contains(text(),'" + text + "')]")).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean CoursesTitle(String text) {
        boolean value = false;
        try {
            value = driver.findElement(By.xpath("//p[text()='" + text + "']")).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public static String CourseInfo() {
        String value = "";
        try {
            value = driver.findElement(course_Info).getText();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }

    public static String CourseAbout(String text) {
        String value = "";
        try {
            value = driver.findElement(By.xpath("//h2[contains(text(),'" + text + "')]")).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }

    public static boolean MusictheoryPage() {
        boolean value = false;
        try {
            value = driver.findElement(musictheory_page).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;

    }
}
