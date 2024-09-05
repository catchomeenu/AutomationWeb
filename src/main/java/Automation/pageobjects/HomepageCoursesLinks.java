package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomepageCoursesLinks extends Base {
    //common links
    public static By click_homelink=By.linkText("Home");

    public static By filterCourseStatus = By.xpath("//p[text()='Course Status']");

    public static By EnrollOpen = By.xpath("//label[text()='Enrollment Open']");

    public static By CourseLink = By.xpath("//p[text()='Kb test video course']//parent::a");

    public static By CourseTitle = By.xpath("//p[text()='Kb test video course']");

    public static By CourseInformation = By.xpath("//h2[text()='Course Information']");

    public static By AboutTheCourse = By.xpath("//h2[text()='About the Course']");

    //MostPopular ElementLocators
    public static By clickdropdown_Coursestatus = By.xpath("//p[contains(text(),'Course Status')]");
    public static By select_Enrollmentopen=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By clickimg_Enrollmentopen=By.xpath("//a[@href='/course/kb-test-video-course']");
    public static By verify_EnrollmentopenText=By.xpath("//p[contains(text(),'Technology')]");
    public static By verify_CourseInformation=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By verify_aboutthecourseText=By.xpath("//h2[contains(text(),'About the Course')]");


    public static By PopularLink=By.xpath("//span[contains(text(),'Most Popular')]");
    public static By MostPopularLink=By.xpath("//h1[contains(text(),'Most Popular')]");
    //MostRecent ElementLocators
    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By mostRecentLink = By.xpath("//span[text()='Most Recent']");
    private static By pageHeaderMostRecent = By.xpath("//h1[text()='Most Recent']");

    //Professionals ElementLocators
    public static By Professionals=By.xpath("//span[text()='Professionals']");
    public static By ProfessionalPage =By.xpath("//h1[text()='Professionals']");
    public static By home=By.xpath("//span[text()='Home']");

    //Kids ElementLocators
    /***kids Page**/
    public static By click_Kids=By.xpath("//span[contains(text(),'Kids')]");
    public static By click_Kidspage=By.xpath("//h1[contains(text(),'Kids')]");

    /***kids Courses Page**/
    public static By clickdropdownKidsCoursestatus = By.xpath("//p[contains(text(),'Course Status')]");
    public static By selectKidsEnrollmentopen=By.xpath("//label[contains(text(),'Enrollment Open')]");
    public static By verifyKidsEnrollmentopenText=By.xpath("//h1[contains(text(),'Games')]");

    /***kidsClickImage***/

    /***Enrollment Element Locators for Professionals **/

    public static By CourseStatus=By.xpath("//p[text()='Course Status']");
    public static By Click_OpenEnrolment=By.xpath("//label[text()='Enrollment Open']");
    public static By Clicking_Course=By.xpath("//p[text()='Kb test video course']");
    public static By ProfessionalSelectedCourse_Title=By.xpath("//p[contains(text(),'Technology')]");
    public static By ProfessionalSelectedCourse_Info=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By ProfessionalSelectedCourse_About=By.xpath("//h2[contains(text(),'About the Course')]");
    public static By ProfessionalSlickList_Technology=By.xpath("//p[@class='card_active !pl-[20px] font-primary-font-bold']");
    public static By ProfessionalTechnology_Validation=By.xpath("//h1[contains(text(),'Technology')]");

    public static By ProfessionalSlickList_FreeCourse=By.xpath("//div[@data-index= '1']//p[text()='Free Course']");
    public static By ProfessionalFreeCourse_Validation=By.xpath("//h1[contains(text(),'Free Course')]");


    public static By ProfessionalSlickList_Programming=By.xpath("//div[@data-index= '2']//p[text()='Programming']");
    public static By ProfessionalProgramming_Validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']");

    public static By ProfessionalSlickList_ITCertification=By.xpath("//div[@data-index= '3']//p[text()='IT Certification']");
    public static By ProfessionalITCertification_validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']\n");





    //MostPopular Methods
    public static void click_home() {

        try {
            driver.findElement(click_homelink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void click_MostPopular(){

        try {
            driver.findElement(PopularLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verify_MostPopularPage(){
        boolean result=false;
        try {
            result= driver.findElement(MostPopularLink).isDisplayed();
            System.out.println("Most Popular Text verified");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }
    //MostRecent Methods
    public static void Clickon_Homepage() {

        try {
            driver.findElement(homePageLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void Clickon_MostRecentTab() {

        try {
            driver.findElement(mostRecentLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void validatePageIsOpen() {
        WebElement MostRecent_Header = driver.findElement(pageHeaderMostRecent);
        Assert.assertTrue(MostRecent_Header.isDisplayed(), "Validate Most Recent header is displayed");
    }

    protected void validateCoursesTabs(String tabName) {
        //button[text()='Professionals']
        WebElement tabLinkElement = driver.findElement(By.xpath("//button[text()='" + tabName + "']"));

        Assert.assertTrue(tabLinkElement.isDisplayed(), "Validate Tab " + tabName + " is displayed");
        tabLinkElement.click();
        Assert.assertTrue(tabLinkElement.isEnabled(), "Validate Tab " + tabName + " is enabled");
    }
    //Professionals Methods
    public static void Home() {
        try {
            driver.findElement(home).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ProfessionalCourse() {
        try {
            driver.findElement(Professionals).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean ProfessionalPage() {
        boolean result;
        try {
            result = driver.findElement(ProfessionalPage).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;


    }
    //Kids Methods

    /***Kids Methods***/
    public static void click_Kids(){

        try {
            driver.findElement(click_Kids).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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

    /***Kids Enrollment Courses Methods***/
    public static void clickKidsCourseStatus() {
        try {
            driver.findElement(clickdropdown_Coursestatus).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectKidsEnrollment() {
        try {
            driver.findElement(select_Enrollmentopen).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void kidsCourseSelection()
    {
        try {
            driver.findElement(CourseStatus).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void ClickOpenEnrolment()
    {
        try {
            driver.findElement(Click_OpenEnrolment).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verifyKidsEnrollmentopen() {
        boolean result = false;
        try {

            driver.findElement(select_Enrollmentopen).isSelected();
            System.out.println("Enrollment open is selected ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean verifyKidsEnrollmentopentext(){
        boolean result=false;
        try{
            result= driver.findElement(verify_EnrollmentopenText).isDisplayed();
            System.out.println("Games Text is displayed");
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }


    //Most Popular Enrollment Methods
    public static void ValidatePopularClickOnWebElement() {
        try {
            driver.findElement(MostPopularLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void clickPopularCourseStatus() {
        try {
            driver.findElement(clickdropdown_Coursestatus).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectPopularEnrollopen() {
        try {
            driver.findElement(select_Enrollmentopen).click();
            System.out.println("Course Status dropdown clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean verifyPopularEnrollmentopen() {
        boolean result = false;
        try {

            driver.findElement(select_Enrollmentopen).isSelected();
            System.out.println("Enrollment open is selected ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void clickPopularimageEnrollmentOpen(){
        try{
            driver.findElement(clickimg_Enrollmentopen).click();
            System.out.println("The particular course is opened ");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean verifyPopularEnrollmentopentext(){
        boolean result=false;
        try{
            result= driver.findElement(verify_EnrollmentopenText).isDisplayed();
            System.out.println("Technology Text is displayed");
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }


    public static String verifyPopularCourseInfm(){
        String actualText=null;
        try{
            actualText = driver.findElement(verify_CourseInformation).getAttribute("innerText");
            System.out.println(actualText);
            System.out.println("Course Information Text is storing ");

        }catch(Exception e){
            e.printStackTrace();
        }
        return actualText;
    }

    public static String verifyPopularabtthecourse(){
        String actualText=null;
        try{
            actualText  =driver.findElement(verify_aboutthecourseText).getAttribute("innerText");

            System.out.println("About the course:"+actualText);
            System.out.println("About the Course Text is storing ");

        }catch(Exception e){
            e.printStackTrace();
        }
        return actualText;
    }


    //Enrollment Most Recent Methods
    public static void ValidateClickOnHome() {

        try {
            driver.findElement(homePageLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ValidateClickOnWebElement() {
        try {
            driver.findElement(mostRecentLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void ValidatefilterCourse() {
        WebElement FilterCourse_tab = driver.findElement(filterCourseStatus);
        Assert.assertTrue(FilterCourse_tab.isDisplayed(), "Filter By Course Status tab Displayed");
        FilterCourse_tab.click();
    }

    public static void validatekidsEnrollOpen() {

        try {
            driver.findElement(select_Enrollmentopen).click();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void ValidateEnrollOpen() {
    WebElement EnrollOpen_Click = driver.findElement(EnrollOpen);
        try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
        Assert.assertTrue(EnrollOpen_Click.isDisplayed(), "Enrollment Open Link Navigated to Technology Course Link");
        EnrollOpen_Click.click();
}
    public static void ValidateCourseLink() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement CourseLink_Click = driver.findElement(CourseLink);
        Assert.assertTrue(CourseLink_Click.isDisplayed(), " Course Link Navigated to Course Title");
        CourseLink_Click.click();

    }

    public static void ValidateCourseTitle() {
        WebElement CourseTitleText = driver.findElement(CourseTitle);
        Assert.assertTrue(CourseTitleText.isDisplayed(), " Course Title Displayed");
    }

    public static void ValidateCourseInformation() {
        WebElement CourseInfoText = driver.findElement(CourseInformation);
        Assert.assertTrue(CourseInfoText.isDisplayed(), " Course Information Displayed");

    }

    public static void ValidateAboutTheCourse() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> AboutTheCourseText = driver.findElements(AboutTheCourse);
        WebElement AboutTheCourseText_Displayed = null;
        for (WebElement element : AboutTheCourseText) {
            if (element.isDisplayed()) {
                AboutTheCourseText_Displayed = element;
            }
        }
        assert AboutTheCourseText_Displayed != null;
        Assert.assertTrue(AboutTheCourseText_Displayed.isDisplayed(), " About the Course Information Displayed");


    }


//Enrollment Professional Methods
public static void ProfessionalsCourse(){
    try {
        driver.findElement(Professionals).click();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }


}

    public static void CourseStatusSelection()
    {
        try {
            driver.findElement(CourseStatus).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



    public static void ClickingCourse()
    {
        try {
            driver.findElement(Clicking_Course).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String ProfessionalSelectedCourseTitle()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_Title).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String ProfessionalSelectedCourseInfo()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_Info).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }
    public static String ProfessionalSelectedCourseAbout()
    {
        String value ;
        try {
            value = driver.findElement(ProfessionalSelectedCourse_About).getAttribute("innerText");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return value;


    }

    public static boolean ProfessionalSlickListTechnology()
    {
        try {
            driver.findElement(ProfessionalSlickList_Technology).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value=false;
        try {
            value =driver.findElement(ProfessionalTechnology_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    public static boolean ProfessionalSlickListFreeCourse()
    {
        try {
            driver.findElement(ProfessionalSlickList_FreeCourse).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=driver.findElement(ProfessionalFreeCourse_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;


    }
    public static boolean ProfessionalSlickListProgramming()
    {
        try {
            driver.findElement(ProfessionalSlickList_Programming).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=  driver.findElement(ProfessionalProgramming_Validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }
    public static boolean ProfessionalSlickListITCertification()
    {
        try {
            driver.findElement(ProfessionalSlickList_ITCertification).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value= false;
        try {
            value=driver.findElement(ProfessionalITCertification_validation).isDisplayed();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

}
