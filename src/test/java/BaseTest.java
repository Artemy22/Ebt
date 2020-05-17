import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public WebDriver driver;
    public LoginTab loginTab;
    public LoginTenantTab loginTenantTab;

    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://app.test.e-bate.net");
        loginTab = new LoginTab(driver);
        loginTab.fillInEmail();
        loginTab.fillInPassword();
        loginTab.clickLoginBtn();
        Thread.sleep(1000);
        loginTenantTab = new LoginTenantTab(driver);
        loginTenantTab.clickSaveBtn();
    }

//    @AfterMethod
//    public void cleanup() {
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}