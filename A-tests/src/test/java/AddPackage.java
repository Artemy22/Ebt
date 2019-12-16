import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class AddPackage extends Creds {
    private WebDriver driver = new ChromeDriver();
    private Actions actions = new Actions(driver);
    Random rand = new Random();
    int yearStart = rand.nextInt(10);
    int yearEndFirst = rand.nextInt(10);
    int yearEndSecond = rand.nextInt(10);
    String descriptionAndSearch;


    @BeforeClass
    public void runDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/artem/IdeaProjects/chromedriver");
        driver.manage().window().maximize();
        driver.navigate().to("https://app.sand.e-bate.net/login?returnUrl=%2Fdashboard");

    }

    @Test(description = "Add a new package", groups = {"highPriority"})
    public void AddPackage() throws InterruptedException {
        runDriver();
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(getEmail());
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(getPass());
        driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"version\"]")).isDisplayed());
        String buildId = driver.findElement(By.xpath("//*[@id=\"version\"]")).getText();
        driver.findElement(By.xpath("//*[@id=\"pricingManagement\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"packages\"]")).click();
        Thread.sleep(1000);

        /*
        add the new package
         */

        driver.findElement(By.xpath("//*[@id=\"addPackage\"]")).click(); // add package button
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/div/form/div/div/app-company-selection/form/div[1]/div/div/div/fieldset/label[1]\n")).click();  // choose Customer radio-btn
        actions.sendKeys(Keys.TAB).perform();
        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.RIGHT).perform();  // Account type -> Invoice Account
        }
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(1000);
        for (int i = 0; i < new Random().nextInt(20); i++) {
            actions.sendKeys(Keys.DOWN).perform();
        }
        actions.sendKeys(Keys.ENTER).perform(); // company name Satin
        actions.sendKeys(Keys.TAB).perform();
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.RIGHT).perform(); // period Annual
        }
        actions.sendKeys(Keys.TAB).perform();
        driver.findElement(By.id("periodStart")).click();
        actions.sendKeys(Keys.HOME).perform();
        String startDate = "0101200" + yearStart;     // Start date 01/01/201 + random
        actions.sendKeys(startDate).perform();
        actions.sendKeys(Keys.TAB).perform();
        driver.findElement(By.id("periodEnd")).click();
        actions.sendKeys(Keys.HOME).perform();
        String endYear = "311220" + yearEndFirst + yearEndSecond;  // End date 31/12/20 + random int + random int
        actions.sendKeys(endYear).perform();
        actions.sendKeys(Keys.TAB).perform();
        descriptionAndSearch = "Selenium automated package -> Invoice + " + new Random().nextInt();
        actions.sendKeys(descriptionAndSearch).perform();
        driver.findElement(By.xpath("/html/body/app-home/div/div/div[2]/app-package/app-package/app-package-dialog/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")).click();
        Thread.sleep(2000);

        /*
        find the last added package
         */
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/div/div/table/thead/tr/th[3]/a")).click(); // sort 1st
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/div/div/table/thead/tr/th[3]/a")).click(); // sort 2nd
        Thread.sleep(2000);

    }

    @AfterClass
    public void finishDriver() throws InterruptedException {
        String bodyText = driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[6]")).getText();
        Assert.assertTrue(bodyText.contains(descriptionAndSearch), descriptionAndSearch);
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/kendo-grid/div/kendo-grid-list/div/div[1]/table/tbody/tr[1]/td[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/div/div[2]/div/div[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gridPackageOverview\"]/app-action-dialog/kendo-dialog/div[2]/kendo-dialog-actions/button[1]")).click();
        Thread.sleep(1000);
        driver.close();
    }
}
