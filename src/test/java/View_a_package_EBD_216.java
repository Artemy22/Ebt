
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class View_a_package_EBD_216 extends BaseTest {

    private MainHeader mainHeader;
    private PricingManagementTab pricingManagementTab;

    @BeforeMethod
    public void setupNeededTabs() {
        mainHeader = new MainHeader(driver);
        pricingManagementTab = new PricingManagementTab(driver);
    }

    @Test
    public void ViewPackage_EBD_216() throws InterruptedException {
        Thread.sleep(1000);
        mainHeader.clickPricingManagHeader();
        pricingManagementTab.clickPackages();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/label")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[3]")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"k-tabstrip-tab-0\"]")).isDisplayed());
    }
}