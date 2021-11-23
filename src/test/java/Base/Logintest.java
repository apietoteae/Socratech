package Base;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static org.testng.Assert.assertTrue;

public class Logintest extends baseTest {

   // @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsernameField("tomsmith");
        loginPage.setPasswordFieldField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));
    }

}
