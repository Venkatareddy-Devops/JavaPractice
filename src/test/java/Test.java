import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.symmetric.TEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Test {
    public static void main(String[] args){
        Test test=new Test();
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.className("login")).click();
        driver.findElement(By.id("email")).sendKeys("siva8kolli@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("selenium");
        driver.findElement(By.name("SubmitLogin")).click();







    }





    }