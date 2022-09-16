import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PeraBankTest {
    public static WebDriver driver;

    public static void main(String[] args) {
        PeraBankTest peraBankTest = null; // = new PeraBankTest();
        WebDriverManager.edgedriver().setup();
        //WebDriver driver= new EdgeDriver();
        driver.get("");
       // peraBankTest.test();

    }

    public void test(){
        System.out.println("Testing");
    }
}
