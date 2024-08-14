package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProfessionalCourses extends Base {

    public static By homePageLink = By.xpath("//span[text()='Home']//ancestor::div[contains(@class,'MuiListItemIcon')]//a");
    public static By mostRecentLink = By.xpath("//span[text()='Most Recent']//ancestor::div[contains(@class,'MuiListItemIcon')]//a");
    public static By Most_Recent_header = By.xpath("//h1[text()='Most Recent']");
    public static By Technology_Tab = By.xpath("//p[text()='Technology']");
    public static By Technology_Header = By.xpath("//h1[text()='Technology']");
    public static By Free_CourseTab = By.xpath("//p[text()='Free Course']");
    public static By Free_Course_Header = By.xpath("//h1[text()='Free Course']");
    public static By Programming_Tab = By.xpath("//p[text()='Programming']");
    public static By Programming_Header = By.xpath("//h1[text()='Programming']");
    public static By IT_Certification_Tab = By.xpath("//p[text()='IT Certification']");
    public static By IT_Certification_Header = By.xpath("//h1[text()='IT Certification']");


    public static void ClickOnHome(WebDriver driver) {
        driver.findElement(homePageLink).click();
    }


    public static void ClickOnWebElement(WebDriver driver) {
        driver.findElement(mostRecentLink).click();
    }

    public static void ValidatePageOpens(WebDriver driver) throws InterruptedException {
        Assert.assertTrue(driver.findElement(Most_Recent_header).isDisplayed(), "Validate Most Recent Header Displayed");
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://devnj.infyni.com/most-recent", "Validate page is open");

    }

    public static void ValidateTechnology_Tab(String TabName) {
        WebElement TabLink1 = driver.findElement(Technology_Tab);
        Assert.assertTrue(TabLink1.isDisplayed(), "Technology Tab is displayed");
        TabLink1.click();
    }

    public static void ValidateTechnology_Header(String TabName) {
        WebElement TechHeader = driver.findElement(Technology_Header);
        Assert.assertTrue(TechHeader.isDisplayed(), "Technology Header is displayed");
    }

    public static void ValidateFree_Course_Tab(String TabName) {

        WebElement TabLink2 = driver.findElement(Free_CourseTab);
        Assert.assertTrue(TabLink2.isDisplayed(), "Free Course Tab is displayed");
        TabLink2.click();
    }

    public static void ValidateFree_Course_Header(String TabName) {
        WebElement FreeCourseHeader = driver.findElement(Free_Course_Header);
        Assert.assertTrue(FreeCourseHeader.isDisplayed(), "Free Course Header is displayed");
    }

    public static void ValidateProgramming_Tab(String TabName) {

        WebElement TabLink3 = driver.findElement(Programming_Tab);
        Assert.assertTrue(TabLink3.isDisplayed(), "Programming Tab is displayed");
        TabLink3.click();
    }

    public static void ValidateProgramming_Header(String TabName) {

        WebElement ProgrammingHeader = driver.findElement(Programming_Header);
        Assert.assertTrue(ProgrammingHeader.isDisplayed(), "Programming Header is displayed");
    }

    public static void ValidateITCertification_Tab(String TabName) {

        WebElement TabLink4 = driver.findElement(IT_Certification_Tab);
        Assert.assertTrue(TabLink4.isDisplayed(), "IT Certification Tab is displayed");
        TabLink4.click();
    }

    public static void ValidateITCertification_Header(String TabName) {

        WebElement ITCertificationHeader = driver.findElement(IT_Certification_Header);
        Assert.assertTrue(ITCertificationHeader.isDisplayed(), "IT Certification Header is displayed");
    }
}

