import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_EBD_177 extends BaseTest {

    private MainHeader mainHeader;
    public LoginTab loginTab;

    @BeforeMethod
    public void setupNeededTabs() {
        mainHeader = new MainHeader(driver);
        loginTab = new LoginTab(driver);
    }

    @Test
    public void LoginLogoutResetPass_EBD_177() throws InterruptedException {
        Thread.sleep(1000);
        mainHeader.clickUserMenu();
        mainHeader.clickSignOut();
        Assert.assertTrue(loginTab.IsLoginBtn());
    }
}