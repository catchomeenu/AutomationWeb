package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AllCoursesInfyniLinks extends Base {

    //Swathini's pageObjects
    public static By homelink=By.xpath("//span[text()='Home']");
    public static By Click_Trending=By.xpath("//a[@href='/trending']");
    public static By click_CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By select_OpenEnrolment=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By Validate_TrendingCourseTitle=By.xpath("//p[contains(text(),'Trending')]");
    public static By Select_TrendingCourse=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By ValidateSelected_TrendingCourseTitle=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By Click_VideoCourses=By.xpath("//span[contains(text(),'Video Courses')]");
    public static By select_EnrollmentClosed=By.xpath("//label[contains(text(),'Enrollment Closed')]");
    public static By Validate_VideoCourseTitle=By.xpath("//h1[contains(text(),'Videos Courses')]");
    public static By Select_VideoCoursesCourse=By.xpath("//p[contains(text(),'Java Video Course For Beginners')]");
    public static By ValidateSelected_VideoCoursesCourseTitle=By.xpath("//p[contains(text(),'Java Video Course For Beginners')]");
    public static By Click_Kids=By.xpath("//span[contains(text(),'Kids')]");
    public static By select_CompletedEnrolment=By.xpath("//label[contains(text(),'Completed')]");
    public static By Validate_KidsCourseTitle=By.xpath("//h1[contains(text(),'Kids')]");
    public static By Select_KidsCourse=By.xpath("//p[contains(text(),'Robotic Car Games')]");
    public static By ValidateSelected_KidsCourseTitle=By.xpath("//p[text()='Robotic Car Games']");

  //Sakthi's PageObjects
  public static By clickMostPopular=By.xpath("//span[contains(text(),'Most Popular')]");
    public static By validateMostPopular=By.xpath("//h1[contains(text(),'Most Popular')]");
    public static By selectCourseStatusDropdown=By.xpath("//p[text()='Course Status']");
    public static By selectMostPopularEnrollment=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By clickMostPopularCourse=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By validateMostPopularCourseTitle=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By clickLiveCourses=By.xpath("//span[contains(text(),'Live Courses')]");
    public static By validateLiveCourses=By.xpath("//h1[contains(text(),'Live Courses')]");
    public static By clickLiveCoursesCourse=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By validateLiveCourseTitle=By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");
    public static By selectLiveCoursesEnrollment=By.xpath("//label[contains(text(),'Enrollment Open')]");



    //pooja's PageObjects
    public static By  Professionalslink=By.xpath("//span[text()='Professionals']");
    public static By courseslink= By.xpath("//p[text()='Course Status']");
    //  public static By enrollmentlink=By.xpath("div[@id='CheckBoxIcon']");
    public static By enrollmentlink = By.xpath("//label[text()='Enrollment Open']");
    public static By professionalsText= By.xpath("//h1[contains(text(),'Professionals')]");
    public static By clickEnrollmentlink = By.xpath("//a[@href='/course/kb-monthly-live-course-aug-5']");
    public static By verifyclickEnrollmentlink = By.xpath("//p[contains(text(),'KB Monthly Live Course - Aug 5')]");

//priyanka's PageObjects
public static By MostRecent = By.xpath("//span[text()='Most Recent']");
    public static By Course_Status = By.xpath("//p[text()='Course Status']");
    public static By SelectedEnrollmentOpen = By.xpath("//label[text()='Enrollment Open']");
    public static By MostRecentCourse_Header = By.xpath("//h1[text()='Most Recent']");
    public static By LiveCourse_Link = By.xpath("//p[text()='KB Monthly Live Course - Aug 5']");
    public static By ValidateCourse_Title = By.xpath("//p[text()='KB Monthly Live Course - Aug 5']");
    public static By unSelectEnrollmentOpen = By.xpath("//label[text()='Enrollment Open']");



    //Swathini's Methods


    public static void click_home() {

        try {
            driver.findElement(homelink).click();
            System.out.println("Navigating to Homepage");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickTrending()
    {
        try {
            driver.findElement(Click_Trending).click();
            System.out.println("Trending course is clicked");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void clickCourseStatus()
    {
        try {
            driver.findElement(click_CourseStatus).click();
            System.out.println("Course Status is clicked ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void SelectTrendingEnrollment()
    {
        try {
            driver.findElement(select_OpenEnrolment).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateTrendingCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_TrendingCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectTrendingCourse()
    {

        try {
            driver.findElement(Select_TrendingCourse).click();
            System.out.println("Selecting One time Discount Course 1");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedTrendingCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_TrendingCourseTitle).isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void clickVideoCourse()
    {
        try {
            driver.findElement(Click_VideoCourses).click();
            System.out.println("VideoCourses is clicked");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void select_EnrollmentClosedCourses()
    {
        try {
            driver.findElement(select_EnrollmentClosed).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateVideoCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_VideoCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectVideoCoursesCourse()
    {

        try {
            driver.findElement(Select_VideoCoursesCourse).click();
            System.out.println("Selecting Java Video Course For Beginners");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedVideoCoursesCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_VideoCoursesCourseTitle).isDisplayed();
            System.out.println("Validated Course title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void clickKids()
    {
        try {
            driver.findElement(Click_Kids).click();
            System.out.println("Kids course is clicked");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void selectCompletedEnrolment()
    {
        try {
            driver.findElement(select_CompletedEnrolment).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static String ValidateKidsCourseTitle()
    {
        String Value="";
        try {
            Value = driver.findElement(Validate_KidsCourseTitle).getAttribute("innerText");
            System.out.println("Validated Page title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
    public static void SelectKidsCourse()
    {

        try {
            driver.findElement(Select_KidsCourse).click();
            System.out.println("Selecting Robotic Car Games course");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean ValidateSelectedKidsCourseTitle()
    {
        boolean Value=false;
        try {
            Value = driver.findElement(ValidateSelected_KidsCourseTitle).isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;
    }
//Sakthi's Methods

    public static void click_LiveCourses(){
        try{
            driver.findElement(clickLiveCourses).click();
            System.out.println("Live Courses is clicked");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void select_CourseStatusDropdown(){
        try{
            driver.findElement(selectCourseStatusDropdown).click();
            System.out.println("Course status dropdown is clicked");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void select_LiveCoursesEnrollment()
    {
        try{
            driver.findElement(selectLiveCoursesEnrollment).click();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validate_LiveCoursesPage(){
        boolean result=false;
        try {
            result= driver.findElement(validateLiveCourses).isDisplayed();
            System.out.println("Live Courses Text verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
    public static void click_LiveCoursesCourse(){
        try {
            driver.findElement(clickLiveCoursesCourse).click();
            System.out.println("Live Courses selected after clicking on Enrollment Open");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validate_LiveCoursesCourseTitle(){
        boolean result=false;
        try {
            result= driver.findElement(validateLiveCourseTitle).isDisplayed();
            System.out.println("KB Monthly Live Course - Aug 5 is verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }

    public static void click_MostPopular(){
        try{
            driver.findElement(clickMostPopular).click();
            System.out.println("Most Popular is clicked");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



    public static void select_MostPopularEnrollment()
    {
        try{
            driver.findElement(selectMostPopularEnrollment).click();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean validate_MostPopularPage(){
        boolean result=false;
        try {
            result= driver.findElement(validateMostPopular).isDisplayed();
            System.out.println("Most Popular Text verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
    public static void click_MostPopularCourse(){
        try {
            driver.findElement(clickMostPopularCourse).click();
            System.out.println("Most Popular Courses selected after clicking on Enrollment Open");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validate_MostPopularCourseTitle(){
        boolean result=false;
        try {
            result= driver.findElement(validateMostPopularCourseTitle).isDisplayed();
            System.out.println("KB Monthly Live Course - Aug 5 is verified");
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }

//Pooja's Methods

    public static void clickProfessionals() {
        try {
            driver.findElement(Professionalslink).click();
            System.out.println("Clicked Professionals");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void selectProfessionalscourse () {
        try {
            driver.findElement(courseslink).click();
            System.out.println("Clicked Course Status");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void selectProfessionalsEnrollment() {
        try {
            driver.findElement(enrollmentlink).click();
            // System.out.println("Selecting Enrollment Open for Professionals");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String validateprofessionalsText() {
        String actualText = null;
        try {
            actualText = driver.findElement(professionalsText).getAttribute("innerText");
            System.out.println("Validating Page Title Professionals");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }
    public static void clickEnrollmentOpenlink() {
        try {
            driver.findElement(clickEnrollmentlink).click();
            System.out.println("Clicked EnrollmrntOpen Course Link");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String verifyKbText() {
        String actualText = null;
        try {
            actualText = driver.findElement(verifyclickEnrollmentlink).getAttribute("innerText");

            System.out.println(actualText);
            System.out.println("Verifying KB Monthly Live Course - Aug 5 Text");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return actualText;
    }

    //Priyanka's methods
    public static void ClickOn_MostRecent() {
        try {
            driver.findElement(MostRecent).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void Click_CourseStatus() {

        try {
            WebElement Value1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(Course_Status));
            Value1.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void SelectMostRecent_EnrollmentOpen() {

        try {
            driver.findElement(SelectedEnrollmentOpen).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean Validate_MostRecentCourse_Header() {
        boolean Value=false;
        try {
            Value = driver.findElement(MostRecentCourse_Header).isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;

    }

    public static void ClickOn_LiveCourse_Link() {
        try {
            driver.findElement(LiveCourse_Link).click();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean ValidateCourse_Title() {
        boolean Value=false;
        try {
            WebElement Value1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(ValidateCourse_Title));
            Value1.isDisplayed();
            System.out.println("Validated Course  title");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Value;


    }

    public static void UnSelect_EnrollmentOpen() {

        try {
            driver.findElement(unSelectEnrollmentOpen).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


