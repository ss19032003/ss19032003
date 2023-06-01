package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // Step 1. Set up the web driver

        WebDriverManager.chromedriver().setup();

        // Step 2.  create the instance of the chrome driver, create an object of ChromeDriverclass

        WebDriver driver = new ChromeDriver();

        // Step 3. Test if the driver is working, will open the browser with the given URL

        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getCurrentUrl();
        Thread.sleep(5000);

        String expectedTitle = "BJK";
        String actualtitle = driver.getTitle();
        String expectedUrl ="https://bjk.com./tr";
        String url = driver.getCurrentUrl();

        System.out.println(actualtitle);
        System.out.println(url);

        if (expectedTitle == actualtitle) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();



    }
}
