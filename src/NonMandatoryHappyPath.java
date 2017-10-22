import java.awt.*;

public class NonMandatoryHappyPath {
    public void NonMandatoryHappyPath () throws InterruptedException, AWTException {
        ElementsLocations element = new ElementsLocations();
        RandomGenerator generator = new RandomGenerator();

       //Fills all the non-mandatory fields with proper values.
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
