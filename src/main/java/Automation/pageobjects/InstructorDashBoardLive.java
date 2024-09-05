package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InstructorDashBoardLive extends Base {
    public static By liveCoursesLink = By.xpath("//span[text()='Live Courses']");
    public static By createNewCourseLink = By.xpath("//span[text()='Create New Course']");
    //Details Links
    public static By newCourseRadioButton = By.xpath("//input[@type='radio' and @value='new_course']");
    public static By nameInputBox = By.xpath("//input[@id='course_name']");
    public static By imageInputBox = By.xpath(" //input[@id='fileInput' and @type='file']");
    public static By descriptionInputBox = By.xpath("//textarea[@id='course_desc']");
    public static By categoryComboBox = By.xpath("//div[@id='course_category']");
    public static By categoryComboBoxList = By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By subCategoryComboBox = By.xpath(" //div[@id='course_sub_category']");
    public static By subCategoryComboBoxList = By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9' and @aria-labelledby='course_sub_category']/li");
    public static By degreeComboBox = By.xpath("//div[@id='degree']");
    public static By degreeComboBoxList = By.xpath("//ul[@aria-labelledby='degree']/li");
    public static By courseTypeComboBox = By.xpath("//div[@id='course_type']");
    public static By courseTypeComboBoxList = By.xpath("//ul[@aria-labelledby='course_type']/li");
    public static By courseStructureComboBox = By.xpath("//div[@id='fee_frequency']");
    public static By courseStructureComboBoxList = By.xpath("//ul[@aria-labelledby='fee_frequency']/li");
    public static By startDateCalendar_Icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[1]");
    public static By endDateCalendar_Icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[2]");
    public static By monthYearButton = By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']");
    public static By nextMonth = By.xpath("//button[@title='Next month']");
    public static By dates = By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-mydeyd']");
    public static By enrollmentStarDateCalendar_icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[3]");
    public static By enrollmentEndDateCalendar_icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[4]");
    public static By demoCheckBox = By.xpath("//label[@class=' border border-transparent rounded-[2px] cursor-pointer relative text-[#FF6600]']");
    public static By durationInputBox = By.xpath("//input[@id='duration']");
    public static By currencyComboBox=By.xpath("(//div[@id='currency'])[1]");
    public static By currencyComboBoxList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By priceInputBox = By.xpath("(//input[@id='price'])[1]");
    public static By save_NextButton=By.xpath("//span[contains(text(),'Save & Next')]");
    public static By demoRequestButton_Y=By.xpath("//span[contains(text(),'Yes')]");
    //public static By demoRequestButton_N=By.xpath("//span[contains(text(),'No')]");

    //Prerequisite links
    public static By prerequisiteTextBox=By.xpath("//textarea[@placeholder='Prerequisite']");
    public static By addButton=By.xpath("//button[@type='button']/span[text()='Add']");
    public static By saveButton=By.xpath("//button[@type='button']/span[text()='Save & Next']");


    //What you will learn Links
    public static By whatYouWillLearnTextBox=By.xpath("//div[@class='flex flex-col font-primary-font']/textarea[@placeholder='What you will learn']");


    //Topics Links
    public static By topicInpBox=By.xpath("//input[@id='content_header' and @placeholder='Topic']");
    public static By subTopicInpBox=By.xpath("//input[@id='content_desc' and @placeholder='Sub Topic']");
    public static By subTopicAddButton=By.xpath("//button[@class='absolute top-[1.8rem] md:top-[2.1rem] right-2']");
    public static By topicDurationHours=By.xpath("//input[@placeholder='HH']");
    public static By topicDurationMinutes=By.xpath("//input[@placeholder='MM']");
    public static By topicDurationAddButton=By.xpath("//button[@type='submit']/span[text()='Add']");

    //Sessions Links
    public static By sessionName=By.xpath("//input[@id='firstName']");
    public static By sessionStartDate=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[1]");
    public static By allDayCheckBox=By.xpath("//div[@class='flex flex-row items-center mt-2 text-xs']/child::label[1]");
    public static By sessionFromTimeHours=By.xpath("//label[text()='From Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::input[@placeholder='HH']");
    public static By sessionFromTimeMinutes=By.xpath("//label[text()='From Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::input[@placeholder='MM']");
    public static By sessionClockFromTime=By.xpath("//label[text()='From Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::button");
    public static By sessionClockList=By.xpath("//ul[@class='w-full flex flex-col gap-0.5 outline-none']/li");
    public static By sessionToTimeHours=By.xpath("//label[text()='To Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::input[@placeholder='HH']");
    public static By sessionToTimeMinutes=By.xpath("//label[text()='To Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::input[@placeholder='MM']");
    //public static By sessionClockToTime=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='ArrowDropDownIcon'])[2]");
    public static By sessionClockToTime=By.xpath("//label[text()='To Time']/following-sibling::div[@class=' flex space-x-2 items-center']/child::button");
    public static By sessionTimeZone=By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary w-full h-[40px] css-1wcfnna']/div[contains(text(),'Asia/Kolkata')]");
    public static By sessionTimeZoneList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9' and @role='listbox']/li");
    public static By recurrenceCheckBox=By.xpath("//div[@class='flex flex-row items-center opacity-100 pointer-events-auto']/child::label[1]");
    public static By untilCourseEndDateCheckBox=By.xpath("//div[@class='mt-[15px] text-xs w-[50%] flex  items-center']/child::label[1]");
    public static By sessionEndDate=By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[3]");
    public static By sessionAddButton=By.xpath("//div[@class='flex flex-col gap-2 justify-center']/child::button");
    public static By sendForApprovalButton=By.xpath("//span[text()='Send for Approval']/parent::button");
    //Logout links
    public static By accountNameDropDown = By.xpath("//p[@class='!font-primary-font-bold']");
    public static By logoutButton = By.xpath("//span[text()='Log Out']");


    public static String mon_yr;
    public static String date;

    public static void clickLiveCoursesLink() {
        try {
            driver.findElement(liveCoursesLink).click();
            System.out.println("******Instructor Create LiveCourses Testcases started******");
            System.out.println("Clicked on live courses link");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickNewCourseLink() {
        try {
            driver.findElement(createNewCourseLink).click();

            System.out.println("Clicked on create new course link");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /***********Create New Course Details Page*****/

    public static void verifyNewCourseRadioButton() {
        try {
            driver.findElement(newCourseRadioButton).isSelected();

            System.out.println("Verified New course button is selected ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }



    public static void enterNewCourseName(String name) {
        try {
            driver.findElement(nameInputBox).sendKeys(name);

            System.out.println("Course Name Entered ");
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

    public static void enterNewCourseDescription(String description) {
        try {
            driver.findElement(descriptionInputBox).sendKeys(description);

            System.out.println("Course Description Entered ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCategory(String category) {
        try {
            driver.findElement(categoryComboBox).click();

            System.out.println("Selected Category");

            List<WebElement> categoryList = driver.findElements(categoryComboBoxList);
            //System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(category)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectSubCategory(String subCategory) {
        try {
            driver.findElement(subCategoryComboBox).click();

            System.out.println("Selected SubCategory");

            List<WebElement> categoryList = driver.findElements(subCategoryComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(subCategory)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectDegree(String degree) {
        try {
            driver.findElement(degreeComboBox).click();

            System.out.println("Selected Degree");

            List<WebElement> categoryList = driver.findElements(degreeComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(degree)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void selectCourseType(String courseType) {
        try {
            driver.findElement(courseTypeComboBox).click();

            System.out.println("Selected CourseType");

            List<WebElement> categoryList = driver.findElements(courseTypeComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(courseType)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCourseStructure(String courseStructure) {
        try {
            driver.findElement(courseStructureComboBox).click();

            System.out.println("Selected CourseStructure");

            List<WebElement> categoryList = driver.findElements(courseStructureComboBoxList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(courseStructure)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectDate() {
        try {
             //select month & year
            while (true) {
//                WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
//                WebElement Mon_Year_Btn= mywait.until(ExpectedConditions.visibilityOfElementLocated(monthYearButton));
//                String Mon_year= Mon_Year_Btn.getText();
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {
                    break;
                }

//                WebElement nxt_Mon_Btn= mywait.until(ExpectedConditions.visibilityOfElementLocated(nextMonth));
//                nxt_Mon_Btn.click();
               driver.findElement(nextMonth).click();//future date
            }
            //select date
            List<WebElement> alldates = driver.findElements(dates);
            for (WebElement dt : alldates) {
                if (dt.getText().equals(date)) {
                    dt.click();
                    break;
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void selectStartDate(String my,String da) {
        try {
            mon_yr=my;
            date=da;
            WebElement Date1=  driver.findElement(startDateCalendar_Icon);
            Date1.click();
            selectDate();
            System.out.println("StartDate Selected ");

        }catch (StaleElementReferenceException  e) {

            WebElement Date1=  driver.findElement(startDateCalendar_Icon);
            Date1.click();
            selectDate();
            System.out.println("StartDate Selected ");
            e.printStackTrace();
        }
    }

    public static void selectEndDate(String my, String da) {
        try {

            mon_yr=my;
            date=da;
            WebElement Date2=  driver.findElement(endDateCalendar_Icon);
            Date2.click();
            Thread.sleep(1000);
            selectDate();
            System.out.println("EndDate Selected ");

        }catch (StaleElementReferenceException | InterruptedException e) {

            WebElement Date2=  driver.findElement(endDateCalendar_Icon);
            Date2.click();
            selectDate();
            System.out.println("EndDate Selected ");
            e.printStackTrace();
        }
    }


    public static void selectEnrollmentStartDate(String my, String da) {
        try {
            // Create an explicit wait
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //  WebElement ele = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(enrollmentStarDateCalendar_icon)));

            mon_yr=my;
            date=da;
            WebElement Date3=  driver.findElement(enrollmentStarDateCalendar_icon);
            Date3.click();
            Thread.sleep(1000);
            selectDate();
            System.out.println("Enrollment Start Date Selected ");

        }catch (StaleElementReferenceException | InterruptedException e) {

            WebElement Date3=  driver.findElement(enrollmentStarDateCalendar_icon);
            Date3.click();
            selectDate();
            System.out.println("Enrollment Start Date Selected ");
            e.printStackTrace();
        }
    }

    public static void selectEnrollmentEndDate(String my, String da) {
        try {

            mon_yr=my;
            date=da;
            WebElement Date4=  driver.findElement(enrollmentEndDateCalendar_icon);
            Date4.click();
            Thread.sleep(1000);
            selectDate();
            System.out.println("Enrollment End Date Selected ");

        }catch (StaleElementReferenceException | InterruptedException e) {

            WebElement Date4=  driver.findElement(enrollmentEndDateCalendar_icon);
            Date4.click();
            selectDate();
            System.out.println("Enrollment End Date Selected ");
            e.printStackTrace();
        }
    }

    public static void selectDemoCheckBox() {
        try {

            driver.findElement(demoCheckBox).click();
            System.out.println("Demo request selected");
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

    public static void selectCurrency(String currency) {
        try {

            driver.findElement(currencyComboBox).click();

            System.out.println("Selected currency");

            List<WebElement> categoryList = driver.findElements(currencyComboBoxList);
            //System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(currency)) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterPrice(String price) {
        try {

            driver.findElement(priceInputBox).sendKeys(price);
            System.out.println("Course Price entered ");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickSave_Next() {
        try {
            driver.findElement(save_NextButton).click();

            System.out.println("Clicked on Save&Next");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void clickYesForDemo() {
        try {
            driver.findElement(demoRequestButton_Y).click();

            System.out.println("Clicked on yes for Demo Request");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    /***********Create New Course Prerequisite Page**********/

    public static void enterPrerequisites(String preReq) {
        try {
            driver.findElement(prerequisiteTextBox).sendKeys(preReq);
            Thread.sleep(2000);
            System.out.println("Entered Pre-requisite for course");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickAddButton() {
        try {
            driver.findElement(addButton).click();
            System.out.println("Clicked on add button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickSaveButton() {
        try {
            driver.findElement(saveButton).click();
            System.out.println("Clicked on Save&Next Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /***********Create New Course What you will Learn Page**********/
    public static void enterWhatYouWillLearn(String learn) {
        try {
            driver.findElement(whatYouWillLearnTextBox).sendKeys(learn);
            Thread.sleep(2000);
            System.out.println("Entered topics to learn");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /***********Create New Course Topics Page**********/

    public static void enterTopic(String topic) {
        try {
            driver.findElement(topicInpBox).sendKeys(topic);

            System.out.println("Entered topic");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void enterSubTopic(String subTopic) {
        try {
            driver.findElement(subTopicInpBox).sendKeys(subTopic);

            System.out.println("Entered SubTopic");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void addSubTopic() {
        try {
            driver.findElement(subTopicAddButton).click();

            System.out.println("SubTopic added");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void enterSubtopicDuration_Hours(String hours) {
        try {
            driver.findElement(topicDurationHours).sendKeys(hours);

            System.out.println("Entered Hours");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void enterSubtopicDuration_Minutes(String minutes) {
        try {
            driver.findElement(topicDurationMinutes).sendKeys(minutes);

            System.out.println("Entered Minutes");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void addTopicDuration() {
        try {
            driver.findElement(topicDurationAddButton).click();

            System.out.println("Entered SubTopic");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /***********Create New Course Sessions Page**********/

    public static void enterSessionName(String sName) {
        try {
            driver.findElement(sessionName).sendKeys(sName);

            System.out.println("Entered Session Name");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void selectSessionStartDate(String my,String da) {
        try {
            mon_yr=my;
            date=da;
            WebElement Date5=  driver.findElement(sessionStartDate);
            Date5.click();
            Thread.sleep(1000);
            selectDate();
            System.out.println("Session StartDate Selected ");

        }catch (StaleElementReferenceException | InterruptedException e) {

            WebElement Date5=  driver.findElement(sessionStartDate);
            Date5.click();
            selectDate();
            System.out.println("Session StartDate Selected ");
            e.printStackTrace();
        }
    }

    public static void selectAllDay() {
        try {
            driver.findElement(allDayCheckBox).click();

            System.out.println("select allDay CheckBox");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterSessionFromTimeHours(String ftHours) {
        try {
            driver.findElement(sessionFromTimeHours).sendKeys(ftHours);

            System.out.println("Entered session From Time Hours");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterSessionFromTimeMinutes(String ftMinutes) {
        try {
            driver.findElement(sessionFromTimeMinutes).sendKeys(ftMinutes);

            System.out.println("Entered session From Time Minutes");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectSessionFromTimeClock(String ftClock) {
        try {
            driver.findElement(sessionClockFromTime).click();

            System.out.println("Selected Session From Time Clock");

            List<WebElement> categoryList = driver.findElements(sessionClockList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(ftClock)) {
                    categoryList.get(i).click();

                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            driver.findElement(sessionClockFromTime).click();

            System.out.println("Selected Session From Time Clock");

            List<WebElement> categoryList = driver.findElements(sessionClockList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(ftClock)) {
                    categoryList.get(i).click();
                    break;
                }
            }

            e.printStackTrace();
        }

    }
    public static void enterSessionToTimeHours(String ttHours) {
        try {
//            JavascriptExecutor js= (JavascriptExecutor)driver;
//
//            WebElement TTH=driver.findElement(sessionToTimeHours);
//            js.executeScript("arguments[0].setAttribute('value','07')", TTH);

          driver.findElement(sessionToTimeHours).sendKeys(ttHours);

            System.out.println("Entered session To Time Hours");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterSessionToTimeMinutes(String ttMinutes) {
        try {
//            JavascriptExecutor js= (JavascriptExecutor)driver;
//
//            WebElement TTM=driver.findElement(sessionToTimeMinutes);
//            js.executeScript("arguments[0].setAttribute('value',ttMinutes)", TTM);
         driver.findElement(sessionToTimeMinutes).sendKeys(ttMinutes);

            System.out.println("Entered session To Time Minutes");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectSessionToTimeClock(String ttClock) {
        try {
            driver.findElement(sessionClockToTime).click();
            System.out.println("Selected Session To Time Clock");

            List<WebElement> categoryList = driver.findElements(sessionClockList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(ttClock)) {
                    categoryList.get(i).click();

                    break;
                }
            }
        } catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            driver.findElement(sessionClockToTime).click();
            System.out.println("Selected Session To Time Clock");

            List<WebElement> categoryList = driver.findElements(sessionClockList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(ttClock)) {
                    categoryList.get(i).click();
                    break;
                }
            }
            e.printStackTrace();
        }

    }

    public static void selectTimeZone(String timeZone) {
        try {
            driver.findElement(sessionTimeZone).click();
            System.out.println("Selected Session Time Zone");

            List<WebElement> categoryList = driver.findElements(sessionTimeZoneList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals(timeZone)) {
                    categoryList.get(i).click();
                    break;
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void selectRecurrence() {
        try {
            driver.findElement(recurrenceCheckBox).click();
            System.out.println("selected recurrence ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void selectUntilCourseEndDate() {
        try {
            JavascriptExecutor js= (JavascriptExecutor) driver;
            WebElement chkbox=driver.findElement(untilCourseEndDateCheckBox);
            js.executeScript("arguments[0].click();", chkbox);
            //driver.findElement(untilCourseEndDateCheckBox).click();
            System.out.println("selected Until Course EndDate");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void selectSessionEndDate(String my,String da) {
        try {
            mon_yr=my;
            date=da;
            WebElement Date6=  driver.findElement(sessionEndDate);
            Date6.click();
            Thread.sleep(2000);
            selectDate();
            System.out.println("Session EndDate Selected ");

        }catch (StaleElementReferenceException | InterruptedException e) {

            WebElement Date6=  driver.findElement(sessionEndDate);
            Date6.click();
            selectDate();
            System.out.println("Session EndDate Selected");
            e.printStackTrace();
        }
    }

    public static void clickSessionAddButton() {
        try {
            driver.findElement(sessionAddButton).click();

            System.out.println("Clicked session Add Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickApprovalButton() {
        try {
            driver.findElement(sendForApprovalButton).click();

            System.out.println("Clicked Send For Approval Button");
            System.out.println("******Instructor Create LiveCourses Testcases Ended******");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //logout methods
    public static void clickAccountName() {
        try {
            driver.findElement(accountNameDropDown).click();

            System.out.println("Clicked Account Icon/Name");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickLogout() {
        try {
            driver.findElement(logoutButton).click();

            System.out.println("Logged Out from the Account");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}

