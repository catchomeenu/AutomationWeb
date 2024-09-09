package AutomationTest;

import Automation.pageobjects.InstructorVideoDashBoard;
import org.testng.annotations.Test;

;

public class InstructorVideoTestcases extends InstructorVideoDashBoard {

    @Test(priority = 90)
    public static void videoCourse_Instructor() {


        System.out.println("**************Instructor dashboard ********** ");
        clickVideoCoursesLink();
        clickVideoNewCourse();
        ClickNewCourseRadio();
        System.out.println("**************Details ********** ");
        enterNewCourseName("Java 3.0");
        selectImage("C:\\Users\\ashle\\Downloads\\Download.png");
        enterDescription("Java is one of the most popular programming languages in the world, known for its versatility, portability, and robustness. Developed by Sun Microsystems in 1995, Java was designed to be a write-once, run-anywhere language, which means that compiled Java code can run on any device that has a Java Virtual Machine (JVM). This platform independence is one of Java's strongest advantages, making it a preferred choice for developing cross-platform applications.Java programs are compiled into bytecode, which is an intermediate language between source code and machine code. This bytecode is then executed by the JVM, making Java applications highly portable across different computing environments. The JVM acts as an interpreter between the bytecode and the underlying hardware, ensuring that Java applications can run on any platform that supports the JVM.");
        selectCourseFor("Professionals");
        selectCategory("Free Course");
        selectSubcategory("java");
        selectDegreeDD("Advanced");
        courseType("Seminar");
        currency("USD");
        price("2000");
        clickSaveNext();
        implicitWait(15);

    }
    @Test(priority = 92)
    public static void videocoursePrerequisitesInstructor() {
        verifyPrerequisites();
        System.out.println("**************Pre-requities Description ********** ");
        prerequisitesDescription("This approach to programming allows for greater modularity, code reuse, and organization");
        implicitWait(20);
        addClick();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickSaveNext();
       // clickPreSaveButton();
        implicitWait(20);
        lessonDescriptioninputBox("Java has a vast ecosystem that includes a rich set of libraries, frameworks, and tools. Some of the most popular frameworks include Spring, Hibernate, and Apache Struts, which simplify the development of enterprise-level applications");
        clickPrerequisitesAdd();

        clickSaveNext();
        // System.out.println("**************what you will learn Description ********** ");
        implicitWait(10);
    }
    @Test(priority = 93)
        public static void videoCourseLessonInstructor(){
        System.out.println("**************what you learn Description ********** ");
        enterSectionName("Elements");
        enterSectionDesc("Java's OOP paradigm allows for the creation of modular programs and reusable code. The four pillars of OOP in Java are encapsulation, inheritance, polymorphism, and abstraction.");
        //   SectionDuration("1");
        //  durationAdd();
        lessonWindowName("Element Locators programming");
        lessonDesc("Compared to low-level programming languages, high-level programming languages");
        uploadLessonVideo("C:\\Users\\ashle\\Downloads\\Video.mp4");
        // lessonDuration("1");
        clickLessonAdd();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("**************lesson add ********** ");
       // implicitWait(100);
    }
    @Test(priority = 94)
    public static void videoCourseOutputDisplay (){
      //  clickLessonSave();
        clickHomeLink();
        System.out.println("************** Output is displayed ********** ");
        clickInstructorDashBoard();
        outputVideoPresence();
        System.out.println("************** End of videocourse testcases ********** ");
    }

}
