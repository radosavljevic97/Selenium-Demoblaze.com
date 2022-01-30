package DemoblazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PhonesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement samsungGalaxyS6;
    WebElement nokiaLumia1520;
    WebElement nexus6;
    WebElement samsungGalaxyS7;
    WebElement iphone632Gb;
    WebElement sonyXperiaZ5;
    WebElement htcOneM9;

    public PhonesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSamsungGalaxyS6(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s6")));
        return driver.findElement(By.linkText("Samsung galaxy s6"));
    }

    public WebElement getNokiaLumia1520(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Nokia lumia 1520")));
        return driver.findElement(By.linkText("Nokia lumia 1520"));
    }

    public WebElement getNexus6(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Nexus 6")));
        return driver.findElement(By.linkText("Nexus 6"));
    }

    public WebElement getSamsungGalaxyS7(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Samsung galaxy s7")));
        return driver.findElement(By.linkText("Samsung galaxy s7"));
    }

    public WebElement getIphone632Gb(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Iphone 6 32gb")));
        return driver.findElement(By.linkText("Iphone 6 32gb"));
    }

    public WebElement getSonyXperiaZ5(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sony xperia z5")));
        return driver.findElement(By.linkText("Sony xperia z5"));
    }

    public WebElement getHtcOneM9(){
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("HTC One M9")));
        return driver.findElement(By.linkText("HTC One M9"));
    }

    //------------------------------------------------------------

    public void clickOnSamsungGalaxyS6(){
        this.getSamsungGalaxyS6().click();
    }

    public void clickOnNokiaLumia1520(){
        this.getNokiaLumia1520().click();
    }

    public void clickOnNexus6(){
        this.getNexus6().click();
    }

    public void clickOnSamsungGalaxyS7(){
        this.getSamsungGalaxyS7().click();
    }

    public void clickOnIphone632Gb(){
        this.getIphone632Gb().click();
    }

    public void clickOnSonyXperiaZ5(){
        this.getSonyXperiaZ5().click();
    }

    public void clickOnHtcOneM9(){
        this.getHtcOneM9().click();
    }

    public void ispisiTelefone(){
        List<WebElement> elements = driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
        for(int i = 0; i < elements.size(); i++){
            System.out.println(elements.get(i).getText());
        }
    }
}
