import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

// Class with web element locations from registration page.
public class ElementsLocations extends BrowserFunctions{

        public WebElement getFirstName(){
            return driver.findElement(By.id("name_3_firstname"));
        }

        public WebElement getLastName(){
            return driver.findElement(By.id("name_3_lastname"));
        }

        public WebElement getPhoneNumber(){
            return driver.findElement(By.id("phone_9"));
        }

        public WebElement getUsername(){
            return driver.findElement(By.id("username"));
        }

        public WebElement getEMail(){
            return driver.findElement(By.id("email_1"));
        }

        public WebElement getAboutYourself(){
            return driver.findElement(By.id("description"));
        }

        public WebElement getPassword(){
            return driver.findElement(By.id("password_2"));
        }

        public WebElement getConfirmPassword(){
            return driver.findElement(By.id("confirm_password_password_2"));
        }

        public WebElement getProfilePicture(){
            return driver.findElement(By.id("profile_pic_10"));
        }

        public WebElement getSubmitButton(){
            return driver.findElement(By.name("pie_submit"));
        }

        public WebElement getTemporaryEMail() {
            return driver.findElement(By.id("mail"));
        }

        public List<WebElement> getHobbyCheckbox() {
            return driver.findElements(By.name("checkbox_5[]"));
        }

        public List<WebElement> getMaritalStatus() {
            return driver.findElements(By.name("radio_4[]"));
        }

        public WebElement getCountryList() {
            return driver.findElement(By.id("dropdown_7"));
        }

        public WebElement getMonthList() {
            return driver.findElement(By.id("mm_date_8"));
        }

        public WebElement getDayList() {
            return driver.findElement(By.id("dd_date_8"));
        }

        public WebElement getYearList() {
            return driver.findElement(By.id("yy_date_8"));
        }
    }
