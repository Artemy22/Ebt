
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MaintenanceCheck extends BaseTest {

    private MaintenanceTab maintenanceTab;

    @BeforeMethod
    public void setupMainPage() {
        maintenanceTab = new MaintenanceTab(driver);
    }

    @Test
    public void companyMaintenance() throws InterruptedException {
        Thread.sleep(1000);
        maintenanceTab.clickMaintenMain();
        maintenanceTab.clickCompanyMaintenance();
        Thread.sleep(1000);
        maintenanceTab.clickCheckThat();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}