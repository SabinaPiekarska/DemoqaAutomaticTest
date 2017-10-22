import org.openqa.selenium.By;

public class MandatoryHappyPath {

    public void MandatoryHappyPath() throws InterruptedException {
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();
        BrowserFunctions functions = new BrowserFunctions();

        //Opens temporary e-mail page, waits to load and copies mail name to String.
        functions.openTemporaryMailPage();
        functions.waitUntilPageLoads(By.id("mail"));
        String temporaryEMail = element.getTemporaryEMail().getAttribute("value");

        //Opens testing page and waits to load.
        functions.openTestingPage();
        functions.waitUntilPageLoads(By.name("pie_submit"));

        //Clicks 'Submit' button so all the mandatory fields are shown.
        element.getSubmitButton().click();

        //Fills all the mandatory fields with proper values.
        element.getFirstName().sendKeys(generator.generateRandomWord(25));
        element.getLastName().sendKeys(generator.generateRandomWord(25));
        generator.randomClick(element.getHobbyCheckbox());
        element.getPhoneNumber().sendKeys(generator.generateRandomInt(10));
        element.getUsername().sendKeys(generator.generateRandomWord(15));
        element.getEMail().sendKeys(temporaryEMail);
        String password = generator.generateRandomPassword(20);
        element.getPassword().sendKeys(password);
        element.getConfirmPassword().sendKeys(password);
    }
}
