package openGoogleAndEbay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenGoogleTest extends TestBase{


    @Test
public void searchJavaTest() throws InterruptedException {
        openSite("https://www.google.com");
        type(By.name("q"),"java" + Keys.ENTER );
        Thread.sleep(7000);
    }
    @Test
    public void clickIamFillingLucky(){
        // new Actions(driver).moveToElement(driver.findElement(By.name("btnI"))).click().perform();//navesti na element i potom kliknuti
        //driver.findElement(By.name("btnI")).click();
    }

}
