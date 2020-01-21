import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingManagementTab {

    @FindBy(xpath = "//*[@id=\"packages\"]")
    private WebElement packages;

    @FindBy(xpath = "//*[@id=\"agreements\"]")
    private WebElement agreements;

    @FindBy(xpath = "//*[@id=\"approvals\"]")
    private WebElement approvals;

    @FindBy(xpath = "//*[@id=\"testHarnessLink\"]")
    private WebElement calcEngineStatus;




    public PricingManagementTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public PricingManagementTab clickPackages() {
        packages.click();
        return this;
    }

    public PricingManagementTab clickAgreements() {
        agreements.click();
        return this;
    }

    public PricingManagementTab clickApprovals() {
        approvals.click();
        return this;
    }

    public PricingManagementTab clickCalcEngineStatus() {
        calcEngineStatus.click();
        return this;
    }

}