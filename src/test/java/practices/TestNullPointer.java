package practices;

import org.openqa.selenium.WebDriver;

public class TestNullPointer {
    public int a=5;
    public static int b=9;
    public static WebDriver driver;
    public static void main(String[] args) {

        try {
            //WebDriver driver= null;
            driver.get("");
            System.out.println();
        }
        catch (NullPointerException np){
            np.printStackTrace();


        }
    }
}
