import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportingTab {

    @FindBy(xpath = "//*[@id=\"reports\"]")
    private WebElement reports;

    @FindBy(xpath = "//*[@id=\"reportserver\"]")
    private WebElement reportServer;

    public ReportingTab(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ReportingTab clickReports() {
        reports.click();
        return this;
    }

    public ReportingTab clickReportServer() {
        reportServer.click();
        return this;
    }
}