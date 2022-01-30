package DemoblazeBase;

import DemoblazePages.LaptopsPage;
import DemoblazePages.MainPage;
import DemoblazePages.MonitorsPage;
import DemoblazePages.PhonesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public MainPage mainPage;
    public PhonesPage phonesPage;
    public LaptopsPage laptopsPage;
    public MonitorsPage monitorsPage;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mainPage = new MainPage(driver, wdwait);
        phonesPage = new PhonesPage(driver, wdwait);
        laptopsPage = new LaptopsPage(driver, wdwait);
        monitorsPage = new MonitorsPage(driver, wdwait);
    }

    @AfterClass
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        //driver.close();
        //driver.quit();
    }
}
