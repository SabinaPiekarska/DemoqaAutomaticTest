import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();
        DriverInstance testing = new DriverInstance();

        testing.openBrowser();
        testing.waitUntilPageLoads();

       // element.getSubmitButton().click();
        element.getFirstName().sendKeys(generator.getRandomString(25));
        element.getLastName().sendKeys(generator.getRandomString(25));
       // element.getPhoneNumber().sendKeys();
    }
}
