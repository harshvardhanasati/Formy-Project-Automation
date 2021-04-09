import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");


        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        Thread.sleep(1000);

        WebElement autocompleteResults = driver.findElement(By.className("pac-item"));
        autocompleteResults.click();


        driver.quit();
    }
}
