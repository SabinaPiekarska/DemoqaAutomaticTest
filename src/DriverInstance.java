import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverInstance {
    WebDriver driver;
    String basicURL = "http://demoqa.com/registration/";

    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void waitUntilPageLoads (){
        driver.get(basicURL);
    }

}