import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebAppPageTitleTest {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\GeckoDriver_ver_024\\geckodriver.exe");
        // Create an instance of a WebDriver
        driver = new FirefoxDriver();

        // Go to WebPage
        driver.navigate().to("http://the-internet.herokuapp.com/");

    }

    @After
    public void testShutDown() {
        // Close the driver
        driver.close();
    }

    @Test
    public void shouldHavePageTitleOfTheInternet() {


        // click on the link
        driver.findElement(By.linkText("A/B Testing")).click();

        Assert.assertTrue(driver.getTitle().equals("The Internet"));

    }
    @Test
    public void shouldHavePageTitle() {

        // click on the link
        driver.findElement(By.linkText("Add/Remove Elements")).click();

        Assert.assertTrue(driver.getTitle().equals("The Internet"));

    }
}
