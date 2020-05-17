import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTenantTab {

    @FindBy(xpath = "//*[@id=\"save\"]")
    private WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"ddlTenant\"]")
    private WebElement tenantDropDown;

    public LoginTenantTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LoginTenantTab clickSaveBtn() {
        saveBtn.click();
        return this;
    }
        public LoginTenantTab clickTenantDropDown() {
        tenantDropDown.click();
        return this;
    }

}