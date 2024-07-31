package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CourseHomePage extends Base {
    //Course Trending page objects
    public static By trendingLink= By.xpath("//span[text()='Trending']");
    public static By trendingText= By.xpath("//h1[text()='Trending']");
    public static By courseStatusLink=By.xpath("//p[text()='Course Status']");
    public static By enrollementCheckBox=By.xpath("//label[text()='Enrollment Open']");
    public static By BADesignLink=By.xpath("//p[text()='BA Design']");
    public static By BADesignText=By.xpath("//p[text()='BA Design']");
    public static By aboutTheCourseText=By.xpath("//h2[text()='About the Course']");
    public static By courseInformationText=By.xpath("//h2[text()='Course Information']");

    public static void ClickTrendingLink() {
        try {
            driver.findElement(trendingLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureTrendingText(){
        String actualText=driver.findElement(trendingText).getText();
        return actualText;

    }

    public static void ClickCourseStatus() {
        try {
            driver.findElement(courseStatusLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void CheckEnrollemntOpen() {
        try {
            driver.findElement(enrollementCheckBox).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void ClickBADesignLink() {
        try {
            driver.findElement(BADesignLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureBADesignText(){
        String actualText=driver.findElement(BADesignText).getText();
        return actualText;

    }

    public static String CaptureAboutTheCourseText(){
        String actualText=driver.findElement(aboutTheCourseText).getText();
        return actualText;

    }
    public static String CaptureCourseInformationText(){
        String actualText=driver.findElement(courseInformationText).getText();
        return actualText;

    }
}
