import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenanceTab {

    @FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul/li[1]")
    private WebElement MaintenMain;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-maintenance/company-maintenance/section[1]/ol/li[3]")
    private WebElement CheckThat;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[1]")
    private WebElement AccountingPeriod;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[2]")
    private WebElement CrossReferences;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[3]")
    private WebElement Currency;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[4]")
    private WebElement DimensionManager;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[5]")
    private WebElement Hierarchies;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[6]")
    private WebElement HierarchyMaint;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[7]")
    private WebElement TradingGroups;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[8]")
    private WebElement UnitsOfMeasurement;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[9]")
    private WebElement UnitOfMeasurementConversionRates;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[10]")
    private WebElement Users;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[11]")
    private WebElement CompanyMaintenance;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[12]")
    private WebElement ProductMaintenance;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[13]")
    private WebElement Workflow;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[14]")
    private WebElement Roles;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[15]")
    private WebElement Tenants;

    @FindBy(xpath = "//*[@id=\"maintenanceDropdown\"]/li[16]")
    private WebElement WholesalerDiscount;

    @FindBy(xpath = "//*[@id=\"reportManager\"]")
    private WebElement ReportManager;

    public MaintenanceTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public MaintenanceTab clickMaintenMain() {
        MaintenMain.click();
        return this;
    }

    public MaintenanceTab clickCheckThat() {
        CheckThat.isDisplayed();
        return this;
    }

    public MaintenanceTab clickAccountingPeriod() {
        AccountingPeriod.click();
        return this;
    }

    public MaintenanceTab clickCrossReferences() {
        CrossReferences.click();
        return this;
    }

    public MaintenanceTab clickCurrency() {
        Currency.click();
        return this;
    }

    public MaintenanceTab clickDimensionManager() {
        DimensionManager.click();
        return this;
    }

    public MaintenanceTab clickHierarchies() {
        Hierarchies.click();
        return this;
    }

    public MaintenanceTab clickHierarchyMaint() {
        HierarchyMaint.click();
        return this;
    }

    public MaintenanceTab clickTradingGroups() {
        TradingGroups.click();
        return this;
    }

    public MaintenanceTab clickUnitsOfMeasurement() {
        UnitsOfMeasurement.click();
        return this;
    }

    public MaintenanceTab clickUnitOfMeasurementConversionRates() {
        UnitOfMeasurementConversionRates.click();
        return this;
    }

    public MaintenanceTab clickUsers() {
        Users.click();
        return this;
    }

    public MaintenanceTab clickCompanyMaintenance() {
        CompanyMaintenance.click();
        return this;
    }

    public MaintenanceTab clickProductMaintenance() {
        ProductMaintenance.click();
        return this;
    }

    public MaintenanceTab clickWorkflow() {
        Workflow.click();
        return this;
    }

    public MaintenanceTab clickRoles() {
        Roles.click();
        return this;
    }

    public MaintenanceTab clickTenants() {
        Tenants.click();
        return this;
    }

    public MaintenanceTab clickWholesalerDiscount() {
        WholesalerDiscount.click();
        return this;
    }

    public MaintenanceTab clickReportManager() {
        ReportManager.click();
        return this;
    }
}