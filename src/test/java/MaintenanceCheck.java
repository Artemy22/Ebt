
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MaintenanceCheck extends BaseTest {

    private MaintenanceTab maintenanceTab;
    private MainHeader mainHeader;

    @BeforeMethod
    public void setupMainPage() {
        maintenanceTab = new MaintenanceTab(driver);
        mainHeader = new MainHeader(driver);
    }

    @Test
    public void companyMaintenance() throws InterruptedException {
        Thread.sleep(1000);
        mainHeader.clickMainentanceHeader();
        Thread.sleep(1000);
        maintenanceTab.clickCompanyMaintenance();
        Thread.sleep(1000);
        maintenanceTab.checkThat();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}