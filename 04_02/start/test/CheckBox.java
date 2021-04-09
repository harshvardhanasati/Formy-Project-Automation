import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;



public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://formy-project.herokuapp.com/checkbox");

        WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
        checkBox1.click();

        WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
        checkBox2.click();

        WebElement checkBox3 = driver.findElement(By.id("checkbox-3"));
        checkBox3.click();

        driver.quit();
    }
}
