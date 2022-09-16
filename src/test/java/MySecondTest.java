import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MySecondTest {
    public static void main(String[] args) {
        MySecondTest mySecondTest=new MySecondTest();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.name("user-name")).sendKeys("reddy");
        driver.findElement(By.id("password")).sendKeys("1234");
    }
}
