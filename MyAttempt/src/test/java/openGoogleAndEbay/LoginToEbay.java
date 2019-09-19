package openGoogleAndEbay;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void logInTest(){
        openSite("https://www.ebay.com");
        initLogin();
        fillInLoginForm("svetlana.portnaia@gmail.com", "123456789");
        clickConfirmLoginButton();
    }


}
