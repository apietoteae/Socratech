package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //elementos de homepage
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By inputsLink = By.linkText("inputs");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Acciones sobre Homepage
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

}
