
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class View_an_agreement_EBD_213 extends BaseTest {

    private MainHeader mainHeader;
    private PricingManagementTab pricingManagementTab;

    @BeforeMethod
    public void setupNeededTabs() {
        mainHeader = new MainHeader(driver);
        pricingManagementTab = new PricingManagementTab(driver);
    }

    @Test
    public void ViewAgreement_EBD_213() throws InterruptedException {
        Thread.sleep(1000);
        mainHeader.clickPricingManagHeader();
        pricingManagementTab.clickAgreements();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gridAgreement\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/label")).click();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"action546\"]")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"k-tabstrip-tab-0\"]")).isDisplayed());
    }
}