import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCountryTab {

    @FindBy(xpath = "//*[@id=\"acrruals\"]")
    private WebElement accruals;

    public LoginCountryTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LoginCountryTab clickAccruals() {
        accruals.click();
        return this;
    }
}