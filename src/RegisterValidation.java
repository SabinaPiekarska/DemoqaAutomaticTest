import org.openqa.selenium.By;

public class RegisterValidation extends BrowserFunctions {
    public void RegisterValidation() {
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();
        BrowserFunctions functions = new BrowserFunctions();

        element.getSubmitButton().click();

        if (driver.findElement(By.className("piereg_message")).isDisplayed()) {
            System.out.println("Rejestracja zakończyła się pomyślnie.");
        }

        functions.closeTestingPage();
    }
}
