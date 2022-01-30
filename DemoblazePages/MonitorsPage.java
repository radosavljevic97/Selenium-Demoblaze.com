package DemoblazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonitorsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement appleMonitor24;
    WebElement assusFullHd;

    public MonitorsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAppleMonitor24() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("Apple monitor 24")));
        return driver.findElement(By.linkText("Apple monitor 24"));
    }

    public WebElement getAssusFullHd() {
        wdwait.until(ExpectedConditions.elementToBeClickable(By.linkText("ASUS Full HD")));
        return driver.findElement(By.linkText("ASUS Full HD"));
    }

    //------------------------------------------------------------------------

    public void clickOnAppleMonitor24(){
        this.getAppleMonitor24().click();
    }

    public void clickOnAssusFullHd(){
        this.getAssusFullHd().click();
    }
}
