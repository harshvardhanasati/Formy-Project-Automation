import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
        newtabbutton.click();

        String OriginalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles())
        {
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(OriginalHandle);
        driver.quit();
    }
}
