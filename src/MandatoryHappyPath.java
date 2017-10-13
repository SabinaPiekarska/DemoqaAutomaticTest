import org.openqa.selenium.By;

public class MandatoryHappyPath {

    public void MandatoryHappyPath() throws InterruptedException {
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();
        BrowserFunctions functions = new BrowserFunctions();

        //Opening temporary e-mail page and copying mail name to String
        functions.openTemporaryMailPage();
        functions.waitUntilPageLoads(By.id("inputEmail3"));
        String temporaryEMail = element.getTemporaryEMail().getAttribute("value");

        //Opening testing page
        functions.openTestingPage();
        functions.waitUntilPageLoads(By.name("pie_submit"));

        element.getSubmitButton().click();
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
