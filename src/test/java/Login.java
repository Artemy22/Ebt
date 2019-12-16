import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends Creds {
    private WebDriver driver = new ChromeDriver();
    private Actions actions = new Actions(driver);

    @BeforeClass
    public void runDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/artem/IdeaProjects/chromedriver");
        driver.manage().window().maximize();
        driver.navigate().to("https://app.sand.e-bate.net/login?returnUrl=%2Fdashboard");
    }



    @Test(description = "Login functionality", groups = {"highPriority"})
    public void TestLogin() throws InterruptedException {
        runDriver();
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(getEmail());
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(getPass());
        driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
        Thread.sleep(1000);
    }

    @AfterClass
    public void finishDriver() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"version\"]")).isDisplayed());
        driver.close();
    }
}