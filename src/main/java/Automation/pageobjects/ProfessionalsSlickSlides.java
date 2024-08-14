package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfessionalsSlickSlides extends Base {

    public static By ProfessionalSlickList_Technology=By.xpath("//p[@class='card_active !pl-[20px] font-primary-font-bold']");
    public static By ProfessionalTechnology_Validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']");

    public static By ProfessionalSlickList_FreeCourse=By.xpath("//div[@data-index= '1']//p[text()='Free Course']");
    public static By ProfessionalFreeCourse_Validation=By.xpath("//h1[contains(text(),'Free Course')]");


    public static By ProfessionalSlickList_Programming=By.xpath("//div[@data-index= '2']//p[text()='Programming']");
    public static By ProfessionalProgramming_Validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']");

    public static By ProfessionalSlickList_ITCertification=By.xpath("//div[@data-index= '3']//p[text()='IT Certification']");
    public static By ProfessionalITCertification_validation=By.xpath("//h1[@class='sm:text-[18px] !text-[16px] !text-[#FF6600] !z-20 !font-primary-font-bold']\n");

    public static boolean ProfessionalSlickListTechnology()
    {
        try {
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
            driver.findElement(ProfessionalSlickList_Technology).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        boolean value=false;
        try {
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

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
