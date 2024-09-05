package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class InstructorDashBoardPage extends Base {
    public static By liveCoursesLink = By.xpath("//span[text()='Live Courses']");
    public static By createNewCourseLink = By.xpath("//span[text()='Create New Course']");
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
    
   // public static By startDateCalendar_Icon = By.xpath("(//button[@aria-label='Choose date'])[1]");

    public static By endDateCalendar_Icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[2]");
    //public static By endDateCalendar_Icon = By.xpath("(//button[@aria-label='Choose date'])[2]");
    public static By monthYearButton = By.xpath("//div[@class='MuiPickersCalendarHeader-label css-1v994a0']");
    public static By nextMonth = By.xpath("//*[local-name()='svg'][@data-testid='ArrowRightIcon']");
    public static By dates = By.xpath("//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-6exafu']");
    public static By previousMonth = By.xpath("//*[local-name()='svg'][@data-testid='ArrowLeftIcon']");

   public static By enrollmentStarDateCalendar_icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[3]");
    public static By enrollmentEndDateCalendar_icon = By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'][@data-testid='CalendarIcon'])[4]");
   //public static By enrollmentStarDateCalendar_icon = By.xpath("(//button[@aria-label='Choose date'])[3]");
   //public static By enrollmentEndDateCalendar_icon = By.xpath("(//button[@aria-label='Choose date'])[4]");
    public static By durationInputBox = By.xpath("//input[@id='duration']");
    public static By currencyComboBox=By.xpath("(//div[@id='currency'])[1]");
    public static By currencyComboBoxList=By.xpath("//ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By priceInputBox = By.xpath("(//input[@id='price'])[1]");
    public static By save_NextButton=By.xpath("//span[contains(text(),'Save & Next')]");
    //Logout links
    public static By accountNameDropDown = By.xpath("//p[@class='!font-primary-font-bold']");
    public static By logoutButton = By.xpath("//span[text()='Log Out']");


    public static void clickLiveCoursesLink() {
        try {
            driver.findElement(liveCoursesLink).click();

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

    public static void selectCategory() {
        try {
            driver.findElement(categoryComboBox).click();

            System.out.println("Selected Category");

            List<WebElement> categoryList = driver.findElements(categoryComboBoxList);
            //System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("Technology")) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectSubCategory() {
        try {
            driver.findElement(subCategoryComboBox).click();

            System.out.println("Selected SubCategory");

            List<WebElement> categoryList = driver.findElements(subCategoryComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("Programming")) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectDegree() {
        try {
            driver.findElement(degreeComboBox).click();

            System.out.println("Selected Degree");

            List<WebElement> categoryList = driver.findElements(degreeComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("Beginner")) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public static void selectCourseType() {
        try {
            driver.findElement(courseTypeComboBox).click();

            System.out.println("Selected CourseType");

            List<WebElement> categoryList = driver.findElements(courseTypeComboBoxList);
           // System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("Paid")) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCourseStructure() {
        try {
            driver.findElement(courseStructureComboBox).click();

            System.out.println("Selected CourseStructure");

            List<WebElement> categoryList = driver.findElements(courseStructureComboBoxList);

            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("One-time")) {
                    categoryList.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectDate(String monyr, String da) {
        try {
            String mon_yr = monyr;
            String date = da;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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

    public static void selectStartDate(String my, String d) {
        try {
            driver.findElement(startDateCalendar_Icon).click();
           String mon_yr = my;
           String date = d;

            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("StartDate Selected ");



        } catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            driver.findElement(startDateCalendar_Icon).click();
            String mon_yr = my;
            String date = d;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("StartDate Selected ");

            e.printStackTrace();
        }
    }

    public static void selectEndDate(String my2, String d2) {
        try {
             // Create an explicit wait
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //WebElement ele = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(endDateCalendar_Icon)));


            driver.findElement(endDateCalendar_Icon).click();

            String mon_yr = my2;
            String date = d2;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("EndDate Selected ");
        } catch (StaleElementReferenceException e) {

            // TODO Auto-generated catch block
           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            //WebElement ele = wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(endDateCalendar_Icon)));
            driver.findElement(endDateCalendar_Icon).click();

            String mon_yr = my2;
            String date = d2;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("EndDate Selected ");

            e.printStackTrace();
        }
    }


    public static void selectEnrollmentStartDate(String my3, String d3) {
        try {
            driver.findElement(enrollmentStarDateCalendar_icon).click();
            String mon_yr = my3;
            String date = d3;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("Enrollment StartDate Selected ");
        } catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            driver.findElement(enrollmentStarDateCalendar_icon).click();
            String mon_yr = my3;
            String date = d3;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("Enrollment StartDate Selected ");

            e.printStackTrace();
        }
    }

    public static void selectEnrollmentEndDate(String my4, String d4) {
        try {

            driver.findElement(enrollmentEndDateCalendar_icon).click();
            String mon_yr = my4;
            String date = d4;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("Enrollment End Date Selected ");
        } catch (StaleElementReferenceException e) {
            // TODO Auto-generated catch block
            driver.findElement(enrollmentEndDateCalendar_icon).click();
            String mon_yr = my4;
            String date = d4;
            //select month & year
            while (true) {
                String Mon_year = driver.findElement(monthYearButton).getText();
                if (Mon_year.equals(mon_yr)) {

                    break;
                }
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
            System.out.println("Enrollment EndDate Selected ");

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

    public static void selectCurrency() {
        try {

            driver.findElement(currencyComboBox).click();

            System.out.println("Selected currency");

            List<WebElement> categoryList = driver.findElements(currencyComboBoxList);
            //System.out.println(categoryList.size());
            for (int i = 0; i < categoryList.size(); i++) {
                String text = categoryList.get(i).getText();
                if (text.equals("USD")) {
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

