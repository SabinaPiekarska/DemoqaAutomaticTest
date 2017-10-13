import java.awt.*;

public class NonMandatoryHappyPath {
    public void NonMandatoryHappyPath () throws InterruptedException, AWTException {
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();
        BrowserFunctions functions = new BrowserFunctions();
        MandatoryHappyPath happyPath = new MandatoryHappyPath();
        happyPath.MandatoryHappyPath();

        generator.randomClick(element.getMaritalStatus());
        generator.randomDropdownClick(element.getCountryList());
        generator.randomDropdownClick(element.getMonthList());
        generator.randomDropdownClick(element.getDayList());
        generator.randomDropdownClick(element.getYearList());
        element.getProfilePicture().click();
        generator.uploadRandomPicture();
        element.getAboutYourself().sendKeys(generator.generateRandomWord(800));

    }
}
