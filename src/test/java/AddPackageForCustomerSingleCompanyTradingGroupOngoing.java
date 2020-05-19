import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class AddPackageForCustomerSingleCompanyTradingGroupOngoing extends BaseTest {

    private MainHeader mainHeader;
    public LoginTab loginTab;
    public NewPackagePopup newPackagePopup;
    public PricingManagementTab pricingManagementTab;
    public PackagesTab packagesTab;
    Random rand = new Random();
    int yearStart = rand.nextInt(10);
    int yearEndFirst = rand.nextInt(10);
    int yearEndSecond = rand.nextInt(10);
    String descriptionAndSearch;

    @BeforeMethod
    public void setupNeededTabs() {
        mainHeader = new MainHeader(driver);
        loginTab = new LoginTab(driver);
        newPackagePopup = new NewPackagePopup(driver);
        pricingManagementTab = new PricingManagementTab(driver);
        packagesTab = new PackagesTab(driver);
    }

    @Test
            //(description = "Add a new package", groups = {"highPriority"})
    public void AddPackageForCustomerSingleCompanyTradingGroupOngoingP() throws InterruptedException {
        Actions actions = new Actions(driver);
        mainHeader.clickPricingManagHeader();
        pricingManagementTab.clickPackages();
        packagesTab.clickAddPackageBtn();
        newPackagePopup.clickCustomerType();
        newPackagePopup.clickSingleCompany();
        newPackagePopup.clickSingleCompanyAccountTypeDropDown();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();  // Trading group is chosen
        newPackagePopup.clickCompanyNameDropDown();
        actions.sendKeys("qa").perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform(); // first company is chosen
        newPackagePopup.setChosenCompany();


        newPackagePopup.clickPeriodInput();
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();  // Period date ONGOING
        }
        actions.sendKeys(Keys.ENTER).perform();
        newPackagePopup.clickStartDate();
        actions.sendKeys(Keys.HOME).perform();
        String startDate = "0101200" + yearStart;     // Start date 01/01/201 + random
        actions.sendKeys(startDate).perform();
        newPackagePopup.clickEndDate();
        actions.sendKeys(Keys.HOME).perform();
        String endYear = "311220" + yearEndFirst + yearEndSecond;  // End date 31/12/20 + random int + random int
        actions.sendKeys(endYear).perform();
        newPackagePopup.clickDescription();
        descriptionAndSearch = "Selenium package for Trading Group + " + new Random().nextInt();
        actions.sendKeys(descriptionAndSearch).perform();
        newPackagePopup.clickBudget();
        actions.sendKeys(endYear).perform();
        newPackagePopup.clickTarget();
        actions.sendKeys(startDate).perform();
        newPackagePopup.clickComments();
        actions.sendKeys("Trading Group").perform();
        newPackagePopup.clickSaveBtn();
        packagesTab.clickOrderById();
        packagesTab.clickOrderById();
    }

    @AfterClass
    public void finishDriver() throws InterruptedException {
        Thread.sleep(1000);
        String bodyText = driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]")).getText();
        System.out.println(bodyText);
        Assert.assertTrue(bodyText.contains(descriptionAndSearch), descriptionAndSearch);
        driver.close();
    }

}


//        for (int i = 0; i < new Random().nextInt(20); i++) {
//            actions.sendKeys(Keys.DOWN).perform();
//        }
//        actions.sendKeys(Keys.ENTER).perform(); // company name Satin

