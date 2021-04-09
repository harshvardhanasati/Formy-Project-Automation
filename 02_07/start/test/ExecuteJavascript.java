import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteJavascript {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalbutton = driver.findElement(By.id("modal-button"));
        modalbutton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        closeButton.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",closeButton);

        driver.quit();
    }
}
