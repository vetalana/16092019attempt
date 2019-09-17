package wiki;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiLogIn extends TestBase {

    @BeforeMethod
    public void preconditions() {
        openSite("https://en.wikipedia.org");
    }

    public void openSite(String url) {
        driver.get(url);
    }

    @Test
    public void wikiLogInTest() {


        click(By.id("pt-login"));

        type(By.id("wpName1"));

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("Aa123456789");

        click(By.id("wpLoginAttempt"));


    }

    public void type(By locator, String) {
        click(locator);
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("qwerty");
    }

    @AfterMethod
    public void afterLogIn(){
            openSite("https://en.wikipedia.org");
        }

}

