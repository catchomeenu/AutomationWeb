package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class Programming_Module extends Base {

    public static By homePageLink = By.xpath("//span[text()='Home']");

    public static By Programme_CourseLink = By.xpath("//p[text()='Programming']//parent::a");

    public static By Programme_Results_Header = By.xpath("//h1[text()='117 results for \"Programming\"']");

    public static By VirtualSessions_CourseLink = By.xpath("//p[text()='Technology 1']//following-sibling::p[text()='Virtual Sessions Course']");

    public static By Course_Information = By.xpath("//h2[text()='Course Information']");

    public static By AboutTheCourse = By.xpath("//h2[text()='About the Course']");


}
