package wiki;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WikiLogIn extends TestBase {

    @Test
    public void wikiLogInTest() {
        //init login
        click(By.id("pt-login"));

        //fill login form
        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("qwerty");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("Aa123456789");

        //confirm login
        click(By.id("wpLoginAttempt"));


    }

}

