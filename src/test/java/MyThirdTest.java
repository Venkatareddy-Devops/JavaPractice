import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyThirdTest {

    public static void main(String[] args) {
        MyThirdTest MyThirdTest= new MyThirdTest();
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.upgrad.com/blog/sample-selenium-projects-with-eclipse/");
        driver.findElement(By.name("user name")).sendKeys("venku");
        driver.findElement(By.name("password")).sendKeys("2345");


    }
}
