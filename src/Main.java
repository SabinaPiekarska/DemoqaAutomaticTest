import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;

public class Main {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new FirefoxDriver();
       MandatoryHappyPath mandatoryHappyPath = new MandatoryHappyPath();
       NonMandatoryHappyPath nonMandatoryHappyPath = new NonMandatoryHappyPath();
       RegisterValidation registerValidation = new RegisterValidation();

       mandatoryHappyPath.MandatoryHappyPath();
       nonMandatoryHappyPath.NonMandatoryHappyPath();
      // registerValidation.RegisterValidation();
    }
}
