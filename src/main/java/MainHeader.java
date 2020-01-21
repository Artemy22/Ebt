import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainHeader {

    @FindBy(xpath = "//*[@id=\"menuLogo\"]")
    private WebElement menuLogo;

    @FindBy(xpath = "//*[@id=\"maintenance\"]")
    private WebElement meinentanceHeader;

    @FindBy(xpath = "//*[@id=\"pricingManagement\"]")
    private WebElement pricingManagementHeader;

    @FindBy(xpath = "//*[@id=\"finance\"]")
    private WebElement financeHeader;

    @FindBy(xpath = "//*[@id=\"reporting\"]")
    private WebElement reportingHeader;

    @FindBy(xpath = "//*[@id=\"version\"]")
    private WebElement version;

    @FindBy(xpath = "//*[@id=\"notifications\"]")
    private WebElement notifications;

    @FindBy(xpath = "//*[@id=\"help\"]")
    private WebElement help;

    @FindBy(xpath = "//*[@id=\"userMenu\"]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"signOut\"]")
    private WebElement signOut;

    public MainHeader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public MainHeader clickMainentanceHeader() {
        meinentanceHeader.click();
        return this;
    }

    public MainHeader clickPricingManagHeader() {
        pricingManagementHeader.click();
        return this;
    }

    public MainHeader clickFinanceHeader() {
        financeHeader.click();
        return this;
    }

    public MainHeader clickReporting() {
        reportingHeader.click();
        return this;
    }

    public MainHeader clickMenuLogo() {
        menuLogo.click();
        return this;
    }

    public MainHeader clickVersion() {
        version.click();
        return this;
    }

    public MainHeader clickNotifications() {
        notifications.click();
        return this;
    }

    public MainHeader clickHelp() {
        help.click();
        return this;
    }

    public MainHeader clickUserMenu() {
        userMenu.click();
        return this;
    }

    public MainHeader clickSignOut() {
        signOut.click();
        return this;
    }
}