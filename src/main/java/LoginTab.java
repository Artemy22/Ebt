import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTab extends Creds {

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "/html/body/app-e-bate-login/div/div/div[2]/form/div[2]/a")
    private WebElement forgottenPassword;

    @FindBy(xpath = "//*[@id=\"save\"]")
    private WebElement loginBtn;

    public LoginTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public LoginTab fillInEmail() {
        emailInput.sendKeys(getEmail());
        return this;
    }

    public LoginTab fillInPassword() {
        passwordInput.sendKeys(getPass());
        return this;
    }

    public LoginTab clickForgottenPassword() {
        forgottenPassword.click();
        return this;
    }

    public LoginTab clickLoginBtn() {
        loginBtn.click();
        return this;
    }

    public boolean IsLoginBtn() {
        return loginBtn.isDisplayed();
    }
}