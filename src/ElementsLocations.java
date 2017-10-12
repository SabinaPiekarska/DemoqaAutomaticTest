import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class ElementsLocations {
        private WebDriver driver;

        public WebElement getFirstName(){
            return driver.findElement(By.id("name_3_firstname"));
        }

        public WebElement getLastName(){
            return driver.findElement(By.id("name_3_lastname"));
        }

        public WebElement getPhoneNumber(){
            return driver.findElement(By.id("phone_9"));
        }

        public WebElement Username(){
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

        public WebElement getYourProfilePictureButton(){
            return driver.findElement(By.id("profile_pic_10"));
        }

        public WebElement getSubmitButton(){
            return driver.findElement(By.name("pie_submit"));
        }

    }
