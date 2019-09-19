package openGoogleAndEbay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {
        driver.get(url);
    }

    public void clickConfirmLoginButton() {
        click(By.id("sgnBt"));
    }

    public void fillInLoginForm(String mail, String password) {
        type(By.id("userid"), mail);
        type(By.id("pass"), password);
    }

    public void initLogin() {
        click(By.id("gh-ug"));
    }
}
