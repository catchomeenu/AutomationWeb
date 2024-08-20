package Automation.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class FilterModulePage extends MostRecentPage {
    public By filterByMenu = By.xpath("//p[text()='Filter By']");

    public By filterOptions = By.xpath("//div[contains(@class,'sidenav_sidebar_filters_container_heading') and contains(@class,'MuiAccordion')]//p");

    public By filterCourseStatus = By.xpath("//div[contains(@class,'sidenav_sidebar_filters_container_heading') and contains(@class,'MuiAccordion')]//p[text()='Course Status']");
    public By course = By.xpath("//span[text()='Enrollment Open']//ancestor::a");


    protected void validateFilterOptionsIsDisplayed() {
        driver.findElement(filterByMenu).isDisplayed();
    }

    protected void validateFilterOptions(List<String> filterOptionsList) {
        List<WebElement> elements = driver.findElements(filterOptions);

        for (WebElement element : elements) {
            //Check filter option displayed is one of the expected
            Assert.assertTrue(filterOptionsList.contains(element.getText()), "Validate Filter Option is available");
        }
    }

    protected void clickOnFilterCourseStatus(String FilterOption) {
        driver.findElement(filterCourseStatus).click();
        By option = By.xpath("//label[text()='" + FilterOption + "']//parent::li//input[contains(@id,'courseFilter')]");
        WebElement element = driver.findElement(option);
        if (!element.isSelected()) {
            driver.findElement(By.xpath("//label[text()='" + FilterOption + "']")).click();
        }
    }

    protected void clickOnCourse() {
        driver.findElement(course).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'courseDetails_abCourse__aT_MD')]//p")).isDisplayed(), "Course Title Displayed");
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'xl:hidden')]//h2[text()='Course Information']")).isDisplayed(), "Course Information displayed");
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'xl:hidden')]//h2[text()='About the Course']")).isDisplayed(), "About the Course displayed");
    }
}
