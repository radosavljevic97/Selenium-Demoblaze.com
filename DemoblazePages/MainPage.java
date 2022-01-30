package DemoblazePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public List<WebElement> categories;
    public List<WebElement> items;
    public WebElement cartButton;
    WebElement phones;
    WebElement laptops;
    WebElement monitors;

    public MainPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getCategories() {
        return driver.findElements(By.id("itemc"));
    }

    public List<WebElement> getItems() {
        return driver.findElements(By.cssSelector(".col-lg-4.col-md-6.mb-4"));
    }

    public WebElement getCartButton() {
        return driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
    }

    public WebElement getPhones() {
        return driver.findElement(By.linkText("Phones"));
    }

    public WebElement getLaptops() {
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement getMonitors() {
        return driver.findElement(By.linkText("Monitors"));
    }

    //---------------------------------------------------------------------------

    public void clickPhones(){
        this.getPhones().click();
    }

    public void clickLaptops(){
        this.getLaptops().click();
    }

    public void clickMonitors(){
        this.getMonitors().click();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(WebElement we : getItems()){
            sb.append("Naziv: ").append(we.findElement(By.className("hrefch")).getText()).append("\n");
            sb.append("Opis: ").append(we.findElement(By.id("article")).getText()).append("\n");
            sb.append("Cena: ").append(we.findElement(By.tagName("h5")).getText()).append("\n").append("//-----------------");
        }
        return sb.toString();
    }

    public int numberOfItems(){
        return getItems().size();
    }

    public void alert(){
        driver.switchTo().alert().accept();
    }

    public void selectCategory(int i){
        getCategories().get(i).click();
    }

    public void selectItem(int i){
        getItems().get(i).click();
    }

    public void addItem(){
        getCartButton().click();
    }


}
