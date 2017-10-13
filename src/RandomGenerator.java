import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;

public class RandomGenerator extends BrowserFunctions {

    public String generateRandomString (String chars, int x) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        while (sb.length() < x) { // length of the random string.
            int index = (int) (random.nextFloat() * chars.length());
            sb.append(chars.charAt(index));
        }
        String output = sb.toString();
        return output;
    }

    public String generateRandomWord(int x) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return generateRandomString(letters, x);
    }
    public String generateRandomInt(int x){
        String numbers = "1234567890";
        return generateRandomString(numbers, x);
    }

    public String generateRandomPassword (int x) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        return generateRandomString(chars, x);
    }

    public void randomClick(List<WebElement> options) {
        Random random = new Random();
        int index = random.nextInt(options.size());
        options.get(index).click();
    }


    public void randomDropdownClick(WebElement element) {
        Select select = new Select(element);
        List <WebElement> elements = select.getOptions();
        randomClick(elements);
    }

    public void setClipboardData(String imagePath) {
        StringSelection stringSelection = new StringSelection(imagePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public void uploadRandomPicture () throws AWTException {
        setClipboardData("D:\\DemoqaAutomaticTest\\palczak.jpg");
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
