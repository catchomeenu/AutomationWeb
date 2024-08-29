package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Slider extends Base {
    public static By click_homelink = By.linkText("Home");
    //public static By click_chesslink = By.xpath("//a[@href='/courses/chess']");
    public static By click_chesspageobjlink = By.xpath("//a[@href='/course/july-22nd-live-monthly-course']");
    public static By click_choreographypageobjlink = By.xpath("//a[@href='/course/new-choreography']");
    public static By click_marketingpageobjlink = By.xpath("//a[@href='/course/web-designing-1']");
    public static By click_SelfPObjlink = By.xpath("//a[@href='/course/english-video-course-july-29']");
    public static By click_instustdpageobjlink = By.xpath("//a[@href='/course/an-introduction-to-musical-instruments']");

    public static By click_Skillspageobjlink = By.xpath("//a[@href='/course/full-stack-web-development-mastery']");
    public static By click_Businesspageobjlink = By.xpath("//a[@href='/course/automation-testing-1']");
    public static By click_TechCoursepageobjlink = By.xpath("//a[@href='/course/automation-testing-1']");

    public static By verify_CourseInformationText = By.xpath("//h2[contains(text(),'Course Information')]");
    public static By verify_AbouttheCourseText = By.xpath("//h2[contains(text(),'About the Course')]");

    public static void click_home() {
        try {
            driver.findElement(click_homelink).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickSlider(String sliderName) {
        WebElement sliderElement = null;
        List<WebElement> swiperSildes = driver.findElement(By.className("swiper-wrapper")).findElements(By.className("swiper-slide"));
        for (WebElement swiperSilde: swiperSildes) {
            String pText = swiperSilde.findElement(By.tagName("p")).getText();
            if (pText.equalsIgnoreCase(sliderName)) {
                sliderElement = swiperSilde.findElement(By.tagName("a"));
                System.out.println("Text " + pText);
            }
        }
        boolean isELementVisible = false;
        while (!isELementVisible) {
            try {
                sliderElement.click();
                isELementVisible = true;
            } catch (Exception e) {
                driver.findElement(By.className("swiper-button-next")).click();
                isELementVisible = false;
            }
        }

    }


    public static void clickChessCourseLink() {
        driver.findElement(click_chesspageobjlink).click();
    }

    public static void clickchoreographypageobj() {
        driver.findElement(click_choreographypageobjlink).click();
    }

    public static void clickinstustdplink() {
        driver.findElement(click_instustdpageobjlink).click();
    }

    public static void clickSelfpacedObj() {
        driver.findElement(click_SelfPObjlink).click();
    }

    public static void clickmarketingpageobj() {
        driver.findElement(click_marketingpageobjlink).click();
    }
    public static void clickSkillspageobj() {
        driver.findElement(click_Skillspageobjlink).click();
    }
    public static void clickBusinesspageobj() {
        driver.findElement(click_Businesspageobjlink).click();
    }
    public static void clickTechnologyCoursepageobj() {
        driver.findElement(click_TechCoursepageobjlink).click();
    }
    public static String verifyCourseInformation() {
        String actualText = null;
        try {
            actualText = driver.findElement(verify_CourseInformationText).getAttribute("innerText");
            System.out.println(actualText);
            System.out.println("Course Information Text is storing ");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }

    public static String verifyAbouttheCouse() {
        String actualText = null;
        try {
            actualText = driver.findElement(verify_AbouttheCourseText).getAttribute("innerText");

            System.out.println("About the course:" + actualText);
            System.out.println("About the Course Text is storing ");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }
}


