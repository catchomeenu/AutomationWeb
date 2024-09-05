package AutomationTest;
import Automation.pageobjects.ProfessionalsSlickSlides;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class ProfessionalsSlickSlideTestcases extends ProfessionalsSlickSlides {

    @Test(priority = 3)
    public  void Slides() throws Exception{


        ProfessionalSlickListTechnology();
        System.out.println("Clicking Technology");
        Thread.sleep(5000);
        boolean actualresult_Technology =ProfessionalSlickListTechnology();

        boolean expectedresult_Technology = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult_Technology, expectedresult_Technology);// using soft assert
        sa.assertAll();
        System.out.println("Technology Title presence verified");

        ProfessionalSlickListFreeCourse();
        System.out.println("Clicking FreeCourse");
        Thread.sleep(5000);
        boolean actualresult_Freecourse =ProfessionalSlickListFreeCourse();

        boolean expectedresult_Freecourse = true;
        sa.assertEquals(actualresult_Freecourse, expectedresult_Freecourse);// using soft assert
        sa.assertAll();
        System.out.println("FreeCourse Title presence verified");


        ProfessionalSlickListProgramming();
        System.out.println("Clicking Programming");
        Thread.sleep(5000);
        boolean actualresult_Programming =ProfessionalSlickListProgramming();

        boolean expectedresult_Programming = true;
        sa.assertEquals(actualresult_Programming, expectedresult_Programming);// using soft assert
        sa.assertAll();
        System.out.println("Programming Title presence verified");

        ProfessionalSlickListITCertification();
        System.out.println("Clicking ITcertification");
        Thread.sleep(5000);
        boolean actualresult_IT = ProfessionalSlickListITCertification();

        boolean expectedresult_IT = true;
        sa.assertEquals(actualresult_IT, actualresult_IT);// using soft assert
        sa.assertAll();
        System.out.println("ITCertification Title presence verified");


    }
}
