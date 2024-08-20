package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MostRecentPage extends Base {
    public static By homePageLink = By.xpath("//span[text()='Home']");
    public static By mostRecentLink = By.xpath("//span[text()='Most Recent']");
    private static By pageHeaderMostRecent = By.xpath("//h1[text()='Most Recent']");

    public static void Clickon_Homepage() {
        driver.findElement(homePageLink).click();
    }

    public static void Clickon_MostRecentTab() {
        driver.findElement(mostRecentLink).click();
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
}
