package Automation.pageobjects;

import Automation.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MostRecentPage extends TestBase {
    public static By homePageLink = By.xpath("//span[text()='Home']//ancestor::div[contains(@class,'MuiListItemIcon')]//a");
    public static By mostRecentLink = By.xpath("//span[text()='Most Recent']//ancestor::div[contains(@class,'MuiListItemIcon')]//a");
    private static By pageHeaderMostRecent = By.xpath("//h1[text()='Most Recent']");

    public static void clickOnWebElement(WebDriver driver, By mostRecentLink) {
        driver.findElement(mostRecentLink).click();
    }

    public static void validatePageIsOpen(WebDriver driver) throws InterruptedException {
        Assert.assertTrue(driver.findElement(pageHeaderMostRecent).isDisplayed(), "Validate Most Recent header is displayed");
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://devnj.infyni.com/most-recent", "Validate Page is opened");
    }

    protected void validateCoursesTabs(String tabName) {
        //button[text()='Professionals']
        WebElement tabLinkElement = driver.findElement(By.xpath("//button[text()='" + tabName + "']"));
        Assert.assertTrue(tabLinkElement.isDisplayed(), "Validate Tab " + tabName + " is displayed");
        tabLinkElement.click();
        Assert.assertTrue(tabLinkElement.isEnabled(), "Validate Tab " + tabName + " is enabled");
    }
}
