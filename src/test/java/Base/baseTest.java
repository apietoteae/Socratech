package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class baseTest {

    private WebDriver driver;
    protected HomePage homePage;

   // @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        //va a la URL y maximiza
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

    homePage = new HomePage(driver);

        //System.out.println(driver.getTitle());
        //Imprime por consola el título de la página

        //busca cuantos enlaces hay y me dice el numero
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());


        //entra en le input de la página
       //WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        //inputsLink.click();



    }

   // @AfterClass
    //public void teardown(){
      //  driver.quit();
    //}


   // public static void main(String args[]){
     //   baseTest test = new baseTest();
       // test.setUp();
    //}
}
