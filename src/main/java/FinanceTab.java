import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceTab {

    @FindBy(xpath = "//*[@id=\"acrruals\"]")
    private WebElement accruals;

    @FindBy(xpath = "//*[@id=\"payments\"]")
    private WebElement payments;

    @FindBy(xpath = "//*[@id=\"adjustment\"]")
    private WebElement adjustment;

    @FindBy(xpath = "//*[@id=\"approveFocClaims\"]")
    private WebElement approveFocClaims;

    @FindBy(xpath = "/html/body/app-home/div/div/div[1]/app-nav-menu/header/nav/div[2]/ul/li[3]/ul/li[5]/a")
    private WebElement importData;

    @FindBy(xpath = "/html/body/app-home/div/div/div[1]/app-nav-menu/header/nav/div[2]/ul/li[3]/ul/li[6]/a")
    private WebElement newImportData;

    public FinanceTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public FinanceTab clickAccruals() {
        accruals.click();
        return this;
    }

    public FinanceTab clickPayments() {
        payments.click();
        return this;
    }

    public FinanceTab clickAdjustment() {
        adjustment.click();
        return this;
    }

    public FinanceTab clickApproveFocClaims() {
        approveFocClaims.click();
        return this;
    }

    public FinanceTab clickImportData() {
        importData.click();
        return this;
    }

    public FinanceTab clickNewImportData() {
        newImportData.click();
        return this;
    }
}