import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static WebDriver driver;
    public static void main(String[] args){
        FirstSeleniumTest firstSeleniumTest = new FirstSeleniumTest();


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        /*firstSeleniumTest.typeValue("username", "Selenium");

        firstSeleniumTest.typeValue("password", "Pass@123");
        */
        driver.findElement(By.name("username")).sendKeys("est");

    }

    public void typeValue(String value, String data){
        driver.findElement(By.name(value)).sendKeys(data);
    }

    //Write same program on https://www.saucedemo.com/
}
