import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

    WebDriver driver;

    @Before
    public void testSetup() {
        // SetUp your WebDriver
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\GeckoDriver_ver_024\\geckodriver.exe");
        driver = new FirefoxDriver();

        // Navigate to a certain page
        driver.navigate().to("http://the-internet.herokuapp.com/login");
    }

    @After
    public void testShutDown() {
        driver.quit();
    }

    @Test
    public void testPageLogin() {
        // Verify if we are on a good page - H2 tag text is checked
        Assert.assertEquals("Login Page", driver.findElement(By.tagName("h2")).getText());

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.xpath("//button")).click();

        // Verify if you have logged in
        Assert.assertEquals("Welcome to the Secure Area. When you are done click logout below.", driver.findElement(By.tagName("h4")).getText());
    }
}
