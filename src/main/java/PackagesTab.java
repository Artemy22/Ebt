import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PackagesTab {

    @FindBy(xpath = "/html/body/app-home/div/div/div[2]/app-package/app-package/section[1]/ol/li[1]")
    private WebElement breadcrumbsHomeBtn;

    @FindBy(xpath = "//*[@id=\"addPackage\"]")
    private WebElement addPackageBtn;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/div/div/table/thead/tr/th[3]/a")
    private WebElement orderById;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/label")
    private WebElement firstRow;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[2]")
    private WebElement actionEdit;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[3]")
    private WebElement actionView;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[4]")
    private WebElement actionCopy;

    @FindBy(xpath = "//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[5]")
    private WebElement actionDelete;

     @FindBy(xpath = "//*[@id=\"filterText\"]")
    private WebElement searchInput;

    public PackagesTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public PackagesTab clickBreadcrumbsHomeBtn() {
        breadcrumbsHomeBtn.click();
        return this;
    }

    public PackagesTab clickAddPackageBtn() {
        addPackageBtn.click();
        return this;
    }

    public PackagesTab chooseFirstRow() {
        firstRow.click();
        return this;
    }

    public PackagesTab clickOrderById() {
        orderById.click();
        return this;
    }

    public PackagesTab clickActionEdit() {
        actionEdit.click();
        return this;
    }

    public PackagesTab clickActionView() {
        actionView.click();
        return this;
    }

    public PackagesTab clickActionCopy() {
        actionCopy.click();
        return this;
    }
    public PackagesTab clickActionDelete() {
        actionDelete.click();
        return this;
    }

    public PackagesTab clickSearchInput() {
        searchInput.click();
        return this;
    }
}