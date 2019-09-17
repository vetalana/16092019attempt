package wiki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest extends TestBase{
    WebDriver driver;
    @Test
    public void SearchWiki() throws InterruptedException {
        driver=new ChromeDriver();
        //open site:
        driver.get("https://en.wikipedia.org");
        //type word "Trafford":
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Trafford");
        driver.findElement(By.name("go")).click();
        //pause
        Thread.sleep(5000);
        //exit
        driver.quit();

    }

}

