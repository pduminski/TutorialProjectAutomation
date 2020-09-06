import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\GeckoDriver_ver_024\\geckodriver.exe");
        // Create an instance of a WebDriver
        WebDriver driver = new FirefoxDriver();


        // Go to WebPage
        driver.navigate().to("http://the-internet.herokuapp.com/");

        // click on the link
        driver.findElement(By.linkText("A/B Testing")).click();

        // Get title of the page we are currently on
        String title = driver.getTitle();

        if (title.equals("The Internet")) {
            System.out.println("found the title with value: " + title);
        } else {
            System.out.println("Instead fount the title with value: " + title);
        }

        // Close the driver
        driver.close();

    }
}
