package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomepageHeaderLinks extends Base {
//Sakthi Element Locators*****


    public static By click_homelink=By.linkText("Home");
    public static By click_animationimg=By.xpath("//a[@href='/course/arts-divya']");
    public static By verify_CourseInfm=By.xpath("//h2[contains(text(),'Course Information')]");
    public static By verify_Aboutthecourse=By.xpath("//div[contains(@class,'flex hidden items-start h-[auto]')]//h2[contains(text(),'About the Course')]");
    public static By click_Modificationimg=By.xpath("//p[contains(text(),'Python')]/ancestor::a");

    //Swathini  Element Locators*****
    public static By home = By.xpath("//span[text()='Home']");
    public static By hb_page = By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");
    public static By course_Info = By.xpath("//h2[contains(text(),'Course Information')]");
    public static By musictheory_page = By.xpath("//h1[@class='ml-4 text-[#383838] !font-primary-font-bold sm:text-[1rem] text-[12px] font-bold']");

    //pooja Element Locators*******
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
    //priya Element Locators*****
    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By nextSwipeButton = By.xpath("//div[contains(@class,'swiper-button-next')]");
    public static By Course_Information = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='Course Information']");
    public static By AboutTheCourse = By.xpath("//div[contains(@class,'xl:flex')]//h2[text()='About the Course']");
    public static By PreviousLinkButton = By.xpath("//div[contains(@class,'swiper-button-prev')]");
    public static By courseTypeHeader = By.xpath("//div[contains(@class,'courseDetails_abCourse__aT_MD')]//p[not(contains(@class,'lg:text'))]");
    public static By courseTitleHeader = By.xpath("//div[contains(@class,'courseDetails_abCourse__aT_MD')]//p[contains(@class,'lg:text')]");

//sakthi Methods******

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


    //Swathini methods
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

//pooja methods

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


//priya methods

    public static By getResults_Headers(String courseName) {
        return By.xpath("//h1[contains(text(),'results for \"" + courseName + "\"')]");
    }

    public static void ValidateClickOnHome(WebDriver driver) {
        driver.findElement(homePageLink).click();
    }

    public static void ClickOn_CourseLinkOnTop(String courseName, WebDriver driver) {
        // move to left most link in header
        WebElement previousLinkButton = driver.findElement(PreviousLinkButton);
        do {
            if (previousLinkButton.getAttribute("class").toLowerCase().contains("swiper-button-disabled")) {
                break;
            } else {
                previousLinkButton.click();
            }
        } while (!previousLinkButton.getAttribute("class").toLowerCase().contains("swiper-button-disabled"));
        // Wait for 2 seconds
        waitMethod(2000);
        // Move to Right And Click on Expected Link
        By parentLink = By.xpath("//p[text()='" + courseName + "']/ancestor::a[contains(@href,'/course')]//ancestor::div[contains(@class,'swiper-slide')]");
        By CourseLink = By.xpath("//p[text()='" + courseName + "']/ancestor::a[contains(@href,'/course')]");
        ClickOnTabLink(driver, parentLink, CourseLink);

    }

    public static void ClickOnTabLink(WebDriver driver, By parentLink, By CourseLink) {
        int counter = 100;
        while (counter > 0) {
            // Parent Check for Class to have Slide Next Property to get it visible
            WebElement parent = driver.findElement(parentLink);
            String class_info = parent.getAttribute("class").toLowerCase();
            if (class_info.contains("swiper-slide-next")) {
                // Click on the Link for Course
                driver.findElement(CourseLink).click();
                waitMethod(500);
                break;
            }
            // If Slide Next is not in property click on next button
            WebElement nextButton = driver.findElement(nextSwipeButton);

            if (nextButton.getAttribute("class").contains("swiper-button-disabled")) {
                // Reached At end of list
                // Click on the Link for Course
                driver.findElement(CourseLink).click();
                waitMethod(500);
                break;
            } else {
                nextButton.click();
            }
            waitMethod(500);
            counter--;
        }
    }

    // Validate Searched for Course
    public static void Validate_CourseResults_Header(String courseName) {
        By results_headers = getResults_Headers(courseName);
        WebElement headerElement = driver.findElement(results_headers);
        Assert.assertTrue(headerElement.isDisplayed(), "Course Results Header is Displayed.");
        System.out.println(headerElement.getText());
    }


    public static void ClickOnFirstCourseLinkAndValidate() {
        By firstLink = By.xpath("//div[contains(@class,'CourseData_four__qc_On') and contains(@class,'most-recent-card')]//a[contains(@href,'/course')]/p");
        WebElement CourseLink = driver.findElement(firstLink);
        Assert.assertTrue(CourseLink.isDisplayed(), "Course Link is Displayed.");
        String text = CourseLink.getText();
        CourseLink.click();
        System.out.println(text);
    }

    public static void Validate_CourseTitleDisplayed() {
        waitForElementToDisplayed(courseTitleHeader);
        WebElement CourseTitle = driver.findElement(courseTitleHeader);
        Assert.assertTrue(CourseTitle.isDisplayed(), "Course Title is Displayed.");
        WebElement CourseHeaderName = driver.findElement(courseTypeHeader);
        Assert.assertTrue(CourseHeaderName.isDisplayed(), "Course Header Name is Displayed.");
        WebElement CourseInformation = driver.findElement(Course_Information);
        Assert.assertTrue(CourseInformation.isDisplayed(), "Course Information is Displayed.");
        WebElement About_The_Course = driver.findElement(AboutTheCourse);
        Assert.assertTrue(About_The_Course.isDisplayed(), "About The Course Information is Displayed.");
        // Print All Messages
        System.out.println(CourseHeaderName.getText());
        System.out.println(CourseTitle.getText());
        System.out.println(CourseInformation.getText());
        System.out.println(About_The_Course.getText());
    }

    private static void waitForElementToDisplayed(By by) {
        WebElement element;
        for (int i = 0; i < 10; i++) {
            waitMethod(3000);
            try {
                element = driver.findElement(by);
                if (element.isDisplayed()) {
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Waiting For Course Title");
            }
        }
    }

    public static void waitMethod(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}