package DemoblazeTest;

import DemoblazeBase.BasePage;
import DemoblazePages.PhonesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TestDemoblaze extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void goToPhonesPage(){
        mainPage.clickPhones();
    }

    @Test
    public void goToLaptopsPage(){
        mainPage.clickLaptops();
    }

    @Test
    public void goToMonitorsPage(){
        mainPage.clickMonitors();
    }


   @Test
   public void ispis() throws InterruptedException {
        Thread.sleep(2000);
        for(WebElement wb : mainPage.getCategories()){
            wb.click();
            Thread.sleep(2000);
            System.out.println(wb.getText());
            Thread.sleep(2000);
            System.out.println(mainPage);
            System.out.println("Ukupno stavki iz " + wb.getText() + " = " + mainPage.numberOfItems());
            System.out.println("Ukupna cena svih proizvoda iz " + wb.getText() + " = " + " //");
        }
   }




   /* @Test
    public void ispisiTelefone() throws InterruptedException {
        goToPhonesPage();
        Thread.sleep(2000);
        phonesPage.ispisiTelefone();
    } */


}
