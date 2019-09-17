package wiki;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase {

    @Test
    public void SearchWikiTrafford() throws InterruptedException {

        //type word "Trafford":
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Trafford");

        //start search
        click(By.name("go"));

        //pause
        Thread.sleep(5000);
    }

    @Test
    public void searchWikiTestIMF() throws InterruptedException {
        //type word IMF
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("IMF");

        //start search
        click(By.name("go"));

        //pause
        Thread.sleep(5000);

        //exit
        driver.quit();
    }


}



