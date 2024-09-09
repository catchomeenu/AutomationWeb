package Automation.pageobjects;
import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class InstructorVideoDashBoard extends Base {

    public static By videoCoursesLink = By.xpath("(//span[text()='Video Courses'])[1]");
    public static By createNewCourse = By.xpath("(//a[@href='/instructor/create-video-course']/button/span[text()='Create New Course'])[1]");
    public static By newCourseRadioButton = By.xpath("//input[@type='radio' and @value='new_course']");
    public static By existingCourseRadioButton = By.xpath("//input[@type='radio' and @value='existing_course']");
    public static By nameInputBox = By.xpath("//input[@id='course_name']");
    public static By imageInputBox = By.xpath("  //div/input[@id='fileInput']");
    public static By descriptionInputBox = By.xpath("//textarea[@id='course_desc']");
    public static By courseForDropDownBox= By.xpath("//div[@class='flex flex-col gap-1 mb-3 col-start-1']");
    public static By courseForList =By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By CourseForKids= By.xpath ("//li[@data-value='KIDS']");
    public static By CourseForProfessionals= By.xpath ("//li[@data-value='KIDS']");
    public static By categoryDropDownBox = By.xpath("//div[@id='course_category']");
    public static By CategoryList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By subcategoryDropDownBox = By.xpath("//div[@id='course_sub_category']");
    public static By subcategoryList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");

    public static By degreeDropDownBox = By.xpath("//div[@id='degree']");
    public static By degreeList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By courseTypeDropDownBox = By.xpath("//div[@id='course_type']");
    public static By courseTypeList =By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");

    public static By durationInputBox = By.xpath("//input[@id='duration' and @type='number']");
    public static By CurrencyDropDownBox = By.xpath("//div[@id='currency']");
    public static By CurrencyList = By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By priceInputBox = By.xpath("//input[@id='price']");
    public static By discountInputBox = By.xpath("//input[@id='discount']");
    public static By saveNext =By.xpath("//button/span[text()='Save & Next']");
    public static By SaveNextc =By.xpath("(//button[@type='button'])[7]");
    public static By saveExit=  By.xpath("//button[@type='button']/span[text()='Save & Exit']");
    //Prerequisites
    public static By prerequisitestitle = By.xpath("//h2[@title='Prerequisites']");
    public static By prerequisitesDesc = By.xpath("//textarea[@class='infy-input-field_form_control__DSHrM !font-primary-font  w-full outline-0 focus:outline-1']");
    public static By prerequisitesAdd = By.xpath("//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-10cofwe']");
    public static By preAddClick= By.xpath("//*[name()='svg'][@data-testid='AddCircleOutlineIcon']");

    public static By LastSaveButton = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'])[2]");
    public static By PreSaveButton= By.xpath("//button[@type='submit']/span[text()='Save & Next']");

    public static By ClickADD= By.xpath("//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-10cofwe'][@data-testid='AddCircleOutlineIcon']");
    public static By addClick=By.xpath("//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-10cofwe' and @data-testid='AddCircleOutlineIcon']");
    public static By learningHeadline = By.xpath("(//li[text()='What you will learn'])[2]");
    public static By lessonDesc=By.xpath("//div[@class='flex flex-col font-primary-font']/textarea[@placeholder='What you will learn']");
    public static By lessonDescriptionbox= By.xpath("//textarea[@class='infy-input-field_form_control__DSHrM !font-primary-font  w-full outline-0 focus:outline-1' and @placeholder='What you will learn']");

    public static By lessonAddbutton=By.xpath("//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-10cofwe']");

    //last session
    public static By sectionName=By.xpath("//input[@class='infy-input-field_form_control__DSHrM !font-primary-font']");
    public static By sectionDesc=By.xpath("//textarea[@id='section_description']");
    public static By lessonAdd1= By.xpath("//div/button/Span[text()='Add'][1]");
    public static By lessonName=By.xpath ("//textarea[@id='lesson_name']");
    public static By lessonDescription=By.xpath("//textarea[@id='lesson_description']");
    public static By LessonVideo=By.xpath("//input[@id='fileInput']");
    public static By lessonadd2= By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'])[2]");
    public static By sendForApprovalButton =By.xpath("//span[text()='Send for Approval']");
    public static By selectPreview= By.xpath("//div/input[@id='enable-demo-request-checkbox']");
    public static By homeLink = By.xpath("//a[@href='/']/img[@alt='logo']");
    public static By dashboardText=By.xpath("//span[@class='md:text-[14px] text-[14px] md:leading-[23px] leading-[20px] font-semibold text-[#2a2a2a]' and text()='Dashboard']");
public static By IDashBoardClick= By.xpath("//span[@class='md:text-[14px] text-[14px] md:leading-[23px] leading-[20px] font-semibold text-[#2a2a2a]' and text()='Dashboard']");
public static By videoApprovalOutput =By.xpath("//div[@class='infy-alert_message__82tjA m-0 p-0 text-sm']");
//Methods

    public static void clickInstructorDashBoard(){
        try {
            driver.findElement(IDashBoardClick).click();
            System.out.println("Click on instructor dashBoard page ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickVideoCoursesLink() {
        try {
            driver.findElement(videoCoursesLink).click();

            System.out.println("Video  courses link got clicked " );
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickVideoNewCourse() {
        try {
            driver.findElement(createNewCourse).click();

            System.out.println("Create New course button is clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void VideoExistingCourse() {
        try {
            driver.findElement(existingCourseRadioButton).click();

            System.out.println("Existing course button is clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void ClickNewCourseRadio() {
        try {
            driver.findElement(newCourseRadioButton).isSelected();

            System.out.println("Radio button is selected ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void enterNewCourseName(String name) {
        try {
            driver.findElement(nameInputBox).sendKeys(name);

            System.out.println("Video Course Name Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void selectImage(String path) {
        try {

            driver.findElement(imageInputBox).sendKeys(path);
            System.out.println("Image Selected ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterDescription(String description) {
        try {
            driver.findElement(descriptionInputBox).sendKeys(description);
            System.out.println("Course Description Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void courseForDDClick(String CText) {
        try {
            driver.findElement(courseForDropDownBox).click();
            System.out.println("Course For Is clicked");
            List<WebElement> OptionsForCourse = driver.findElements(courseForList);
            System.out.println(OptionsForCourse.size());
            for(WebElement cOptions1: OptionsForCourse) {
                String CT = cOptions1.getText();
                if (CT.equals(CText)) {
                    cOptions1.click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void selectCourseFor(String courseText) {
        try {
            //click the Course DD
            driver.findElement(courseForDropDownBox).click();
            System.out.println("Course For Is clicked");
            //locate the course for options
            List<WebElement> OptionsForCourse = driver.findElements(courseForList);
            System.out.println(OptionsForCourse.size());
            for (int i=0;i<OptionsForCourse.size();i++ ){
                String COptions = OptionsForCourse.get(i).getText();
                if (COptions.equals(courseText)){
                    OptionsForCourse.get(i).click();
                    break;
                }
            }
            System.out.println("Selected CourseFor : " + courseText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCategory(String categoryText) {
        try {
            //click the category DD
            WebElement categoryOptions = driver.findElement(categoryDropDownBox);
            categoryOptions.click();
            //locate the category options
            List<WebElement> allOptionsCategory = driver.findElements(CategoryList);
            System.out.println(allOptionsCategory.size());


            for (WebElement catOptions : allOptionsCategory )
            {
                String Category= catOptions.getText();
                if(Category.equals(categoryText)){
                    catOptions.click();
                    break;
                }
            }System.out.println("Selected Category: " + categoryText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static void selectSubcategory(String subCatText) {
        try{
            WebElement subCatOptions = driver.findElement(subcategoryDropDownBox);
            subCatOptions.click();
            List<WebElement>  allSubCatOptions= driver.findElements(subcategoryList);
            System.out.println(allSubCatOptions.size());

            for (WebElement SubOptions: allSubCatOptions){
                String subCat= SubOptions.getText();
                if( subCat.equals(subCatText)){
                    SubOptions.click();
                    break;
                }
            } System.out.println("Selected Subcategory" +subCatText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void selectDegreeDD(String DegreeText){
        try{
            WebElement DegreeOptions = driver.findElement(degreeDropDownBox);
            DegreeOptions.click();

            List<WebElement>  allDegreeOptions= driver.findElements(degreeList);
            System.out.println(allDegreeOptions.size());

            for (WebElement dOptions: allDegreeOptions)
            {
                String DT= dOptions.getText();
                if( DT.equals(DegreeText)){
                    dOptions.click();
                    break;
                }
            }
            System.out.println("Selected Degree" +DegreeText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void courseType(String CourseText){
        try{
            WebElement CourseTypeOptions = driver.findElement(courseTypeDropDownBox);
            CourseTypeOptions.click();
            List<WebElement>  AllCourseTypeOptions= driver.findElements(courseTypeList);
            System.out.println(AllCourseTypeOptions.size());

            for (WebElement TypeOptions: AllCourseTypeOptions){
                String TO= TypeOptions.getText();
                if( TO.equals(CourseText)){
                    TypeOptions.click();
                    break;
                }
            }
            System.out.println("Selected CourseType" +CourseText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void enterDuration(String hours) {
        try {
            driver.findElement(durationInputBox).sendKeys(hours);
            System.out.println("Duration entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void currency(String dollarText){
        try{
            WebElement currencyOptions = driver.findElement(CurrencyDropDownBox);
            currencyOptions.click();

            List<WebElement>  allCurrencyOptions= driver.findElements(CurrencyList);
            System.out.println(allCurrencyOptions.size());


            for (WebElement Options: allCurrencyOptions){
                String DT= Options.getText();
                if( DT.equals(dollarText)){
                    Options.click();
                    break;
                }
            }
            System.out.println("Selected Currency" +dollarText);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void price(String price){
        try {
            driver.findElement(priceInputBox).sendKeys(price);
            System.out.println("Price Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void discount(String code){
        try {
            driver.findElement(discountInputBox).sendKeys(code);
            System.out.println("Code Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void clickSaveNext(){
        try {
            driver.findElement(saveNext).click();
            System.out.println("Save&Next  is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void clickSaveExit(){
        try {
            driver.findElement(saveExit).click();
            System.out.println("Save&Exit   is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //Prerequisites
    public static boolean verifyPrerequisites(){
        boolean result = false;
        try {
            result = driver.findElement(prerequisitestitle).isDisplayed();
            System.out.println("Prerequisities   is clicked ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void prerequisitesDescription(String Desc){

        try {
            driver.findElement(prerequisitesDesc).clear();
            driver.findElement(prerequisitesDesc).sendKeys(Desc);
            System.out.println("Description Entered ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickPrerequisitesAdd(){
        try {
            driver.findElement(ClickADD).click();
            System.out.println("Add  is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  /*  try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement PreAddField = wait.until(ExpectedConditions.presenceOfElementLocated(ClickADD));
        PreAddField.click();
        System.out.println("prerequisites Added button is clicked ");

    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }*/
    }
  public static void addClick(){
      try {
          driver.findElement(addClick).click();
          System.out.println("Add  is clicked ");
      } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
  }
    //Learning Lessons
    public static boolean verifyLessons(){
        boolean result = false;
        try {
            result = driver.findElement(learningHeadline).isDisplayed();
            System.out.println("Learning Headlines are displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void lessonDescriptioninputBox(String Description){

        try {
            Thread.sleep(3000);
            driver.findElement(lessonDescriptionbox).clear();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement descriptionField = wait.until(ExpectedConditions.presenceOfElementLocated(lessonDescriptionbox));
            descriptionField.sendKeys(Description);
            System.out.println("what you will learn Description Entered ");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the case where the element is not found
            e.printStackTrace();
            //   driver.findElement(lessonDescriptionbox).clear();
            //    driver.findElement(lessonDescriptionbox).sendKeys(Description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void clickLessonsAdd(){
        try {
            //   driver.switchTo().defaultContent();
            driver.findElement(lessonAddbutton).click();
            System.out.println("Lesson Added ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /*  public static void SaveNextb(){
          try {
              driver.findElement(SaveNextb).click();
              System.out.println("Save&Next  is clicked ");
          } catch (Exception e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
          }
      }*/
    public static void SaveNextc(){
        try {
            driver.findElement(SaveNextc).click();
          /*  JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement SaveClick = driver.findElement(SaveNextc);
            js.executeScript("arguments[0].click();", SaveClick);*/
            System.out.println("Save&Next  is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

///FINAL lESSON NAMES


    public static void enterSectionName(String Name){
        try {
            driver.findElement(sectionName).sendKeys(Name);
            System.out.println("Video Course Name Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void enterSectionDesc(String Desc){
        try {
            driver.findElement(sectionDesc).clear();
            driver.findElement(sectionDesc).sendKeys(Desc);
            System.out.println("Lessons Description Entered ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void SectionDuration(String Hours){
        try {

            driver.findElement(durationInputBox).sendKeys(Hours);
            System.out.println("Duration entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void durationAdd(){
        try {
            driver.findElement(lessonAdd1).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void lessonWindowName(String Name){
        try {
            driver.findElement(lessonName).sendKeys(Name);
            System.out.println("Lesson Name Entered ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void lessonDesc(String Desc){

        try {
            driver.findElement(lessonDescription).clear();
            driver.findElement(lessonDescription).sendKeys(Desc);
            System.out.println("Lesson Description Entered ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void uploadLessonVideo(String Path){
        try {

            driver.findElement(imageInputBox).sendKeys(Path);
            System.out.println("Video Selected ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void lessonDuration(String Hours){
        try {

            driver.findElement(durationInputBox).sendKeys(Hours);
            System.out.println("Duration entered");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void clickLessonAdd(){
        try {
            //  driver.findElement(lessonadd2).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement AddLessonField = wait.until(ExpectedConditions.presenceOfElementLocated(lessonadd2));
            AddLessonField.click();
            System.out.println("Lesson added  ");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the case where the element is not found
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void selectPreview(){
        try {
            driver.findElement(selectPreview).click();
            System.out.println("Preview Selected  ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void lessonSaveExit(){
        try {
            driver.findElement(lessonAdd1).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void sendForApproval(){
        try {
            // Thread.sleep(3000);
            // driver.findElement(sendForApprovalButton).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement ApprovalField = wait.until(ExpectedConditions.presenceOfElementLocated(sendForApprovalButton));
            ApprovalField.click();
            System.out.println("Finally, Sent for Approval ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void clickPreSaveButton() {
        try {
            driver.findElement(PreSaveButton).click();
            System.out.println("Clicked on Save&Next Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

public static void clickLessonSave(){
    try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement saveLessonField = wait.until(ExpectedConditions.presenceOfElementLocated(LastSaveButton));
        saveLessonField.click();
        //  driver.findElement(LastSaveButton).click();
        System.out.println("lesson saved Button clicked");
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    public static boolean outputVideoPresence() {
        boolean result = false;
        try {
            driver.findElement(videoApprovalOutput).isDisplayed();
            System.out.println("VideoLesson Approval");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    public static void clickHomeLink() {
        try {
            driver.findElement(homeLink).click();
            System.out.println("Clicked HomeLink on instructor  Dashboard Page to see the Approval");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean learnTextPresence() {
        boolean result = false;
        try {
            driver.findElement(prerequisitestitle).isDisplayed();
            System.out.println("Prerequisites Title is displayed");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

}
