import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFunctions {
    public WebDriver driver;
    String basicURL = "http://demoqa.com/registration/";
    String temporaryMail = "https://10minut.xyz/";

    public BrowserFunctions() {
        this.driver = Main.driver;
    }

    public void waitUntilPageLoads(By load) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(load));
    }

    public void openTestingPage (){
        driver.get(basicURL);
    }

    public void openTemporaryMailPage() {
        driver.get(temporaryMail);
    }

    public void closeTestingPage() {
        driver.close();
    }
}