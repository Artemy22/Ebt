
import com.google.gson.internal.$Gson$Preconditions;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login_EBD_177 extends BaseTest {

    private MainHeader mainHeader;

    @BeforeMethod
    public void setupNeededTabs() {
        mainHeader = new MainHeader(driver);
    }

    @Test
    public void LoginLogoutResetPass_EBD_177() throws InterruptedException {
        Thread.sleep(1000);
        mainHeader.clickUserMenu();
        mainHeader.clickSignOut();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"save\"]")).isDisplayed());

        driver.findElement(By.xpath("/html/body/app-e-bate-login/div/div[2]/form/a")).click();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/app-forgot-password/div/div[2]/div/form/button")).isDisplayed());
    }
}