import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFunctions {
    public WebDriver driver;
    String basicURL = "http://demoqa.com/registration/";
    String temporaryMail = "https://temp-mail.org/pl/";

    public BrowserFunctions() {
        this.driver = Main.driver;
    }

    // Method that waits till specified element will be visible and enable to click.
    public void waitUntilPageLoads(By load) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(load));
    }

    // Method that opens registration page.
    public void openTestingPage (){
        driver.get(basicURL);
    }

    // Method that opens temporary e-mail page.
    public void openTemporaryMailPage() {
        driver.get(temporaryMail);
    }
}