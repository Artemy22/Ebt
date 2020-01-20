import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest extends Creds {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to("https://app.dev.e-bate.net");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(getEmail());
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(getPass());
        driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
    }

    @AfterMethod
    public void cleanup() {
//        driver.manage().deleteAllCookies();
//        driver.close();
    }
}