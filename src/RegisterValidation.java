import org.openqa.selenium.By;

public class RegisterValidation extends BrowserFunctions {

    /* Method that clicks 'Submit' button and checks if proper after registration message is shown. */
    public void RegisterValidation() {
        ElementsLocations element = new ElementsLocations();

        element.getSubmitButton().click();

        if (driver.findElement(By.className("piereg_message")).isDisplayed()) {
            System.out.println("Rejestracja zakończyła się pomyślnie.");
        }

    }
}
