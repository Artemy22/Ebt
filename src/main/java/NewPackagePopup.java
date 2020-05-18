import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPackagePopup {

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[1]/div/div/div/fieldset/label[1]")
    private WebElement CustomerType;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[1]/div/div/div/fieldset/label[2]")
    private WebElement SupplierType;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[1]/div/div/div/fieldset/label[3]")
    private WebElement DistributorType;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[1]/div/div/div/fieldset/label[4]")
    private WebElement ChannelType;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[2]/div/div/fieldset/div[1]/label[1]")
    private WebElement SingleCompany;

    @FindBy(xpath = "//*[@id=\"companySelectionAccountType\"]")
    private WebElement SingleCompanyAccountTypeDropDown;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[2]/div/div/fieldset/div[1]/label[2]")
    private WebElement AllCompanies;

    @FindBy(xpath = "//*[@id=\"period\"]")
    private WebElement periodInput;

    @FindBy(xpath = "//*[@id=\"periodStart\"]/span")
    private WebElement startDate;

    @FindBy(xpath = "//*[@id=\"periodEnd\"]/span")
    private WebElement endDate;

    @FindBy(xpath = "//*[@id=\"description\"]")
    private WebElement description;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/div[4]/div[1]/div/kendo-numerictextbox/span")
    private WebElement budget;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/div[4]/div[2]/div/kendo-numerictextbox/span")
    private WebElement target;

    @FindBy(xpath = "//*[@id=\"comments\"]")
    private WebElement comments;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")
    private WebElement saveBtn;

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/kendo-dialog-actions/button[2]")
    private WebElement cancelBtn;

    @FindBy(xpath = "//*[@id=\"companySelectionAccountType\"]")
    private WebElement accountTypeDropDown;

    @FindBy(xpath = "//*[@id=\"companiesSearch\"]/span/kendo-searchbar")
    private WebElement companyNameDropDown;

    @FindBy(xpath = "//*[@id=\"csButtons\"]/button[1]")
    private WebElement setChosenCompany;


    public NewPackagePopup(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public NewPackagePopup clickCustomerType() {
        CustomerType.click();
        return this;
    }

    public NewPackagePopup clickSupplierType() {
        SupplierType.click();
        return this;
    }

    public NewPackagePopup clickDistributorType() {
        DistributorType.click();
        return this;
    }

    public NewPackagePopup clickChannelType() {
        ChannelType.click();
        return this;
    }

    public NewPackagePopup clickSingleCompany() {
        SingleCompany.click();
        return this;
    }

    public NewPackagePopup clickAllCompanies() {
        AllCompanies.click();
        return this;
    }

    public NewPackagePopup clickSingleCompanyAccountTypeDropDown() {
        SingleCompanyAccountTypeDropDown.click();
        return this;
    }

    public NewPackagePopup clickPeriodInput() {
        periodInput.click();
        return this;
    }

    public NewPackagePopup clickStartDate() {
        startDate.click();
        return this;
    }

    public NewPackagePopup clickEndDate() {
        endDate.click();
        return this;
    }

    public NewPackagePopup clickDescription() {
        description.click();
        return this;
    }

    public NewPackagePopup clickBudget() {
        budget.click();
        return this;
    }

    public NewPackagePopup clickTarget() {
        target.click();
        return this;
    }

    public NewPackagePopup clickComments() {
        comments.click();
        return this;
    }

    public NewPackagePopup clickSaveBtn() {
        saveBtn.click();
        return this;
    }

    public NewPackagePopup clickCancelBtn() {
        cancelBtn.click();
        return this;
    }

    public NewPackagePopup clickAccountTypeDropDown() {
        accountTypeDropDown.click();
        return this;
    }

    public NewPackagePopup clickCompanyNameDropDown() {
        companyNameDropDown.click();
        return this;
    }

    public NewPackagePopup setChosenCompany() {
        setChosenCompany.click();
        return this;
    }
}