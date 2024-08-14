package Automation.pageobjects;


import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KidsClickimage extends Base {
    public static boolean clickImagefromkids(String value){

        boolean result=false;
        try
          {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'"+value+"')]")));

            WebElement element=   driver.findElement(By.xpath("//p[contains(text(),'"+value+"')]"));
            element.click();
            System.out.println(value+"Value is clicked as expected");

            WebElement element1=   driver.findElement(By.xpath("//h1[contains(text(),'"+value+"')]"));
            result=element1.isDisplayed();

         }
        catch(Exception e)
            {
            e.printStackTrace();
            }
          return result ;
        }

    }




