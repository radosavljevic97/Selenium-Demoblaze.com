package DemoblazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LaptopsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement sonyVaioI5;
    WebElement sonyVaioI7;
    WebElement macBookAir;
    WebElement dellI78Gb;
    WebElement dell2017;
    WebElement macBookPro;

    public LaptopsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSonyVaioI5() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sony vaio i5")));
        return driver.findElement(By.linkText("Sony vaio i5"));
    }

    public WebElement getSonyVaioI7() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sony vaio i7")));
        return driver.findElement(By.linkText("Sony vaio i7"));
    }

    public WebElement getMacBookAir() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("MacBook air")));
        return driver.findElement(By.linkText("MacBook air"));
    }

    public WebElement getDellI78Gb() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dell i7 8gb")));
        return driver.findElement(By.linkText("Dell i7 8gb"));
    }

    public WebElement getDell2017() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("2017 Dell 15.6 Inch")));
        return driver.findElement(By.linkText("2017 Dell 15.6 Inch"));
    }

    public WebElement getMacBookPro() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("MacBook Pro")));
        return driver.findElement(By.linkText("MacBook Pro"));
    }

    //---------------------------------------------------------------------

    public void clickOnSonyVaioI5(){
        this.getSonyVaioI5().click();
    }

    public void clickOnSonyVadioI7(){
        this.getSonyVaioI7().click();
    }

    public void clickOnMacBookAir(){
        this.getMacBookAir().click();
    }

    public void clickOnDellI78Gb(){
        this.getDellI78Gb().click();
    }

    public void clickOnDell2017(){
        this.getDell2017().click();
    }

    public void clickOnMacBookPro(){
        this.getMacBookPro().click();
    }


}
